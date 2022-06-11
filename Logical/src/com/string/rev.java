package com.string;

public class rev {
	
public static void main(String[] args) {
//	String s="azhar";
//	for(int i=s.length()-1;i>=0;i--)
//	{
//		System.out.print(s.charAt(i));
//	}

//	String a="Aman";
//	   String bc="";
//	   int len=a.length();
//	   for(int i=len-1;i>=0;i--){
//	       bc=bc+a.charAt(i);
//	       
//
//}
//	   System.out.println(bc);
String a="lol";
String v="";
for(int i=a.length()-1;i>=0;i--) {
v=v+a.charAt(i);
}
System.out.println(v);
if(a.equals(v)) {
	System.out.println("poli");
}
else {
	System.out.println("not");
}
	
}



}



