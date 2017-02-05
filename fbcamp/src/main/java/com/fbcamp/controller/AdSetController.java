package com.fbcamp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class AdSetController {
	@RequestMapping(value="/adset/{campaignId}/{campaignName}/{account_id}")
	public String adset(@PathVariable("campaignId") String campaignId,@PathVariable("account_id") String accountId,@PathVariable("campaignName") String campaignName,Model model) {
		System.out.println("I am here");
		return "adset";
	}
}
