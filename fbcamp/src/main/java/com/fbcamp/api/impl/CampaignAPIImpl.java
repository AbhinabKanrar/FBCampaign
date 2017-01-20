package com.fbcamp.api.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fbcamp.api.CampaignAPI;
import com.fbcamp.model.AdInsight;
import com.fbcamp.model.AdReportRun;
import com.fbcamp.model.Campaign;

public class CampaignAPIImpl extends RestAPIParentImpl implements CampaignAPI {
	private String campaignRestUrl = "act_<ad_account_id>/campaigns";
	private String campaignInsightUrl = "<campaign_id>/insights";
	private String campaignReportRunUrl = "<report_run_id>";
	private String campaignFields = "id,account_id,name,objective";
	private String campaignInsightFields = "account_id,account_name,spend,clicks,total_action_value,call_to_action_clicks";
	private String reportRunFields = "id,account_id,async_status,async_percent_completion";
	private String timeRange = "{\"since\":\"<start_time>\",\"until\":\"<end_time>\"}";
	Map<String, Object> campaignParameters;
	Map<String, Object> campaignInsightsParameters;
	Map<String, Object> reportRunParameters;
	Map<String, Object> reportRunParameters1;

	public CampaignAPIImpl() {
		campaignParameters = new HashMap<String, Object>();
		campaignParameters.put("fields", campaignFields);
		campaignInsightsParameters = new HashMap<String, Object>();
		campaignInsightsParameters.put("fields", campaignInsightFields);
		campaignInsightsParameters.put("time_range", timeRange);
		campaignInsightsParameters.put("time_increment", 1);
		campaignInsightsParameters.put("export_format", "csv");
		reportRunParameters = new HashMap<String, Object>();
		// reportRunParameters.put("fields", reportRunFields);
		reportRunParameters.put("time_range", timeRange);
		reportRunParameters.put("time_increment", 1);
		reportRunParameters.put("export_format", "xls");
		reportRunParameters.put("level", "campaign");
		reportRunParameters1 = new HashMap<String, Object>();
		reportRunParameters1.put("fields", reportRunFields);
	}

	@Override
	public List<Campaign> getCampaignList(String accessToken, Long accountId) throws Exception {
		return callAPI(accessToken, campaignRestUrl.replace("<ad_account_id>", accountId.toString()), Campaign.class,
				campaignParameters);
	}

	@Override
	public AdInsight getCampaignInsights(String accessToken, Long campaignId, String startDate, String endDate)
			throws Exception {
		campaignInsightsParameters.put("time_range",
				timeRange.replace("<start_time>", startDate).replace("<end_time>", endDate));
		List<AdInsight> adInsights = callAPI(accessToken,
				campaignInsightUrl.replace("<campaign_id>", campaignId.toString()), AdInsight.class,
				campaignInsightsParameters);
		if (null == adInsights || adInsights.isEmpty()) {
			return null;
		}
		return adInsights.get(0);
	}

	@Override
	public AdReportRun getReport(String accessToken, Long campaignId, String startDate, String endDate)
			throws Exception {
		reportRunParameters.put("time_range",
				timeRange.replace("<start_time>", startDate).replace("<end_time>", endDate));
		List<AdReportRun> adReportRuns = postAPI(accessToken,
				campaignInsightUrl.replace("<campaign_id>", campaignId.toString()), AdReportRun.class,
				reportRunParameters);

		if (null == adReportRuns || adReportRuns.isEmpty()) {
			return null;
		}
		AdReportRun adReportRun = adReportRuns.get(0);
		adReportRuns = callAPI(
				accessToken, campaignReportRunUrl.replace("<campaign_id>", campaignId.toString())
						.replace("<report_run_id>", adReportRun.getmReportRunID().toString()),
				AdReportRun.class, reportRunParameters1);
		while (adReportRuns.get(0).getmAsyncPercentCompletion() != 100) {
			Thread.sleep(3000);
			adReportRuns = callAPI(
					accessToken, campaignReportRunUrl.replace("<campaign_id>", campaignId.toString())
							.replace("<report_run_id>", adReportRun.getmReportRunID().toString()),
					AdReportRun.class, reportRunParameters1);
		}
		callDirectAPI("https://www.facebook.com/ads/ads_insights/export_report/?access_token=" + accessToken
				+ "&report_run_id=" + adReportRuns.get(0).getmId() + "&name=myreport&format=csv");
		return adReportRuns.get(0);
	}

	public static void main(String[] args) {
		String accessToken = "EAAGPpGSsCToBAAsZABFxlRAZAMNNtym9pXbIY5MsolZClZBiPNSzTbVVgAwCBpfNtRdl46JFdOttnFtYWniJL1ZCp9nwsmCHzZCYo5utgxZAaT19f0ZAyGDjSp7wguxKF2FidwxRrYp5fZBdwbHTpOJiR5ePzroGP3UZAyrSB3RRL91QZDZD";
		CampaignAPIImpl adAccountAPIImpl = new CampaignAPIImpl();
		try {

			
			 List<Campaign> campaigns =
			 adAccountAPIImpl.getCampaignList(accessToken,1584952255132965L);
	 
			 
			 
			 for(Campaign campaign:campaigns){
				 System.out.println(campaign);
				 AdInsight adInsights = adAccountAPIImpl.getCampaignInsights(accessToken,
						 Long.parseLong(campaign.getmId()), "2016-12-16","2017-01-14");
						 System.out.println(adInsights);
			 }
			
			 


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
