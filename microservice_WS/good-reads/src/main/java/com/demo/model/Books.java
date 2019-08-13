package com.demo.model;

import java.util.List;

public class Books {
	List<Book> books;

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Books [books=" + books + "]";
	}
	
	

}
