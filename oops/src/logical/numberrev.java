package logical;

public class numberrev {
public static void main(String[] args) {
	/*int a=1234;
	int rev=0;
	while(a!=0) {
		rev = rev*10+a%10;
		a=a/10;
	}
		System.out.println(rev);
	*/
	int b=24, c=40;
	c=b+c-(b=c);
	System.out.println(b+""+c);
}
}
