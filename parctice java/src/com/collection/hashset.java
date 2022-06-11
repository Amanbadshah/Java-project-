package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;


public class hashset {
	
	public static void main(String[] args) {
HashSet h=new HashSet();
h.add("Hash Set demo");
h.add("AMAN");
h.add("Object");
h.add("AMAN");
h.add(1);
//System.out.println(h.add("Object"));
System.out.println(h);
System.out.println("Linked hash set demo");
LinkedHashSet l=new LinkedHashSet();//only one diffrenet insertion order preserved
l.add(1);
l.add("Linkedhash Set");
l.add("Hp");
l.add(10);
System.out.println(l);
		}

}
