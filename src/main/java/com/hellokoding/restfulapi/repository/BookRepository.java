package com.hellokoding.restfulapi.repository;
import com.hellokoding.restfulapi.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface BookRepository extends JpaRepository<Book,Long>{
}