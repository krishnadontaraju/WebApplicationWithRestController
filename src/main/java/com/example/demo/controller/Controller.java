package com.example.demo.controller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
public class Controller {

	
	@RequestMapping(value = {"/hg","/","/hello"})
	public String sayHello() {
		return "Said Hello";
	}
	
	
	
}
