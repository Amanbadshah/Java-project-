package com.collection;import java.util.Stack;

public class DemoStack {
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push("Stack demo");
		s.push("stack");
		s.push("Stak 3");
		System.out.println(s);
		System.out.println(s.search("stack"));
		System.out.println(s.search("Hello"));
	}

}
