package com.fbcamp.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.fbcamp.api.AdAccountAPI;
import com.fbcamp.api.CampaignAPI;
import com.fbcamp.api.impl.AdAccountAPIImpl;
import com.fbcamp.api.impl.CampaignAPIImpl;
import com.fbcamp.model.AdAccount;
import com.fbcamp.model.AdInsight;
import com.fbcamp.model.Campaign;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

@Controller
public class DashBoardController {

	private String accessToken = "EAAGPpGSsCToBAAsZABFxlRAZAMNNtym9pXbIY5MsolZClZBiPNSzTbVVgAwCBpfNtRdl46JFdOttnFtYWniJL1ZCp9nwsmCHzZCYo5utgxZAaT19f0ZAyGDjSp7wguxKF2FidwxRrYp5fZBdwbHTpOJiR5ePzroGP3UZAyrSB3RRL91QZDZD";

	@RequestMapping("/")
	public String dashboard(@ModelAttribute("model") ModelMap model) {
		try {
			// All AdAccounts
			List<AdAccount> adAccounts = getAdAccounts();
			model.addAttribute("adAccount", adAccounts);

			// All AdAccounts AdInsights
			List<AdInsight> accountInsights = new ArrayList<>();

			for (AdAccount adAccount : adAccounts) {
				AdInsight adInsight = getAdAccountInsight(Long.parseLong(adAccount.getmAccountId()), "2016-12-16",
						"2017-01-14");
				accountInsights.add(adInsight);
				
			}

			model.addAttribute("accountInsights", accountInsights);
			
			
			

			// Mapping adAccount with Campaigns
			CampaignAPI campaignAPI = new CampaignAPIImpl();
			List<Campaign> campaigns = new ArrayList();
			
			// Mapping campaigns with AdInsights
			List<AdInsight> campaignInsight =  new ArrayList();

			
			for (AdAccount adAccount : adAccounts) {
				campaigns.addAll(campaignAPI.getCampaignList(accessToken, Long.parseLong(adAccount.getmAccountId())));						
			}
			
			campaigns.forEach(campaign->{
				AdInsight adInsight=null;
				try {
					adInsight = campaignAPI.getCampaignInsights(accessToken, Long.parseLong(campaign.getmId()),
							"2016-12-16", "2017-01-14");
				} catch (Exception e) {						
					e.printStackTrace();
				}
				campaignInsight.add(adInsight);
			});		
			
				
			
			model.addAttribute("campaigns", campaigns);
			
			model.addAttribute("campaignInsight", campaignInsight);
			
//			campaignInsightMap.forEach((key, value) -> {
//			    System.out.println("Key : " + key + " Value : " + value);
//			});
//			Gson gson = new Gson();
//			
//			String serialized = gson.toJson(campaignInsightMap);
//			System.out.println("##########################"+serialized);
			
			
			

			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "dashboard";
	}

	public AdInsight getAdAccountInsight(Long accountId, String startDate, String endDate) {

		AdAccountAPI adAccountAPI = new AdAccountAPIImpl();
		AdInsight adInsight = null;
		try {
			adInsight = adAccountAPI.getAdAccountInsight(accessToken, accountId, startDate, endDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return adInsight;
	}

	private List<AdAccount> getAdAccounts() {

		AdAccountAPI adAccountAPI = new AdAccountAPIImpl();
		List<AdAccount> adAccounts = null;
		try {
			adAccounts = adAccountAPI.getAdAccountList(accessToken);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return adAccounts;
	}

}
