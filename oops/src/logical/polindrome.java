package logical;

import java.util.Scanner;

public class polindrome {
public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter number");
//	int a=sc.nextInt();
	int a=16461;
	int org=a;
	
	int rev=0;
	while(a!=0) {
		rev=rev*10 +a%10;
		a=a/10;
	}
	System.out.println(rev);

	if(org==rev) {
		
		System.out.println("this polidnirome");
	}
	else {
		System.out.println("not polidnrome");

	}
}}
