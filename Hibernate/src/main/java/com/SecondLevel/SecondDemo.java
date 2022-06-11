package com.SecondLevel;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import com.pro.Hibernate.Student;

public class SecondDemo {
	public static void main(String[] args) {
		
    SessionFactory factory = new Configuration().configure().buildSessionFactory();
	
    //first
    Session session1 = factory.openSession();
    Student student1 = session1.get(Student.class, 101);
	System.out.println(student1);
	Session session2=factory.openSession();
	Student student3=session2.get(Student.class, 103);
	System.out.println(student3);
	
	session1.close();
	
	
	//second
	Session session3 = factory.openSession();
	Student student2 = session3.get(Student.class, 103);
	System.out.println(student2);
	
	
	
	session2.close();
	factory.close();
	
	

	
	
	}

}
