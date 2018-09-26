package com.imayidu.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan("com.imayidu.controller")
public class AppRun {
	
	public static void main(String[] args) {
		SpringApplication.run(AppRun.class, args);
	}
	
}
