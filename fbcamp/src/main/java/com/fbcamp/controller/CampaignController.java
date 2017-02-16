package com.fbcamp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class CampaignController {
	@RequestMapping(value="/campaign/{campaignId}/{campaignName}/{account_id}")
	public String campaign(@PathVariable("campaignId") String campaignId,@PathVariable("account_id") String accountId,@PathVariable("campaignName") String campaignName,Model model) {
		model.addAttribute("campaignId",campaignId);
		model.addAttribute("accountId",accountId);
		model.addAttribute("campaignName",campaignName);
		System.out.println(campaignId);
	    return "campaign";
	}

}
