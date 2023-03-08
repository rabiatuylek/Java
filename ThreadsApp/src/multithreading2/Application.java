package multithreading2;

class StartThreads implements Runnable{
	
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
		
		
		Thread thread1 = new Thread(new StartThreads());
		thread1.start();
		
		Thread thread2 = new Thread(new StartThreads());
		thread2.start();
	}

}
