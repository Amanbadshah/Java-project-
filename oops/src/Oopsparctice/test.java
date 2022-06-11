package Oopsparctice;

public class test {
	int age;
	String name;
	int id;
	public void m1(int a,String b,int c) {
		age=a;
		name=b;
		id=c;
	}
	void display() {
		System.out.println(age+""+name+""+id);
	}
	
	public void main (String []args) {
		test t=new test();
		t.m1(12,"aman",10);
		t.display();
	
		
	}

}
