package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class homeController {
	@RequestMapping("")
	public String greeting() {
		return "Welcome!";
	}
	
	@RequestMapping("/today")
	public String blessing1() {
		return "Today, something important you lost will turn up.";
	}
	
	@RequestMapping("/tomorrow")
	public String blessing2() {
		return "Tomorrow, a new opportunity will arise";
	}

}
