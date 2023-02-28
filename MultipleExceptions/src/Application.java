import java.io.IOException;
import java.text.ParseException;
import java.io.FileNotFoundException;

public class Application {
	public static void main(String[] args) {
		
		MultipleException me = new MultipleException();
		
		try {
			me.start();
		}
		catch (IOException e){
			e.printStackTrace();
		}
		catch (ParseException e) {
			System.out.println("Incorrect Format!");
		}
		
	}

}
