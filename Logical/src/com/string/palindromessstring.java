package com.string;

import java.util.Scanner;

public class palindromessstring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String name:");
		String str=sc.nextLine();
		String org_str=str;
		String rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		//System.out.println(rev);
		if(org_str.equals(rev)) {
			System.out.println("its is polindrome");
		}
		else {
			System.out.println("not polindrome");	
		}
		
		
	}

}
