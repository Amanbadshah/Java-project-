package com.springexpre;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ApplicationContext con=new ClassPathXmlApplicationContext("com/springexpre/expconfig.xml");
	Demo d1 = con.getBean("demo",Demo.class);
	System.out.println(d1);
	}

}
