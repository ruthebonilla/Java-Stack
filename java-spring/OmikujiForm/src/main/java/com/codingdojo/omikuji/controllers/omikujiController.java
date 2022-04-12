package com.codingdojo.omikuji.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class omikujiController {
	@RequestMapping("/omikuji")
	public String home() {
		return "home.jsp";
	}
	
	
	@RequestMapping("/home")
	public String backHome(Model model, HttpSession session) {
			
		return "redirect:/omikuji";
	}
	
	
	
//	this is the action when submitted
	@RequestMapping(value="/display", method=RequestMethod.POST)
	public String show(@RequestParam(value="number")String number,
			@RequestParam(value="city")String city, 
			@RequestParam(value="name")String name,
		    @RequestParam(value="hobby")String hobby,
		    @RequestParam(value="livingThing")String livingThing,
			@RequestParam(value="niceMessage")String niceMessage, Model model, HttpSession session) {
		
		session.setAttribute("number", number);
		session.setAttribute("city", city);
		session.setAttribute("name", name);
		session.setAttribute("hobby", hobby);
		session.setAttribute("livingThing", livingThing);
		session.setAttribute("niceMessage", niceMessage);
		
		
		return "redirect:/show";
		
	
	}
	
//	this is what displays on page
	@RequestMapping("/show")
	public String showResults(HttpSession session, Model model) {
		
		model.addAttribute("numberToJSP",session.getAttribute("number"));
		model.addAttribute("cityToJSP", session.getAttribute("city"));
		model.addAttribute("nameToJSP", session.getAttribute("name"));
		model.addAttribute("hobbyToJSP", session.getAttribute("hobby"));
		model.addAttribute("livingThingToJSP", session.getAttribute("livingThing"));
		model.addAttribute("niceMessageToJSP", session.getAttribute("niceMessage"));
		
		return "display.jsp";
	}
	

	
	
}
