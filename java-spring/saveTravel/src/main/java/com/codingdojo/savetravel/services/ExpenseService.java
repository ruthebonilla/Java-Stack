package com.codingdojo.savetravel.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.savetravel.models.Expense;
import com.codingdojo.savetravel.repositories.ExpenseRepository;

@Service
public class ExpenseService {
	
	private final ExpenseRepository expenseRepo;
	
	public ExpenseService(ExpenseRepository expenseRepo) {
		this.expenseRepo = expenseRepo;
	}
	

	//-------------------------------------------------------------------------
	//Find all expenses from repository
	public List<Expense> allExpenses() {
		return expenseRepo.findAll();
	}
	//-------------------------------------------------------------------------

	
	
	//-------------------------------------------------------------------------
	//Create an expense from repository
	public Expense createExpense(Expense expense) {
		return expenseRepo.save(expense);
	}
	//-------------------------------------------------------------------------

	
	
	//-------------------------------------------------------------------------
	//Find one expense from repository
	public Expense findExpense(Long id) {
        Optional<Expense> optionalExpense = expenseRepo.findById(id);
        
        if(optionalExpense.isPresent()) {
        	return optionalExpense.get();
        }else {
        	return null;
        }
	}
	//-------------------------------------------------------------------------

	
	
	//-------------------------------------------------------------------------
	//Update an expense from repository
	public Expense updateExpense(Expense expense) {
		return expenseRepo.save(expense);
	}
	//-------------------------------------------------------------------------

	
	
	//-------------------------------------------------------------------------
	//Delete an expense from repository
	public void delete(Long id) {
		expenseRepo.deleteById(id);
	}
	//-------------------------------------------------------------------------

}
