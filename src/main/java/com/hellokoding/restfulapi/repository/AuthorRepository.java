package com.hellokoding.restfulapi.repository;

import com.hellokoding.restfulapi.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AuthorRepository extends JpaRepository<Author,Long>{
	

	}
