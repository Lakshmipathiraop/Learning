package com.learning.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Rest")
public class RestAppController {
	
	@GetMapping("/hello")
	public static String sayHello() {
		System.out.println("THis is new commit done in master branch which is not in feature branch");
		System.out.println("This is the commit that iam doing in feature branch after rebase");
		return "Hello Lucky,Welcome to the Rest world";
		
	}

}
