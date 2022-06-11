package thread;
class Task1 extends Thread{
	public void run() {
		System.out.println("Perfoming Multiple Task Multiple thread...");
	}
}
class File extends Thread{
	public void run() {
		System.out.println("Task1,,,");
		
	}
}
class Task3 extends Thread{
	public void run() {
		System.out.println("Task 2...");
	}
}
class Task4 extends Thread{
	public void run() {
		System.out.println("Task3... ");
	}
}

public class TestTask {
public static void main(String[] args) {
	Task1 t1=new Task1();
	t1.start();
	File t2=new File();
	t2.start();
	Task3 t3=new Task3();
	t3.start();
	Task4 t4=new Task4();
	t4.start();

}
}
