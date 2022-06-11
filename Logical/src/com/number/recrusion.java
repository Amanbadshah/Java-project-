package com.number;

public class recrusion {
	static int n=10,m=0,sum;
	static void display() {
		if(n>m) {
			m++;
			sum=sum+m;
			
			System.out.println(sum);
			display();
			
		}
		
	}
	public static void main(String[] args) {
		display();
	}
	

}
