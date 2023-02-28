package example1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OtherPresent {
	public static void main(String[] args) {
		
		try {
		read();
			
		}
		catch(FileNotFoundException e) {
			System.out.println("I could nout found this file.");
		}
	}
	
	public static void read() throws FileNotFoundException{
		File file = new File("example.txt");
		
		Scanner readFile = new Scanner(file);
	}

}
