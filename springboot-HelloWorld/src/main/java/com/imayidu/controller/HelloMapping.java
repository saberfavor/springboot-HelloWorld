package com.imayidu.controller;

import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloMapping {
	
	@RequestMapping("/state")
	public HashMap<String, Object> state(){
		HashMap<String, Object> result = new HashMap<String, Object>();
		result.put("code", "400");
		result.put("state", "success");
		return result;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HelloMapping.class, args);
	}
}
