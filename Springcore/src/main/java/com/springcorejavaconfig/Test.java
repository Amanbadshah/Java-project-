package com.springcorejavaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext con=new AnnotationConfigApplicationContext(javaConfig.class);
	//Student stu = con.getBean("student",Student.class);
		Student stu = con.getBean("getStudent",Student.class);
	System.out.println(stu);
	stu.study();
	
	
	}

}