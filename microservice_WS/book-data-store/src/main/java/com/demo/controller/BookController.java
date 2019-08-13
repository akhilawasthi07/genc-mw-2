package com.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Book;

@RestController
@RequestMapping("api/goodreads/")
public class BookController {
	
	@GetMapping("books")
	public List<Book> getAllBooks(){
		return Arrays.asList(
				new Book(1, "Math book", "Baskar", 99.9, "best book for math"),
				new Book(2, "Garden lovers", "Tom", 56.9, "Biology students find it best"),
				new Book(3, "Computer Science", "Carl", 14.9, "It related")
			);
	}
}
