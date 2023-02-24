//doWhile
import java.util.Scanner;

public class myapp {
	public static void main(String[] args) {
		//Getting User Input
		Scanner value = new Scanner(System.in);
		
		int number = 0;
		
		do {
			System.out.println("Enter a value: " );
			number = value.nextInt();
						
		}
		while(number != 9);
		System.out.println("You got 9!");


	}

}
