package com.example.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class MyController {
	
	
	@RequestMapping("/test")
	private String test() {
		return "<h2>Hello World Spring-Rest services started....</h2>";
	}

}
