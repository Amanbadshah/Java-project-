package map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory factory=cfg.buildSessionFactory();
	
	//creating object
	/*//one to many
	 * Question q=new Question(); q.setQuestionId(1212);
	 * q.setQuestion("What is java"); //creating answer class object Answer an=new
	 * Answer(); an.setAnswerId(343); an.setAnswer("java is programming language");
	 * an.setQ(q);
	 * 
	 * Answer an1=new Answer(); an1.setAnswerId(34);
	 * an1.setAnswer("Whit the help of java we can create Softwares"); an1.setQ(q);
	 * 
	 * 
	 * Answer an2=new Answer(); an2.setAnswerId(363);
	 * an2.setAnswer("java has different types of framework. "); an2.setQ(q);
	 * List<Answer> list=new ArrayList<Answer>(); list.add(an); list.add(an1);
	 * list.add(an2);
	 * 
	 * 
	 * q.setAnswers(list);
	 */
	

	
	/*
	 * Question q2=new Question(); q2.setQuestionId(242);
	 * q2.setQuestion("What is Collection framework"); //creating answer class
	 * object Answer an1=new Answer(); an1.setAnswerId(344);
	 * an1.setAnswer("API to work with objects in java "); an1.setQ(q2);
	 * q2.setAnswer(an1);
	 */
	
	
	Session session=factory.openSession();
 	Transaction tx=session.beginTransaction();
 	
	/*
	 * session.save(an); session.save(an1); session.save(q); session.save(q2);
	 */
 	//one to many
	/*
	 * session.save(q); session.save(an); session.save(an1); session.save(an2);
	 */
 	Question q=(Question)   session.get(Question.class,1212);
 /*	System.out.println(q.getQuestion());
 	for(Answer a:q.getAnswers()) {
 		System.out.println(a.getAnswer());*/
	/*
	 * //Lazy System.out.println(q.getQuestionId());
	 * System.out.println(q.getQuestion());
	 * System.out.println(q.getAnswers().size());
	 */
 	//EAGER
 	System.out.println(q.getQuestionId());
 	System.out.println(q.getQuestion());
 	System.out.println(q.getAnswers().size());
 	
 	
 	
 	tx.commit();
 	//fetching 
	/*
	 * Question qu=(Question) session.get(Question.class, 242);
	 * System.out.println(qu.getQuestion());
	 * System.out.println(qu.getAnswer().getAnswer());
	 */ 	
 	
 	
 	
 	session.close();
	
	
	
	
	factory.close();

	
}
}
