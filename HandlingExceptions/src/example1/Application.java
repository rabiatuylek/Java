package example1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) throws FileNotFoundException{
		File file = new File("example.txt");
		
		try {
		Scanner readFile = new Scanner(file);
		System.out.println("hello there");
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found: " + file.toString());
			
		}
		// you can continue to write with your code here
		System.out.println("again helloo");
		
	}

}
