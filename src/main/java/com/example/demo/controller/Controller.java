package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
public class Controller {

	//Use case one to simply add mapping
	@RequestMapping(value = {"/hg","/","/hello"})
	public String sayHello() {
		return "Said Hello";
	}
	
	//Use case 2 to add query as parameter
	@RequestMapping(value = {"/query"} , method = RequestMethod.GET )
	public String sayHello(@RequestParam(value = "name") String name) {
		return "Hello " + name ;
		
	}
	
}
