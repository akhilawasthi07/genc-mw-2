package com.cts.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.basic.model.Student;

public class E04CloseContext {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("02_scope.xml");
		((ConfigurableApplicationContext)context).registerShutdownHook();

		Student std1 = (Student) context.getBean("anuj");
		
		
//		((ConfigurableApplicationContext)context).close();
//		((ConfigurableApplicationContext)context).refresh();
		
		Student std2 = (Student) context.getBean("kirti");
//		((ConfigurableApplicationContext)context).close();
		
	}
}
