package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	AbstractApplicationContext context=  new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifeconfig.xml");
//Samosa ss1=(Samosa) context.getBean("S1");
context.registerShutdownHook();
/*
 * System.out.println(ss1);
 * 
 * 
 * System.out.println("BY  interface ++++++++++++++"); Pespi p1 = (Pespi)
 * context.getBean("p1"); System.out.println(p1);
 */
Kachori ka=(Kachori) context.getBean("k1");
System.out.println(ka);

}
}