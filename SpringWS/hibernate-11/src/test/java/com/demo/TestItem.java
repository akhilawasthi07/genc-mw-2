package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.entity.Item;
import com.demo.util.HibernateUtil;

public class TestItem {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		saveEntity(session);
		readEntity(session);
		editEntity(session);
		
		session.close();
	}
	
	private static void saveEntity(Session session) {
		session.beginTransaction();
		
		
		
		Item mobile = new Item();
		mobile.setId(123);
		mobile.setName("Nokia5130");
		mobile.setPrice(59.99);
		
		session.save(mobile);
		
		session.getTransaction().commit();// db insertion

	}
	
	
	private static void readEntity(Session session) {
		
		Item item = session.get(Item.class, 123);
		System.out.println(item);
		
	}
	
	private static void editEntity(Session session) {
		Transaction transaction = session.getTransaction();
		transaction.begin();
		
		Item item = session.get(Item.class, 123);
		System.out.println(item);
		
		item.setName("Moto");
		
		item.setName("Nokia");
		
		item.setName("Iphone");
		
		item.setName("Mi");
		
		item.setName("Micro");
		
		item.setName("Max");
		
		transaction.commit();

	}

}
