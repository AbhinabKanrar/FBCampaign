package com.fbcamp.api;

import java.util.List;

import com.fbcamp.model.AdInsights;
import com.fbcamp.model.AdReportRun;
import com.fbcamp.model.Campaign;

public interface CampaignAPI {

	public List<Campaign> getCampaignList(String accessToken,Long accountId) throws Exception ;
	
	public AdInsights getCampaignInsights(String accessToken, Long campaignId, String startDate, String endDate)
			throws Exception;
	
	public AdReportRun getReport(String accessToken, Long campaignId, String startDate, String endDate)
			throws Exception;

}
