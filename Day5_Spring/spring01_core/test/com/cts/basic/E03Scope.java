package com.cts.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.basic.model.Student;

public class E03Scope {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("02_scope.xml");
		
//		Student std1 = (Student) context.getBean("anuj");
//		Student std2 = (Student) context.getBean("anuj");

		Student std1 = (Student) context.getBean("kirti");
		Student std2 = (Student) context.getBean("kirti");
		
		std1.setName("Kirti Kapoor");
		System.out.println(std1);
		
		
		System.out.println(std2);
		
		
		if(std1==std2) {
			// packagename.class@hexadecimalCode
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
		
		
	}
}
