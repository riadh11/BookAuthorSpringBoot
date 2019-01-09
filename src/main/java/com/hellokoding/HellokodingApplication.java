package com.hellokoding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

import com.hellokoding.restfulapi.model.Author;
import com.hellokoding.restfulapi.model.Book;
import com.hellokoding.restfulapi.repository.BookRepository;

@SpringBootApplication
public class HellokodingApplication implements CommandLineRunner {
	
	@Autowired
	private BookRepository bookRepository;
	
	  public static void main(String[] args) {
		SpringApplication.run(HellokodingApplication.class, args);}
		
		  public void run(String... args) throws Exception {
		        // Cleanup the tables
		        //bookRepository.deleteAllInBatch();
		        //authorRepositoy.deleteAllInBatch();

		 Book b1 = new Book("lire bie","kalila");
		
		 //Book b2 = new Book("Ecrit bie","Ali BaBA");
		 
		Author a1 = new Author("sami");
		Author a2 = new Author("Ahmed");
		
		b1.getAuthors().add(a1);
		b1.getAuthors().add(a2);
		
		//a1.getBooks().add(b1);
		//a1.getBooks().add(b2);
		
		
		//BookRepository.save(b1);
		//AuthorRepository.save(a1);
		bookRepository.save(b1);
		
		 
	}

}
	

