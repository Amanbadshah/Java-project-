package logical;

import java.util.Scanner;

public class fibonaci {
 static public void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enetr number : ");
	 int number = sc.nextInt();
	 
	 
	 
	int n1=0,n2=1,sum=0;
	//System.out.println(n1+""+n2);
	for(int i=1;i<=number;i++) {
		sum=n1+n2;
		System.out.println(""+sum);
		n1=n2;
		n2=sum;
	}
}


}

