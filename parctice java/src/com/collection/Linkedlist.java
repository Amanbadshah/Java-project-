package com.collection;

import java.util.LinkedList;

public class Linkedlist {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add("Demo Linkedlist ");
		l1.add(null);
		l1.add(17);
		l1.add("Done");
		System.out.println(l1);
		l1.set(1, "Remove null");
		l1.add("Collection");
		
		l1.addFirst(1);
		l1.removeLast();
		System.out.println(l1);
		
		
		
	}

}
