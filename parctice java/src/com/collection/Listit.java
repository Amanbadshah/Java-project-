package com.collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class Listit {
	public static void main(String[] args) {
		LinkedList l = new LinkedList<String>();
		l.add("List Iterator");
		l.add("AMAn");
		l.add("Shaikh");
		l.add("Hp laptop");
		System.out.println(l);
		ListIterator itr = l.listIterator();
		
		while (itr.hasNext()) {
			
			System.out.println(itr.next());
		}
	}
}
