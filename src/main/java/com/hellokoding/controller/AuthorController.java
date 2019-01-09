package com.hellokoding.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hellokoding.restfulapi.model.Author;
import com.hellokoding.restfulapi.repository.AuthorRepository;
@RestController
public class AuthorController {
	@Autowired
	private AuthorRepository authorRepository;
    
	@GetMapping("/auth")
	public List<Author> getAllAuthors(){
	      return authorRepository.findAll();
	}
	@GetMapping("/auth/{id}")
	public Author getBook(@PathVariable Long id) {
		  return  authorRepository.findOne(id);
	}

	@PostMapping("/auth")
	public Author  createBooks(@RequestBody Author author) {
		return  authorRepository.save(author);
	}
	@PutMapping("/auth")
	public Author upDateBooks(@RequestBody Author author ) {
		return  authorRepository.save(author);
	}
	@DeleteMapping("/auth/{id}")
	public void  deleteBooks(@PathVariable Long id) {
		 authorRepository.delete(id);
	}
	}


