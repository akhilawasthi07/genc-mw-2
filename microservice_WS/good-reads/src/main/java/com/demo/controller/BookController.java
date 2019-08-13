package com.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.demo.model.Book;

@RestController
@RequestMapping("book")
public class BookController {

	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/{price}")
	public List<Object> getBook(@PathVariable("price") double price) {
		// fetch data from db
		
		List books = restTemplate.getForObject("http://localhost:8991/api/goodreads/books", ArrayList.class);
		System.out.println(books);
		
		// logic to filter
		
		return books;
	}
}
