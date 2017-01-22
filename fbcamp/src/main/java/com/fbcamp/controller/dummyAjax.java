package com.fbcamp.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
@RestController
public class dummyAjax {

	@RequestMapping("/ajax")
	public String home(){
			
		return "Das boot , Reporting for duty";
	}
}