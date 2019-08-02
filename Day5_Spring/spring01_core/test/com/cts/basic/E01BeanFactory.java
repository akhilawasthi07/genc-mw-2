package com.cts.basic;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.cts.basic.model.Student;

public class E01BeanFactory {
	public static void main(String[] args) {
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("D:\\Training\\GenC\\9-6_MW\\Day5_Spring\\spring01_core\\src\\01_spring.xml"));
		System.out.println(factory.getBean("kirti"));
		Student anujStd = (Student) factory.getBean("anuj");
		
		System.out.println(anujStd);
	}
}
