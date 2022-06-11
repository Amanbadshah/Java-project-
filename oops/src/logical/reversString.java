package logical;

public class reversString {
	public static void main(String[] args) {
		String rev ="Shaikh";
		String n="";
		/*int len=rev.length();
		for(int i=len-1;i>=0;i--) {
			n=n+rev.charAt(i);
			
		}
		System.out.println("String is revers :"+  n);
	*/
	
/*		char a[]=rev.toCharArray();
	int len=a.length;
	for(int i=len-1;i>=0;i--) {
		n=n+a[i];
	}
	System.out.println("String is revers:"+n);
	*/
		StringBuffer sb=new StringBuffer(rev);
		System.out.println("revers:"+ sb.reverse());
	}
	

}
