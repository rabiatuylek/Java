
class Computer {
	public void shutDown() {
		
		String text = "Computer is shutting down.";
		System.out.println(text);
	}
}

interface Phone{
	public void call();
}


public class Application {
	public static void main(String[] args) {
		
		Computer comp1 = new Computer() {
			@Override
			public void shutDown() {
				System.out.println("Macbook is shutting down.");
			}
		};
		comp1.shutDown();
		System.out.println(" ");
		
		
		
		Computer comp2 = new Computer();
		comp2.shutDown();
		
		
		
		Phone phone1 = new Phone() {
			public void call() {
				System.out.println("Calling...");
			}
		};
		phone1.call();

	}
}
