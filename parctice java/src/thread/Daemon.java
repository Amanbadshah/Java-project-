package thread;

public class Daemon extends Thread {
	public void run() {
	System.out.println("Daemon Thread..");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Mian Thread");
		Daemon d=new Daemon();
			d.setDaemon(false);
			d.start();
	}
	
	}


