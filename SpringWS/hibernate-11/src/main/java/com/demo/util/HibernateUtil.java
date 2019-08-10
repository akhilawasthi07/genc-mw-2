package com.demo.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

	private static final SessionFactory sessionFactory;
	
	static {
		try {
			StandardServiceRegistry stanRegistry = new StandardServiceRegistryBuilder()
					.configure("hibernate.cfg.xml")	// default
					.build();
			Metadata metadata = new MetadataSources(stanRegistry)
					.getMetadataBuilder()
					.build();
			
			sessionFactory = metadata.getSessionFactoryBuilder().build();
		} catch(Exception e) {
			throw new ExceptionInInitializerError(e);
		}
	}
	
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
}
