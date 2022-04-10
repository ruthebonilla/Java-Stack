package com.codingdojo.fruityloops.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.fruityloops.models.itemModel;

@Controller
public class itemController {

	
	@RequestMapping("/")
	public String index(Model model) {
		
		ArrayList<itemModel> fruits = new ArrayList<itemModel>();
        fruits.add(new itemModel("Kiwi", 1.5));
        fruits.add(new itemModel("Mango", 2.0));
        fruits.add(new itemModel("Goji Berries", 4.0));
        fruits.add(new itemModel("Guava", .75));
        
        // Add fruits your view model here
		model.addAttribute("fruits", fruits);
		
		return "index.jsp";
	}
}
