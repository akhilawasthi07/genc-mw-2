package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.entity.Book;
import com.demo.entity.Contact;
import com.demo.entity.Student;
import com.demo.repo.BookRepository;
import com.demo.repo.StudentRepository;

//@SpringBootApplication
public class SpringbootJpa12MappingApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository repo;
	@Autowired
	private BookRepository bookRepo;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpa12Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("{}{}{}{}{}{}{}{}{}{}{}{}{}");
		System.out.println("{}{}{}{}{}{}{}{}{}{}{}{}{}");

		createStudent();
	}

	private void createStudent() {
		Student student = new Student("Vansh", 24);
		Contact contact = new Contact();
		contact.setEmail("test@gmail.com");
		student.setContact(contact);
		
		Book book1 = new Book("Math", "Tom");
		Book book2 = new Book("English", "Mike");
		Book book3 = new Book("Computer", "Carl");
		
		student.getBooks().add(book1);
		student.getBooks().add(book2);
		student.getBooks().add(book3);
		
		bookRepo.save(book1);
		bookRepo.save(book2);
		bookRepo.save(book3);
		
		repo.save(student);
	}


}
