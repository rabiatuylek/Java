import java.io.IOException;
import java.text.ParseException;
import java.io.FileNotFoundException;

public class MultipleException {
	
	public void start() throws  IOException, ParseException {
		
		//throw new IOException();
		
		throw new ParseException("Error at line 10", 2);
	}
	
	public void example() throws IOException, FileNotFoundException{
		
		throw new IOException("heyo");
	}
	

}
