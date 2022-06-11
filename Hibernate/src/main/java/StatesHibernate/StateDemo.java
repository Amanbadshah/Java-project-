package StatesHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pro.Hibernate.Certificate;
import com.pro.Hibernate.Student;

//hibernate life cycle States...

public class StateDemo {
	public static void main(String[] args) {
		//Transient 
		//persistent
		//Detached 
		//Removed
	System.out.println("Strated:");	
	SessionFactory f=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	//creating student object..
	Student st=new Student();
	st.setId(111);
	st.setName("AMAN SHAIKH");
	st.setCity("MUMBAI");
	//certificate object...
	st.setCerti(new Certificate("java Hibernate Course","2 Months"));
	//Student state:Transient:
	
	Session s=f.openSession();
	Transaction tx=s.beginTransaction();
	s.save(st);
	//Student state: persistent:  session , databases
	st.setName("AAMIR SHAIKH");
	tx.commit();
	s.close();
	////Student state: Detached :
	st.setName("SUFIYAN SHAIKH");
	System.out.println(st);
	
	f.close();
	
	
	
	
	
	
	}

}
