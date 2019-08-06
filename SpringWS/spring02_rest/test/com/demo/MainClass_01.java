		
package com.demo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.dao.JdbcUserTemplate;
import com.demo.model.User;

public class MainClass_01 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("jdbcDemo.xml");
		((ConfigurableApplicationContext) context).registerShutdownHook();
		
		JdbcUserTemplate userDao = context.getBean("userDao", JdbcUserTemplate.class);
//		insertUser(userDao);
		findUserById(userDao);
//		deleteUser(userDao);
//		updateUser(userDao);
		usersList(userDao);
	}

	private static void insertUser(JdbcUserTemplate userDAO) {
		User user = new User(32, "Jyoti", "0831786");
//		userDAO.insertUser(user);
		userDAO.insertUser_Template(user);
	}
	
	private static void findUserById(JdbcUserTemplate userDAO) {
		int userid = 2;
		User user = userDAO.getUser(userid);
		System.out.println(user);
	}
	
	private static void usersList(JdbcUserTemplate userDAO) {
		List<User> list = userDAO.listAllUsers();
		System.out.println(list);
	}
	
	private static void deleteUser(JdbcUserTemplate userDAO) {
		int userid = 108;
		userDAO.deleteUser(userid);
	}

	private static void updateUser(JdbcUserTemplate userDAO) {
		int userid = 109;
		int age = 33;
		userDAO.updateUser(userid, age);
	}
	
}
