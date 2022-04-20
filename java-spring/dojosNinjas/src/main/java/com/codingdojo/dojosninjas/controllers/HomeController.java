package com.codingdojo.dojosninjas.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.dojosninjas.models.Dojo;
import com.codingdojo.dojosninjas.models.Ninja;
import com.codingdojo.dojosninjas.services.DojoService;
import com.codingdojo.dojosninjas.services.NinjaService;

@Controller
public class HomeController {

	private final DojoService dojoService;
	private final NinjaService ninjaService;
	
	public HomeController(DojoService dojoService, NinjaService ninjaService) {
		super();
		this.dojoService = dojoService;
		this.ninjaService = ninjaService;
	}


	@RequestMapping("/dashboard")
	public String home(Model model) {
		model.addAttribute("dojos", dojoService.findAll());
		return "index.jsp";
	}
	//--------------------------------------------------------------------
	
	
	
	//Dojos
	@RequestMapping("/dojo")
	public String newDojo(Model model, @ModelAttribute("dojo") Dojo dojo) {
		return "dojo.jsp";
	}

	@PostMapping("/create/dojo")
	public String creatingDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "dojo.jsp";
		}else {
			dojoService.createDojo(dojo);
			return "redirect:/ninja";
			
		}
	}
	//--------------------------------------------------------------------

	
	
	//shows all ninjas that belong to one dojo
	@RequestMapping("/oneDojo/{id}")
	public String dojoNinjas(Model model, @PathVariable(value="id")Long id) {
		Dojo dojo = dojoService.findDojo(id);
		
		model.addAttribute("dojo", dojo);
		return "oneDojo.jsp";
	}
	//--------------------------------------------------------------------

	
	
	

	//Ninjas
	@RequestMapping("/ninja")
	public String newNinja(Model model, @ModelAttribute("ninja") Ninja ninja) {
		model.addAttribute("dojos", dojoService.findAll());
		return "ninjas.jsp";	
	}
	
	
	@PostMapping("/create/ninja")
	public String createNinja(@Valid @ModelAttribute("ninja")Ninja ninja, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "ninjas.jsp";
		}else {
			ninjaService.createNinja(ninja);
			return "redirect:/dashboard";
		}
	}
	
	
	
	
	
}
