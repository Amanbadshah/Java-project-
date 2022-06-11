package com.pro.Hibernate;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )throws IOException
    {
        System.out.println( "project statred..." );
        Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory factory=cfg.buildSessionFactory();
        Student st=new Student();
       st.setId(102);
       st.setName("WASEEM");
       st.setCity("VASAI"); 
       System.out.println(st);
       //creating obejct
       Address ad=new Address();
       ad.setStreet("Street3");
       ad.setCity("mumbai");
       ad.setOpen(true);
       ad.setAddedDate(new Date());
       ad.setX(123.1234);
       //added image
       FileInputStream fis=new FileInputStream("src/main/java/download.png");
       byte[] data=new byte[fis.available()];
       fis.read(data);
       ad.setImage(data);
       
       
       
       Session session = factory.openSession();
       //
        Transaction tx=session.beginTransaction();
       session.save(st);
       session.save(ad);
       tx.commit();
       
       
       session.close();
    System.out.println("Done...");
    
    }
}
