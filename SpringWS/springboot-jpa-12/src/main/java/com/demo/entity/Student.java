package com.demo.entity;

import java.util.Collection;
import java.util.TreeSet;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Student {
	
	@Id
//	@Column(nullable=false, unique=true, name="roll_no")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private int age;

	@Embedded
	@AttributeOverrides({
		@AttributeOverride(column=@Column(name="current_email"), name="email"),
		@AttributeOverride(column=@Column(name="current_state"), name="state"),
		@AttributeOverride(column=@Column(name="current_city"), name="city"),
		@AttributeOverride(column=@Column(name="current_phone"), name="phone"),
	})
	private Contact contact;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(column=@Column(name="alternate_email"), name="email"),
		@AttributeOverride(column=@Column(name="alternate_state"), name="state"),
		@AttributeOverride(column=@Column(name="alternate_city"), name="city"),
		@AttributeOverride(column=@Column(name="alternate_phone"), name="phone"),
	})
	private Contact aContact;
	
	@ElementCollection
	@JoinColumn(name="std_id")
	private Collection<Book> books = new TreeSet<Book>();
	
	public Student() {
		super();
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	

	public Student(String name, int age, Contact contact) {
		this(name, age);
		this.contact = contact;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Contact getaContact() {
		return aContact;
	}

	public void setaContact(Contact aContact) {
		this.aContact = aContact;
	}

	public Collection<Book> getBooks() {
		return books;
	}

	public void setBooks(Collection<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", contact=" + contact + ", aContact="
				+ aContact + ", books=" + books + "]";
	}

	
}
