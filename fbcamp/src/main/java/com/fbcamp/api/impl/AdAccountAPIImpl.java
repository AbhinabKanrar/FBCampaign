package com.fbcamp.api.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fbcamp.api.AdAccountAPI;
import com.fbcamp.model.AdAccount;
import com.fbcamp.model.AdInsights;

public class AdAccountAPIImpl extends RestAPIParentImpl implements AdAccountAPI {
	private String adaccountRestUrl = "me/adaccounts";
	private String adaccountInsightUrl = "act_<ad_account_id>/insights";
	private String adaccountFields = "id,account_id,name";
	private String adaccountInsightFields = "account_id,account_name,spend,clicks,total_action_value,total_actions,inline_link_clicks";
	private String timeRange = "{\"since\":\"<start_time>\",\"until\":\"<end_time>\"}";
	Map<String, Object> adaccountParameters;
	Map<String, Object> adaccountInsightsParameters;

	public AdAccountAPIImpl() {
		adaccountParameters = new HashMap<String, Object>();
		adaccountParameters.put("fields", adaccountFields);
		adaccountInsightsParameters = new HashMap<String, Object>();
		adaccountInsightsParameters.put("fields", adaccountInsightFields);
		adaccountInsightsParameters.put("time_range", timeRange);
		adaccountInsightsParameters.put("level", "account");
	}

	@Override
	public List<AdAccount> getAdAccountList(String accessToken) throws Exception {
		return callAPI(accessToken, adaccountRestUrl, AdAccount.class, adaccountParameters);
	}

	public static void main(String[] args) {
		String accessToken = "EAAGPpGSsCToBAOeNwyZCr2cQxb4yrj0EjEBFXlxlTorlPvHhYIvnWqirpkx8bOlPtwXUIuTefuPxejpHbzL4CZBr9mPXi9P6pZCoNVDEZAWUslAG0uA9JVPpchWCAQxblggZBQEXci3CAhRZC44wuQIUnylb1awZAAZD";
		AdAccountAPIImpl adAccountAPIImpl = new AdAccountAPIImpl();
		try {

			List<AdAccount> adAccounts = adAccountAPIImpl.getAdAccountList(accessToken);
			adAccounts.forEach(System.out::println);

			AdInsights adInsights = adAccountAPIImpl.getAdAccountInsights(accessToken, 1584952255132965L, "2016-12-16",
					"2017-01-14");
			System.out.println(adInsights);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public AdInsights getAdAccountInsights(String accessToken, Long accountId, String startDate, String endDate)
			throws Exception {
		adaccountInsightsParameters.put("time_range",
				timeRange.replace("<start_time>", startDate).replace("<end_time>", endDate));
		List<AdInsights> adInsights = callAPI(accessToken,
				adaccountInsightUrl.replace("<ad_account_id>", accountId.toString()), AdInsights.class,
				adaccountInsightsParameters);
		if (null == adInsights || adInsights.isEmpty()) {
			return null;
		}
		return adInsights.get(0);
	}
}
