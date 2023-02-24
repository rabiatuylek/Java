// If, Else if, Else Statements
public class MyApp {
	public static void main(String[] args) {
		int number = 10;
		int other = 20;
		
		if (number == other) {
			
			System.out.println("Hey");
		}
		else if (number < 35) {  /** else if = elif in python **/
			System.out.println("It's True.");
		}
		
		else {
			System.out.println("Hii!");
		}
		
		while (number <15) {
			number++;
			System.out.println(number);
		} 
		
		while (true) {
			other++;
			System.out.println(other);
			break;
		}
	}

}
