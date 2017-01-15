package com.fbcamp.api;

import java.util.List;
import java.util.Map;

public interface RestAPIParent {
	public String getFBLoginURL();

	public String getGraphStandardAPI();

	public String getFBGraphAccesTokenUrl(String code);

	public <T> List<T> callAPI(String accessToken, String restUrl, Class<T> cls, Map<String, Object> parametersMap)
			throws Exception;
	
}
