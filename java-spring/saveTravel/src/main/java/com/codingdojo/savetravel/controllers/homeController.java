package com.codingdojo.savetravel.controllers;

import java.util.List;

import javax.validation.Valid;

//import---> command shift o 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.savetravel.models.Expense;
import com.codingdojo.savetravel.services.ExpenseService;


@Controller
public class homeController {
	//injecting out ExpenseService
	private final ExpenseService expenseService;
	
	public homeController(ExpenseService expenseService) {
		super();
		this.expenseService = expenseService;
	}


	//--------------------------------------------------------------------------------------
	//Route to show all expenses
	@GetMapping("/SaveTravel/expenses")
	public String home(Model model, @ModelAttribute("expense")Expense expense) {
		List<Expense> expenses = expenseService.allExpenses();
		
		model.addAttribute("allExpenses", expenses);
		return "index.jsp";
	}
	//--------------------------------------------------------------------------------------

	
	
	//--------------------------------------------------------------------------------------
	//Routes to add expense
	@PostMapping("/create")
	public String create(@Valid @ModelAttribute("expense") Expense expense, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Expense> expenses = expenseService.allExpenses();
			
			model.addAttribute("allExpenses", expenses);
			return "index.jsp";
		}else {
			expenseService.createExpense(expense);
			return "redirect:/SaveTravel/expenses";
		}
	}
	//--------------------------------------------------------------------------------------

	
	
	//--------------------------------------------------------------------------------------
	//Route to show one expense
	@GetMapping("/SaveTravel/expense/{id}")
	public String showOne(@PathVariable("id")Long id, Model model) {
		model.addAttribute("expense", expenseService.findExpense(id));
		return "showOne.jsp";
	}
	//--------------------------------------------------------------------------------------

	
	
	//--------------------------------------------------------------------------------------
	//Routes to update an expense
	@GetMapping("/SaveTravel/update/{id}")
	public String updateOne(@PathVariable("id")Long id, @ModelAttribute("expense")Expense expense, Model model) {
		model.addAttribute("expense", expenseService.findExpense(id));
		
		return "update.jsp";
	}
	
	
	@RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
	public String updating(@Valid @ModelAttribute("expense") Expense expense, BindingResult result) {
		if(result.hasErrors()) {
			return "update.jsp";
		}else {
			expenseService.updateExpense(expense);
			return "redirect:/SaveTravel/expenses";
		}
	}
	
	
	
	//--------------------------------------------------------------------------------------
	//Route to delete an expense
	@GetMapping("/delete/{id}")
	public String deleteOne(@PathVariable("id")Long id) {
		expenseService.delete(id);
		return "redirect:/SaveTravel/expenses";
	}
	

}
