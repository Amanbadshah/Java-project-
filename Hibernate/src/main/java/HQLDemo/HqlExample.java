package HQLDemo;

import java.util.Arrays;
import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.Array;

import com.pro.Hibernate.Student;

public class HqlExample {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory fac=cfg.buildSessionFactory();
	     Session s=fac.openSession();
		//HQL 
		//Syntax;
		
		String query="from Student where city='MUMBAI'";
		Query q=s.createQuery(query);
		//single -(unique)
		//multiple-(List)
		List<Student> list=q.list();
		for(Student student:list) {
			System.out.println(student.getName() +""+student.getCerti().getCourse());
		}
		
		System.out.println("_____________________________________");
//		Transaction tx1=s.beginTransaction();
		//DELETE QUERY
		/*
		 * Query q1=s.createQuery("delete from Student s where s.city=:c");
		 * q1.setParameter("c", "KANPUR"); int r=q1.executeUpdate();
		 * System.out.println("DELETED:");
	    System.out.println(r);
		 */
		//UPDATE QUERY
		/*
		 * Query q3=s.createQuery("update Student set city=:c  where  name=:n ");
		 * q3.setParameter("c", "UP"); q3.setParameter("n", "WASEEM"); int
		 * r=q3.executeUpdate(); System.out.println(r + "Update in database ");
		 */
		//create Join Query
		Query q3=s.createQuery("select   q.question ,q.questionId,a.answer from Question as q INNER JOIN q.answers as a");
		List<Object[]> list3=q3.getResultList();
		for(Object []arr:list3) {
			System.out.println(Arrays.toString(arr));
		}
//		tx1.commit();
		
		s.close();
		fac.close();
		
	}

}
