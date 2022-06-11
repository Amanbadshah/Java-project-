package FirstLevelCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pro.Hibernate.Student;

public class FirstDemo {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		//first  level caching programm

		
		Student student = session.get(Student.class,101);
		System.out.println(student);
		System.out.println("First Demo Caching first Session ");
				
		Student student2 = session.get(Student.class, 101);
		System.out.println(student2);
		System.out.println(session.contains(student)  +  "    "  + session.contains(student));
		
		
		
		
		
		
		
		
		session.close();
	
	
	}

}
