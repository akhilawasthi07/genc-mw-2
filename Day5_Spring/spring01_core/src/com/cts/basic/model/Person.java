package com.cts.basic.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Person implements DisposableBean, InitializingBean{
	
	// before bean initilization
	// after bean init

	private int age;
	private String name;
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		// control
		if(age < 0 || age > 100) {
			return;
		}
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("person is initialized: "+this);
	}
	@Override
	public void destroy() throws Exception {
System.out.println("destroying person "+this);
	}
	
	
}
