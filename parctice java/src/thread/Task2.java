package thread;

public class Task2 extends Thread {
	public void run() {//single task 
		System.out.println("Perfoming single task and multiple thread..");
	}
	public static void main(String args[]) {
    Task2 t5=new Task2();//thread 1
    t5.start();
    Task2 t2=new Task2();//thread 2...
    t2.start();
    
}}