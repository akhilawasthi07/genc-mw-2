package com.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.demo.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{

}
