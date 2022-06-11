package com.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo2 {
	public static void main(String[] args) {
		TreeSet t=new TreeSet(new MyComparator());
		t.add(10);
		t.add(100);
		t.add(20);
		t.add(5);
		t.add(40);
		t.add(2);
		System.out.println(t);
	}

}
 class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Integer tc1=(Integer)o1;
		Integer tc2=(Integer)02;
		if(tc1>tc2)
			return +1;
		else if(tc1<tc2)
		
		return -1;
		
		return 0;
	}
	

	




		
	}
