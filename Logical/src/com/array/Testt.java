package com.array;

public class Testt {
public static void main(String[] args) {
	
//	int arr[]= {1,2,3,2,2};
//
//	for(int i=0;i<arr.length;i++)
//	{
//		for(int j=i+1;j<arr.length;j++)
//		{
//			if(arr[i]==arr[j])
//			{
//				System.out.println(arr[j]);
//			}
//		}
//	}
//	int arry[]= {1,1,2,2,3,4,5,5,1,2,3,5,6};
//	for(int i=0;i<arry.length;i++) {
//		for(int b=i+1;b<arry.length;b++) {
//			if(arry[i]==arry[b]) {
//				System.out.println(arry[i]);
//				
//			}
//		}
//			
//	}
	String v="AMAN";
	String c="";
	int len=v.length();
	for(int a=len-1;a>=0;a--) {
		c=c+v.charAt(a);
	}
	
	if(v.equals(c)) {
		System.out.println("polindrome");		
	}
	else {
		System.out.println("not polindorme");
	}
}
}
