package Sqlquery;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.pro.Hibernate.Student;

public class SQLEX {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
	
	Session s = factory.openSession();
	String q="select * from student ";
	NativeQuery nq = s.createSQLQuery(q);
	List<Object[]> list = nq.list();
	for(Object[] sa:list) {
		System.out.println(sa[4] + " " +sa[3]);
		
	}
	
	s.close();
	factory.close();
	
	
	}

}
