package com.springStandalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springStandalone/aloneconfig.xml");
	person per = con.getBean("person1",person.class);
	System.out.println(per);
	System.out.println("__________________________________________");
	//System.out.println(per.getFriends().getClass().getName());
	//System.out.println(per.getFees());
	}

}