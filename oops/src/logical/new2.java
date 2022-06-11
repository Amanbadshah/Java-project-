package logical;

import java.util.Scanner;

public class new2 {
/**
 * @param args
 */
	//number revers three method 
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	String num=sc.nextLine();
	
	
	/*int rev=0;
	while(num!=0) {
		rev=rev*10 +num%10;
		num=num/10;
	}*/
	/*StringBuffer sb=new StringBuffer(String.valueOf(num));
	StringBuffer rev=sb.reverse();
	System.out.println("revers number:"+rev);
	*/
StringBuilder sb1=new StringBuilder();
sb1.append(num);
sb1.reverse();

System.out.println("This is revers number:"+sb1);


}

}
