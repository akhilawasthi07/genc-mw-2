package com.cts.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.basic.model.Person;

public class E05Control {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("01_spring.xml");
		((ConfigurableApplicationContext)context).registerShutdownHook();

//		Person p = (Person)context.getBean("ram");
		Person p = context.getBean("ram", Person.class);
		System.out.println(p);
		

	}
}
