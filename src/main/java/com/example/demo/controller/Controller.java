package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.*;
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
	
	//Use case 3 to pass query as path variable
	@GetMapping("/param/{name}")
	public String sayHelloFromParameter(@PathVariable String name) {
		return " Hello " + name;
	}
	
	//Use case 4 to use post mapping to send query as json 
	@PostMapping("/posted")
	public String sayHello(@RequestBody User user) {
		return "Hello " + user.getFirstName() + " " + user.getLastName();
	}
	
}
