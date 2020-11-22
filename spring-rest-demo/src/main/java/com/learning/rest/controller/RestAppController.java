package com.learning.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Rest")
public class RestAppController {
	
	@GetMapping("/hello")
	public static String sayHello() {
		return "Hello Lucky,Welcome to the Rest world";
	}

}
