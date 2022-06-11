package com.collection;

import java.util.ArrayList;

public class ArrayList5 {

	public static void main(String[] args) {
		Student student = new Student(1, "Duplicate Gandhi", 78);
		Student student1 = new Student(2, "Kali Topi", 19);
		Student student2 = new Student(3, "Bantai", 23);
		ArrayList<Student> arrayList = new ArrayList<>();
		arrayList.add(student);
		arrayList.add(student1);
		arrayList.add(student2);
		for (Student s : arrayList) {
			System.out.println(s);
		}
	}

}
