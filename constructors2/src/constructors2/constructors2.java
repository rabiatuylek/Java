package constructors2;

class Program{
	double value;
	String word;
	int indexx;
	
	public Program (double value) {
		this.value = value;
		System.out.println("it can be.");		
	}
	
	public Program(int indexx, String word){
		this.indexx = indexx;
		this.word = word;
		System.out.println("third constructor");
	}
		
}


public class constructors2 {
	public static void main(String[] args) {
		
		Program myprogram = new Program(8.4);
		new Program(7.0);
		Program myprogram2 = new Program(5,"heyyo");
	}

}
