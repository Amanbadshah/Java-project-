package com.springStereo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext con=new ClassPathXmlApplicationContext("com/springStereo/stereoconfig.xml");
		Student s1 = con.getBean("student",Student.class);
		
		System.out.println(s1);
		//System.out.println(s1.getAddress());
		
		
	}

}