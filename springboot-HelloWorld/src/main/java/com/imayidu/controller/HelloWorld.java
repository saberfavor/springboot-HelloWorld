package com.imayidu.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@RequestMapping("/index")
	public String index() {
		int x = 1/0;
		return "index";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HelloWorld.class, args);
	}
}
