package com.cts.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.basic.model.Car;
import com.cts.basic.model.Person;

public class E06DI {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("06_spring.xml");
		((ConfigurableApplicationContext)context).registerShutdownHook();

		Car car = context.getBean("bmw", Car.class);
		System.out.println(car);
		
		Car car2 = context.getBean("bmw2", Car.class);
		System.out.println(car2);
		

	}
}
