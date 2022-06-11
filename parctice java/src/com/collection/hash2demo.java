package com.collection;

import java.util.HashSet;

class Book{
		int id;
		String name;
		int quantity;	
Book(int id,String name,int quantity){
	this.id=id;
	this.name=name;
	this.quantity=quantity;
}	
}

public class hash2demo {
	public static void main(String[] args) {
		HashSet<Book> hs=new HashSet();
		Book b=new Book(20,"AMAN",2);
		Book b1=new Book(10,"Moin",22);
		Book b2=new Book(12,"AAMIR",13);
		hs.add(b);
		hs.add(b1);
		hs.add(b2);
		for(Book q:hs) {
			System.out.println(q.id + "  " +q.name+ " " +q.quantity);	
		}}
}
