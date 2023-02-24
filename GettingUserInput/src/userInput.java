//Getting User Input

import java.util.Scanner;

public class userInput {
	public static void main(String[] args) {
		/** Getting User Input **/
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Please enter a text: ");
		String text = input.nextLine();
		
		System.out.println("Please enter a number: ");
		int number = input.nextInt();
		
		System.out.println("Please enter a double number: ");
		double valuee = input.nextDouble();
		
		System.out.println("Your Line is: " + text);
		System.out.println("Your number is: " + number);
		System.out.println("Your decimal number is: " + valuee);
		
	}

}
