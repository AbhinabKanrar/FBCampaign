package com.fbcamp.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class CampaignController {
	@RequestMapping("/campaign")
	public String campaign() {
		System.out.println("I am here");
		return "campaign";
	}

}
