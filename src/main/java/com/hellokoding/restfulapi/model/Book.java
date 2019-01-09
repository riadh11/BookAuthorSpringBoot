package com.hellokoding.restfulapi.model;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "books")
public class Book{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    
	/*@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "book_author", 
    joinColumns = @JoinColumn(name = "book_id", referencedColumnName = "id"), 
    inverseJoinColumns = @JoinColumn(name = "author_id", referencedColumnName = "id"))*/
	@ManyToMany(fetch = FetchType.LAZY,
    cascade = {
        CascadeType.PERSIST,
        CascadeType.MERGE
    })
    @JoinTable(name = "book_author", joinColumns = {
	@JoinColumn(name = "book_id")},inverseJoinColumns = {
			@JoinColumn(name = "author_id" )})
    private Set<Author> authors= new HashSet<Author>();

    public Book() {
    }

    public Book(String title, String description) {
		this.title = title;
		this.description = description;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

	

}