package com.fbcamp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class AdSetController {
	@RequestMapping(value="/adset/{campaignId}/{campaignName}/{account_id}")
	public String adset(@PathVariable("campaignId") String campaignId,@PathVariable("campaignName") String campaignName,@PathVariable("account_id") String accountId,Model model) {
		model.addAttribute("campaignId",campaignId);
		model.addAttribute("accountId",accountId);
		model.addAttribute("campaignName",campaignName);
		System.out.println(campaignId);
		System.out.println(campaignName);
	   	return "adset";
	}
}
