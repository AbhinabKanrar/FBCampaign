package com.fbcamp.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.Version;


@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String dashboard(){
		System.out.println("I am here");
		return "dashboard";		
	}	
	
	@RequestMapping("/campaign")
	public String campaign(){
		System.out.println("I am here");
		return "campaign";		
	}	
}
