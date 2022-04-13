package com.codingdojo.booksapi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codingdojo.booksapi.models.Book;
import com.codingdojo.booksapi.services.BookService;



@RestController
public class HomeController {

	
    private final BookService bookService;
    public HomeController(BookService bookService){
        this.bookService = bookService;
    }
    
    //Method to find all the books 
    @RequestMapping("/api/books")
    public List<Book> index() {
    	//return the call to the BookService method called allBooks
        return bookService.allBooks();
        
    }
    
    
    //creates a book
    @RequestMapping(value="/api/books", method=RequestMethod.POST)
    public Book create(
    	@RequestParam(value="title") String title, 
    	@RequestParam(value="description") String desc, 
    	@RequestParam(value="language") String lang, 
    	@RequestParam(value="pages") Integer numOfPages) {
        
    	Book book = new Book(title, desc, lang, numOfPages);
        return bookService.createBook(book);
    }
    
    
    //grabs book by id
    @RequestMapping("/api/books/{id}")
    public Book show(@PathVariable("id") Long id) {
        Book book = bookService.findBook(id);
        return book;
    }
    
    
    //updates book
    @RequestMapping(value="/api/books/update/{id}", method=RequestMethod.PUT)
    public Book update(
    		@PathVariable("id") Long id, 
    		@RequestParam(value="title") String title, 
    		@RequestParam(value="description") String desc, 
    		@RequestParam(value="language") String lang,
    		@RequestParam(value="pages") Integer numOfPages) {
    	
        Book book = new Book (title, desc, lang, numOfPages);
        book.setId(id);
        book = bookService.updateBook(book);
        return book;
    }
    
    
    //deletes a book
    @RequestMapping(value="/api/books/delete/{id}", method=RequestMethod.DELETE)
    public void destroy(@PathVariable("id") Long id) {
        bookService.deleteBook(id);
    }
    
}
