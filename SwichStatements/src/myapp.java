//Switch-Case Statements

import java.util.Scanner;

public class myapp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a text: ");
		String text = input.nextLine();
		
		// Switch-case statements is also if-else statements like at python.
		// Variable types supported by switch statements: int, byte, char, short, String
		
		switch(text) {
		case "runnn":
			System.out.println("Program is runningg rabia");
			break;
		case "stoppp":
			System.out.println("Program is stopped.");
			break;
		default:
			System.out.println("I could not recognize.");
				
		}
		
	}

}
