package com.springcore.ci;

public class Adition {
	private int a;
	private int b;
	public Adition(double a,double b) {
		this.a=(int)a;
		this.b=(int)b;
		System.out.println("Constructor : d ,d 	 ");
	}
	public void dosum() {
		System.out.println("sum is="+(this.a+this.b));
	}
	public Adition(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println("Constructor : int ,int 	 ");
	}

	public Adition(String a,String b) {
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
		System.out.println("Constructor : String ,String 	 ");
	}	
}