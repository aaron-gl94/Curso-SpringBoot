package com.api.firstapi;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class TestController {
	
	@GetMapping
	public String firstRun() {		
		return "My first Spring Boot API!";
	}
	
	@GetMapping("/hello")
	public String hello() {		
		return "Hello world!";
	}
	
	@GetMapping("/bye")
	public String bye() {		
		return "Bye world!";
	}
}