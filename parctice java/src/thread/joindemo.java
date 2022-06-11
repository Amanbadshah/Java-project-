package thread;
//Multithearding join method...

public class joindemo extends Thread {
	public void run() {
		try {
			for(int i=1; i<=5;i++) {
				System.out.println("Child thread"+i);
				Thread.sleep(1000);
				
			}}
			catch(Exception e)
		{
				System.out.println(e);
		}
	}	
	public static void main(String[] args)throws Exception {
		joindemo d=new joindemo();
		d.start();
		d.join();
		try {
			for(int a=1;a<=5;a++) {
				System.out.println("main Thread"+a );
				Thread.sleep(1000);
			}}
		catch(Exception e) {
			System.out.println(e);
		}}
		
			
		
		
		
		
	}	


