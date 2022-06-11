package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
ApplicationContext con=	new ClassPathXmlApplicationContext("com/springcore/collections/cconfig.xml");
Emp e=(Emp) con.getBean("Emp1");
System.out.println(e.getName());
System.out.println(e.getPhone());
System.out.println(e.getAddress());
System.out.println(e.getCourses());

}
}
