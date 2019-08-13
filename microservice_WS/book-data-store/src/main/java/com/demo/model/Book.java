package com.demo.model;

public class Book {

	private int id;
	private String title;
	private String author;
	private double price;
	private String desc;

	public Book() {}

	public Book(int id, String title, String author, double price, String desc) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
		this.desc = desc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + ", desc=" + desc
				+ "]";
	}

}
