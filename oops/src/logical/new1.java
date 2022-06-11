package logical;

public class new1 {
public static void main(String[] args) {
	int a=10,b=20;
	System.out.println("before" +a + " " +b);
	/*Thrid variable;
	int t=a;
	a=b;
	b=t;*/
	/*System.out.println("After" +a+" "+b);
	//without using thrid variable
    a=a+b;//30
    b=a-b;//10
    a=a-b;//20
    System.out.println("After" +a+" "+b);*/
	//thrid logic * and /
	/*a=a*b;
	b=a/b;
	a=a/b;*/
	//Logical  4 Bitwise Xor(^)
	/*a=a^b;
	b=a^b;
	a=a^b;*/
	//logic 5 single statements
	//left to right
	a=b+a-(b=a);
	System.out.println("After"+ a+ " "+b);
}

}
