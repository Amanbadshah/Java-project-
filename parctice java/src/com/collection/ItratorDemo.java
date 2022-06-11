package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ItratorDemo {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		for(int b=0;b<=10;b++) {
			a.add(b);
		}
		System.out.println(a);
		Iterator itr=a.iterator();
		while(itr.hasNext())
		{
			Integer c=(Integer )itr.next();
			if(c%2==0)
				System.out.println(c);
			else
				itr.remove();
			
		}
	}

}
