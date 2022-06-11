package thread;


public class join2 extends Thread {
	static Thread mainthread;

	public void run() {
		try {
			
		mainthread.join();
		for(int a=0;a<=5;a++) {
			System.out.println("Chlid thread"+a);
		Thread.sleep(3000);
			}	
	}
		catch(Exception e) {
			System.out.println(e);
		}}
		public static void main(String ars[])throws Exception{
			mainthread=Thread.currentThread();
			join2 j=new join2();
			j.start();
			try {
				for(int c=0;c<=5;c++) {
					System.out.println("main thread"+c);
					Thread.sleep(2000);
					
				}
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}}
		
	
	


