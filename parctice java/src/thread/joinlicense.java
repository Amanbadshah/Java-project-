package thread;
class Medical extends Thread{
	public void run() {
		try {
		System.out.println("Online Exam start");
		Thread.sleep(1000);
		System.out.println(" Done");
		Thread.sleep(1000);
	}
		catch(Exception e) {
			System.out.println(e);
		}
}}

class TestDrive extends Thread{
	public void run() {
		try {
			System.out.println("Start test drive");
			Thread.sleep(2000);
			System.out.println("Done Your test drive");
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println(e);
		
			
		}
	}
}
class Done extends Thread{
	public void run(){
		try {
			System.out.println("Take your License");
			Thread.sleep(1000);
			System.out.println("Thank you sir");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
public class joinlicense  
{
public static void main(String args[])throws Exception {
	Medical m=new Medical();
	m.start()
	;
	m.join();
	TestDrive t=new TestDrive();
	t.start();
	
	t.join();
	Done d=new Done();
	d.start();
	
}}


