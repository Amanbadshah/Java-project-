package com.mapping.xml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		person person1 = new person(12, "Waseem","Vasai", "121");
		
		
		
		
		
		
		
		
		tx.commit();
		
		
		
		session.save(person1);
		session.close();
		factory.close();
	
	
	}

}
