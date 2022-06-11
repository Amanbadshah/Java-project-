package Oopsparctice;

public class Stringtest {
	public static void main(String[]args) {
		String s1=new String("yccm");
		String s2=new String("Yccm");
		System.out.println(s1==s2);
		String s3="yccm";
		System.out.println(s1==s3);
		String s4="yccm";
		System.out.println(s3==s4);
		String s5="yc"+"cm";
		System.out.println(s3==s5);
		String s6="yc";
		String s7=s6+"cm";
		System.out.println(s3==s7);
		final String s8="yc";
		String s9=s8+"cm";
		System.out.println(s3==s9);
		System.out.println(s6==s8);
	}

}
