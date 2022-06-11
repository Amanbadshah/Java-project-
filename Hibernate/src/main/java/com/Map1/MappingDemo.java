package com.Map1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		
		Emp e=new Emp();
		Emp e1=new Emp();
		
		
		e.seteId(110);
		e.setEname("AMAN");
		e1.seteId(116);
		e1.setEname("Sahil");
		
		project p=new project();
		project p1=new project();
			p.setpId(111);
			p.setpName("Livbrary management System..");
			p1.setpId(222);
			p1.setpName("CHATBOT");
		
		List<Emp > list=new ArrayList<Emp>();
	    List<project> list1=new ArrayList<project>();
		list.add(e);
		list.add(e1);
		list1.add(p);
		list1.add(p1);
		e.setProjects(list1);
        p1.setEmpolye(list);		
		
        Session s=factory.openSession();
        Transaction tx=s.beginTransaction();
        s.save(e);
        s.save(e1);
        s.save(p);
        s.save(p1);
        project p3 = s.get(project.class,111);
        System.out.println();

        
        
        tx.commit();
        s.close();
        
		factory.close();
	}

}
