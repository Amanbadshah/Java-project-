package Pegination;
//different want fecting dara

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.pro.Hibernate.Student;

public class HqlPegination {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
	   
		Session s = factory.openSession();
		Query<Student> query=s.createQuery("from Student",Student.class);
		//implementing pegination using hibernate..
		query.setFirstResult(0);
		query.setMaxResults(10);
		List<Student> list = query.list();
		for(Student st: list) {
			System.out.println(st.getId() + ":" +st.getName()  + " :" +st.getCity());
		
		}
		
		
		
		
	s.close();
	factory.close();
	
	}
	

}
