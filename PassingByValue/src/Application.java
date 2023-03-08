
public class Application {
	public static void main(String[] args) {
		Application app = new Application();
		
		int number = 10;
		System.out.println("1: Number = " + number);
		
		app.display(number);
		System.out.println("4: Number = " + number);
		
		System.out.println(" ");
		Cat cat = new Cat("Luna");
		System.out.println("1: " + cat);
		app.display(cat);
		System.out.println("4: " + cat);
		
		
	}
	
	public void display(int number) {
		System.out.println("2: Number = " + number);
		number = 8;
		System.out.println("3: Number = " + number);
	}
	
	
	public void display(Cat cat) {
		System.out.println("2: " + cat);
		
		cat = new Cat("Sunshine");
		//cat.setName("Oliver");
		System.out.println("3: " + cat);
	}

}
