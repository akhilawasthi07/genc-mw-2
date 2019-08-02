package com.cts.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.basic.model.Student;

public class E02ApplicationContext {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("01_spring.xml");
		
		Student anujStd = (Student) context.getBean("anuj");
		
		System.out.println(anujStd);
	}
}
