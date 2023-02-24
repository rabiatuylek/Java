// While Loop
public class MyApp {
	public static void main(String[] args) {
		
		int a = 45;
		int b = 67;
		int number = 5;
		boolean myloop = a < b;
		
		System.out.println(myloop);
		while(98 > a) {
			
			System.out.println("Correct");
			break;   /** 1 kez dön and stop! just like python **/
		}
		 
	
		while(number < a) {
			
			number = number+4;
			System.out.println(number);
		
		}
		
		while (true) {
			String print = "Heyyy!";
			System.out.println(print);
			break;
		}
		
	}

}
