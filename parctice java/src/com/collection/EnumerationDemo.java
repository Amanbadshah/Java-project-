package com.collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
public static void main(String[] args) {
	Vector v=new Vector();
	for(int a=0;a<=10;a++) {
		v.addElement(a); 
	}
	System.out.println(v);
	Enumeration e=v.elements();
	while(e.hasMoreElements()) {
		Integer a=(Integer)e.nextElement();
		if(a%2==0)
			System.out.println(a);
	}
	
	System.out.println(v);		
			
	
}
}
