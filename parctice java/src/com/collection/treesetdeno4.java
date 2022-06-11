package com.collection;

import java.util.Comparator;
import java.util.TreeSet;
class Employe{
	String name;
	int id;
	Employe(String name,int id){
		this.name=name;
		this.id=id;
		
	}
}

public class treesetdeno4 {
	public static void main(String[] args) {
		Employe e=new Employe("moin",200);
		Employe e2=new Employe("aman",10);
		Employe e3=new Employe("Aamir",4);
		System.out.println(e+" "+e2+""+e3);
		TreeSet te=new TreeSet<Employe>();
		te.add(e);
		te.add(e2);
		te.add(e3);
		System.out.println(te);
	}
		
}	

