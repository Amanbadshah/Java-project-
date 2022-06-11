package com.pro.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FectDemo {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
	   Session session=factory.openSession();
	   Student student=(Student)session.load(Student.class, 104);
	   System.out.println(student);
	   Address ad=(Address)session.get(Address.class, 1);
	   System.out.println(ad.getCity());
	   System.out.println("Done");
	
	
	
	session.close();
	factory.close();
	
	}

}
