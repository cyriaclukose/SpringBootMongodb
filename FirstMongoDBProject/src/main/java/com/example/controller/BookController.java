package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Book;
import com.example.repository.BookRepository;

@RestController
public class BookController {
	
	
	
	//create
	//find
	//find all
	//delete
	
	
	private final BookRepository bookrepo;
	
	@Autowired
	BookController(BookRepository repo)
	{
		this.bookrepo=repo;
	}
	
	
	/**|
	 * we are using crud repository save method
	 * @param book
	 * @return
	 */
	@PostMapping("/books")
	public String createBook(@RequestBody Book book)
	{
		bookrepo.save(book);
		return "book created for the id : "+book.getId();
	}
	
	/**
	 * get all using findAll method of mongoRepository
	 * @return
	 */
	@GetMapping("/books")
	public List<Book> getAllBooks()
	{
		
		return bookrepo.findAll();
	}
	
	/**
	 * use the crud repository method
	 * @param id
	 * @return
	 */
	@GetMapping("/books/{id}")
	public Optional<Book> getBook(@PathVariable int id)
	{
		return bookrepo.findById(id);
	}
	
	/**
	 * crud repository deleteById method is used
	 * @param id
	 * @return
	 */
	@DeleteMapping("/books/{id}")
	
	public String deleteBook(@PathVariable int id)
		
	{
	  bookrepo.deleteById(id);
	  
	  return "book deleted for id :"+id;
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
