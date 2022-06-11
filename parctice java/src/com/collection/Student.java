package com.collection;

public class Student {
	int rollno;
	String name;
	int age;

	public Student(int r, String n, int a) {
		
		rollno = r;
		name = n;
		age = a;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}
 
}
