import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Application2 {
	public static void main(String[] args) {
		
		MultipleException me = new MultipleException();
		
		try {
			me.start();
		}
		catch(IOException | ParseException e) {
			
			System.out.println("you are in here.");
		}
		
		
		try {
			me.example();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			//e.printStackTrace();
			System.out.println("also here.");
		}
		
	}

}
