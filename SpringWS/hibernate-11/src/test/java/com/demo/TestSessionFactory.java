package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.demo.util.HibernateUtil;

public class TestSessionFactory {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		String SQL = "select version();";
		String result = (String) session.createNativeQuery(SQL).getSingleResult();
		
		System.out.println(result);
		
		session.close();

		
	}
}
