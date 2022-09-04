package com.example.rest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.builder.SpringApplicationBuilder;

import com.example.rest.controller.MyController;

public class TestController {

	MyController myController = new MyController();
	ServletInitializer obj = new ServletInitializer();

	@Test
	public void test() {
		final String[] STRING_ARRAY = { "test", "test123" };

		myController.test();
		myController.getName("test");
		SimpleRestApplication.main(STRING_ARRAY);
	}

	@Test
	public void test2() {
		obj.configure(new SpringApplicationBuilder());
	}
}