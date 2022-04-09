package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {

	@RequestMapping("/")
	public String home(@RequestParam(value="name", required=false) String searchQuery, @RequestParam(value="last_name", required=false)String searchQueryLastName) {
		if(searchQuery == null) {
			return "Hello Human";
		} else {
			return "hello: " + searchQuery + " " + searchQueryLastName;
		}
	
	
	}
}
