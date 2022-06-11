package com.pro.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EemDemo {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
	   Student student1=new Student();
	   student1.setId(104);
	   student1.setName("AAMIR");
	   student1.setCity("PUNE");
	   Certificate cf=new Certificate();
	   cf.setCourse("PYTHON");
	   cf.setDuration("3 MONTHS");
	   student1.setCerti(cf);
	   Student student2=new Student();
	   student2.setId(103);
	   student2.setName("AMAN");
	   student2.setCity("MUMBAI");
	   Certificate cf1=new Certificate();
	   cf1.setCourse(".NET");
	   cf1.setDuration("1 MONTHS");
	   student2.setCerti(cf1);
		
	   
	   
	   Session s=factory.openSession();
	   Transaction tx = s.beginTransaction(); 
	   s.save(student1);
		  s.save(student2);
	   tx.commit();
	   
	 
	  System.out.println("DONE");
	   
	   
	   
	   
	   s.close();
		
		
		factory.close();
		
	}

}
