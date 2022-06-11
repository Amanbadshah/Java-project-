package logical;

public class array {
	public static void main(String[] args) {
		String a[]= {"AMAN SHAIKH","SHAIKH AZHAR","KHAN MUJTABA","SHAIKH SUFIYAN"};
		for(int i=0;i<a.length;i++)
		{
			if(a[i].contains("SHAIKH"))
			{
				System.out.println(a[i]);
			}
		}
}
}
