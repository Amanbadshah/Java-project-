package thread;

public class multithread extends Thread {
	public void run() {//single task..
		System.out.println("Perfoming single task single threade");
		
	}
	public static void main(String args[]) {
		multithread t1=new multithread();//single thread....
		t1.start();

	}

	}


