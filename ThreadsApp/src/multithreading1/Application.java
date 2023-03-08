package multithreading1;

class StartThreads extends Thread{
	public void run() {
		
		for(int n=0; n<8; n++) {
			System.out.println("Hii" + n);
			
			try {
				Thread.sleep(600);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Application {
	public static void main(String[] args) {
		
		StartThreads thread1 = new StartThreads();
		
		thread1.start();
		
		StartThreads thread2 = new StartThreads();
		thread2.start();
		
	}

}
