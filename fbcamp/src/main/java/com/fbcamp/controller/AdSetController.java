package com.fbcamp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class AdSetController {
	@RequestMapping("/adset")
	public String adset() {
		System.out.println("I am here");
		return "adset";
	}
}
