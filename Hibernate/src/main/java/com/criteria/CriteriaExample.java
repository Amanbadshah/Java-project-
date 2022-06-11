package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.pro.Hibernate.Student;

public class CriteriaExample {
	public static void main(String[] args) {
		Session session = new Configuration().configure().buildSessionFactory().openSession();

		Criteria s=session.createCriteria(Student.class);
//		s.add(Restrictions.eq("city", "pune"));
		//greater then
//	s.add(Restrictions.le("id", 104));
	//s.add(Restrictions.(""));
		
		
		 List <Student>st = s.list();
		for(Student stu:st) {
			System.out.println(stu);
		}
		
		
		
		
		
		
		
	
	session.close();
	
	}
	

}
