package com.fbcamp.api.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fbcamp.api.RestAPIParent;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.Version;

public class RestAPIParentImpl implements RestAPIParent {
	public static final String FB_APP_ID = "439411203115322";
	public static final String FB_APP_SECRET = "e9a4c254e3cb09a7ce571f6c36cdc238";
	public static final String REDIRECT_URI = "http://localhost:8080/Facebook_Login/fbhome";
	public static final String GRAPH_BASIC_API = "https://graph.facebook.com/";
	public static final String GRAPH_API_VERSION = "2.8";

	public RestAPIParentImpl() {
	}

	public String getFBLoginURL() {
		String fbLoginURL = "";
		try {
			fbLoginURL = "http://www.facebook.com/dialog/oauth?" + "client_id=" + FB_APP_ID + "&redirect_uri="
					+ URLEncoder.encode(REDIRECT_URI, "UTF-8") + "scope=ads_management+business_management";
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return fbLoginURL;
	}

	public String getGraphStandardAPI() {
		return GRAPH_BASIC_API + GRAPH_API_VERSION + "/me/";
	}

	public String getFBGraphAccesTokenUrl(String code) {
		String fbGraphUrl = "";
		try {
			fbGraphUrl = "https://graph.facebook.com/oauth/access_token?" + "client_id=" + FB_APP_ID + "&redirect_uri="
					+ URLEncoder.encode(REDIRECT_URI, "UTF-8") + "&client_secret=" + FB_APP_SECRET + "&code=" + code;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return fbGraphUrl;
	}

	public <T> List<T> callAPI(String accessToken, String restUrl, Class<T> cls, Map<String, Object> parametersMap)
			throws Exception {
		String response = null;
		FacebookClient facebookClient = new DefaultFacebookClient(accessToken, Version.VERSION_2_8);
		if (null == parametersMap || parametersMap.isEmpty()) {
			response = facebookClient.fetchObject(restUrl, String.class);
		} else {
			Parameter[] parameters = new Parameter[parametersMap.size()];
			int i = 0;
			for (String parameterName : parametersMap.keySet()) {
				parameters[i] = Parameter.with(parameterName, parametersMap.get(parameterName));
				i++;
			}
			response = facebookClient.fetchObject(restUrl, String.class, parameters);			
		}
		JsonParser jsonParser = new JsonParser();
		JsonArray arr;
		JsonObject obj;
		List<T> dataList = new ArrayList<T>();
		try {
			JsonElement result = jsonParser.parse(response.toString());
			Gson gson = new Gson();
			if (result.isJsonArray()) {
				// First, check if it's a pure JSON Array
				arr = result.getAsJsonArray();
				for (int i = 0; i < arr.size(); i++) {
					dataList.add(gson.fromJson(arr.get(i).getAsJsonObject().toString(), cls));
				}
				return dataList;
			} else if (result.isJsonObject()) {
				obj = result.getAsJsonObject();
				if (obj.has("data")) {
					if (obj.get("data").isJsonArray()) {
						// Second, check if it's a JSON array with "data"
						arr = obj.get("data").getAsJsonArray();
						for (int i = 0; i < arr.size(); i++) {
							dataList.add(gson.fromJson(arr.get(i).getAsJsonObject().toString(), cls));
						}
						;
					} else if (obj.get("data").isJsonObject()) {
						// Third, check if it's a JSON object with "data"
						obj = obj.get("data").getAsJsonObject();
						dataList.add(gson.fromJson(obj.toString(), cls));
					}
					return dataList;
				} /*
					 * else if (obj.has("images")) { // Fourth, check if it's a
					 * map of image objects obj =
					 * obj.get("images").getAsJsonObject(); for
					 * (Map.Entry<String, JsonElement> entry : obj.entrySet()) {
					 * nodes.add(loadJSON(entry.getValue().toString(),
					 * context)); } return nodes; }
					 */else {
					// Fifth, check if it's an array of objects indexed by id
					boolean isIdIndexedArray = true;
					for (Map.Entry entry : obj.entrySet()) {
						String key = (String) entry.getKey();
						if (key.equals("__fb_trace_id__")) {
							continue;
						}
						JsonElement value = (JsonElement) entry.getValue();
						if (value != null && value.isJsonObject() && value.getAsJsonObject().has("id")
								&& value.getAsJsonObject().get("id") != null
								&& value.getAsJsonObject().get("id").getAsString().equals(key)) {
							dataList.add(gson.fromJson(value.toString(), cls));
						} else {
							isIdIndexedArray = false;
							break;
						}
					}
					if (isIdIndexedArray) {
						return dataList;
					}

					// Sixth, check if it's pure JsonObject
					dataList.clear();
					dataList.add(gson.fromJson(response, cls));
					return dataList;
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		throw new Exception("Invalid response string: " + response);

	}

	public <T> List<T> postAPI(String accessToken, String restUrl, Class<T> cls, Map<String, Object> parametersMap)
			throws Exception {
		String response = null;
		FacebookClient facebookClient = new DefaultFacebookClient(accessToken, Version.VERSION_2_8);
		if (null == parametersMap || parametersMap.isEmpty()) {
			response = facebookClient.publish(restUrl, String.class);
		} else {
			Parameter[] parameters = new Parameter[parametersMap.size()];
			int i = 0;
			for (String parameterName : parametersMap.keySet()) {
				parameters[i] = Parameter.with(parameterName, parametersMap.get(parameterName));
				i++;
			}
			response = facebookClient.publish(restUrl, String.class, parameters);
		}
		JsonParser jsonParser = new JsonParser();
		JsonArray arr;
		JsonObject obj;
		List<T> dataList = new ArrayList<T>();
		try {
			JsonElement result = jsonParser.parse(response.toString());
			Gson gson = new Gson();
			if (result.isJsonArray()) {
				// First, check if it's a pure JSON Array
				arr = result.getAsJsonArray();
				for (int i = 0; i < arr.size(); i++) {
					dataList.add(gson.fromJson(arr.get(i).getAsJsonObject().toString(), cls));
				}
				return dataList;
			} else if (result.isJsonObject()) {
				obj = result.getAsJsonObject();
				if (obj.has("data")) {
					if (obj.get("data").isJsonArray()) {
						// Second, check if it's a JSON array with "data"
						arr = obj.get("data").getAsJsonArray();
						for (int i = 0; i < arr.size(); i++) {
							dataList.add(gson.fromJson(arr.get(i).getAsJsonObject().toString(), cls));
						}
						;
					} else if (obj.get("data").isJsonObject()) {
						// Third, check if it's a JSON object with "data"
						obj = obj.get("data").getAsJsonObject();
						dataList.add(gson.fromJson(obj.toString(), cls));
					}
					return dataList;
				} /*
					 * else if (obj.has("images")) { // Fourth, check if it's a
					 * map of image objects obj =
					 * obj.get("images").getAsJsonObject(); for
					 * (Map.Entry<String, JsonElement> entry : obj.entrySet()) {
					 * nodes.add(loadJSON(entry.getValue().toString(),
					 * context)); } return nodes; }
					 */else {
					// Fifth, check if it's an array of objects indexed by id
					boolean isIdIndexedArray = true;
					for (Map.Entry entry : obj.entrySet()) {
						String key = (String) entry.getKey();
						if (key.equals("__fb_trace_id__")) {
							continue;
						}
						JsonElement value = (JsonElement) entry.getValue();
						if (value != null && value.isJsonObject() && value.getAsJsonObject().has("id")
								&& value.getAsJsonObject().get("id") != null
								&& value.getAsJsonObject().get("id").getAsString().equals(key)) {
							dataList.add(gson.fromJson(value.toString(), cls));
						} else {
							isIdIndexedArray = false;
							break;
						}
					}
					if (isIdIndexedArray) {
						return dataList;
					}

					// Sixth, check if it's pure JsonObject
					dataList.clear();
					dataList.add(gson.fromJson(response, cls));
					return dataList;
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		throw new Exception("Invalid response string: " + response);

	}

	public void callDirectAPI(String apiUrl) {
		URL url;

		try {
			url = new URL(apiUrl);
		} catch (MalformedURLException e) {
			e.printStackTrace();
			throw new RuntimeException("Invalid code received " + e);
		}
		URLConnection fbConnection;
		StringBuffer response = null;
		try {
			fbConnection = url.openConnection();
			BufferedReader in;
			in = new BufferedReader(new InputStreamReader(fbConnection.getInputStream()));
			String inputLine;
			response = new StringBuffer();
			while ((inputLine = in.readLine()) != null)
				response.append(inputLine + "\n");
			in.close();
			FileWriter fw = null;
			BufferedWriter bw = null;

			try {
				String FILENAME = "D:\\ABC.xls";

				fw = new FileWriter(FILENAME);
				bw = new BufferedWriter(fw);
				bw.write(response.toString());

				System.out.println("Done");

			} catch (IOException e) {

				e.printStackTrace();

			} finally {

				try {

					if (bw != null)
						bw.close();

					if (fw != null)
						fw.close();

				} catch (IOException ex) {

					ex.printStackTrace();

				}
			}

		} catch (Exception e) {
		}

	}
}
