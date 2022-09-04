package com.example.rest.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring")
public class MyController {

	@RequestMapping("/test")
	public String test() {
		return "<h3>Hello Spring Rest services started.</h3>"
				+ "<br/>"
				+ "Please enter any name in the URL after <b> /test </b>";
	}

	@RequestMapping("/test/{name}")
	public String getName(@PathVariable("name") String name) {
		String msg = "Welcome <b>" + name + "</b>. Have a Good Day!!";
		return msg;
	}
}