package com.fbcamp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class AdBreakController {
	@RequestMapping("/adBreak")
	public String adBreak() {
		System.out.println("I am here");
		return "adBreak";
	}
}
