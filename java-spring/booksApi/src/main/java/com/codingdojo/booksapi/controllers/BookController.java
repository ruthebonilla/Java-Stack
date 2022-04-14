package com.codingdojo.booksapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.booksapi.models.Book;
import com.codingdojo.booksapi.services.BookService;

@Controller
public class BookController {

	
	@Autowired
	BookService bookService;
	
	
	@RequestMapping("/books")
	public String index(Model model) {
		List<Book> books = bookService.allBooks();
		model.addAttribute("allBooks", books);
		return "index.jsp";
	}
	
	
	
	@RequestMapping("/books/{bookId}")
	public String index(Model model, @PathVariable("bookId")Long bookId) {
		
		Book book = bookService.findBook(bookId);
		
		model.addAttribute("book", book);
		return "oneBook.jsp";
	}
	
	
	
	
	
}
