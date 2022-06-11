package logical;

import java.util.Scanner;

public class InterviewQuestion {
public static void main(String[] args) {
	Scanner s11 = new Scanner(System.in);
	System.out.println("Enter a String : ");
	String l = s11.nextLine();
	String l2 = l.substring(0, 2);     // faheem
    String first = l2.toUpperCase();
    int remaining1 = l.length();
    String remaining = l.substring(2, l.length()-2);
    String last = l.substring(l.length()-2,l.length()).toUpperCase();
    String name = first+remaining+last;
    System.out.println(name);
//    System.out.println(first);
//	String s = "shaikh";
//	String s2 = s.substring(0, 2);
//	String case1 = s2.toUpperCase();
//	String string = case1.concat("ai"+"KH");
//	System.out.println(string);
	
}
}
