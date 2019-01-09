package com.hellokoding.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.hellokoding.restfulapi.model.Book;
import com.hellokoding.restfulapi.repository.BookRepository;
@RestController
public class bookController {
	@Autowired 
	private BookRepository  bookRepository;
@GetMapping("/boks")	 
public List<Book> getAllBook(){
	 return  bookRepository.findAll();
 }
@GetMapping("/boks/{id}")
public Book getBook(@PathVariable Long id) {
	  return  bookRepository.findOne(id);
}

@PostMapping("/boks")
public Book createBooks(@RequestBody Book book) {
	return  bookRepository.save(book);
}
@PutMapping("/boks")
public Book upDateBooks(@RequestBody Book book) {
	return  bookRepository.save(book);
}
@DeleteMapping("/boks/{id}")
public void  deleteBooks(@PathVariable Long id) {
	 bookRepository.delete(id);
}
}
