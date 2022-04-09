package com.codingdojo.daikichipathvariables;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/daikichi")
public class HomeController {
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
	
	
	
//	ROUTES WITH PATH VARIABLES
	
	@RequestMapping("/travel/{location}")
	public String travel(@PathVariable("location")String location) {
		
		return "Congratulations! You will soon travel to " + location;
	}
	
	@RequestMapping("/lotto/{integer}")
	public String lotto(@PathVariable("integer")String integer) {
		int num = Integer.parseInt(integer);
		if (num % 2 == 0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers";
			
		}else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends";
		}
	}

}
