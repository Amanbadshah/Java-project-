package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample1 {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		//arrayList.add("Apple");
//		arrayList.add("Apple");
//		arrayList.add("Mango");
//		arrayList.add("Chickoo");
//		arrayList.add("Strawberry");
//		System.out.println(arrayList);
//		Iterator<String> iterator = arrayList.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//		for(String s : arrayList) {
//			System.out.println(s);
//		}
//	}
//		System.out.println(arrayList.get(2));
//		arrayList.set(2, "Mohabbat");
//		System.out.println(arrayList);
//		for(String s : arrayList) {
//			System.out.println(s);
//		}
		arrayList.add(34);
		arrayList.add(12);
		arrayList.add(325);
		arrayList.add(1);
		Collections.sort(arrayList);
		for (Integer i : arrayList) {
			System.out.println(i);
		}
	}
}
