package com.cascade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import map.Answer;
import map.Question;

public class CascadeEx {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();
	Question q1=new Question();
	q1.setQuestionId(188);
	q1.setQuestion("What is Cascding work???");
	
	
	Answer a1=new Answer(01,"In	 important Concept");
	Answer a2=new Answer(02,"Second Answer");
	Answer a3=new Answer(03,"Third Answer");
	List<Answer> list=new ArrayList<Answer>();
	list.add(a1);
	list.add(a2);
	list.add(a3);
	q1.setAnswers(list);
	Transaction tx = session.beginTransaction();
	session.save(q1);
	/*
	 * session.save(a1); session.save(a2); session.save(a3);
	 */
	tx.commit();
	
	
	
	
	
	
	
	
	session.close();
	
	
	factory.close();
	
	
	}

}
