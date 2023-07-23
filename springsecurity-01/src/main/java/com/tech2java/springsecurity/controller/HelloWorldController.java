package com.tech2java.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/hello")
	public String helloMessage() {
		
		return "Hello, Welcome to Spring Security!";
	}
}
