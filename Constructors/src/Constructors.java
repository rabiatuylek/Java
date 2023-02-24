//Constructors
//OOP
class Program{  //class does not take ()
	int value;
	
	public Program() { //In there,public name and class name must be same!!!
		System.out.println("First Constructor");
		value = 12;
	}
	
	public Program(int value) {
		this.value = value;
		System.out.println("Second Constructor");
	}
}



public class Constructors {
	public static void main(String[] args) {
		Program myProgram = new Program();
		new Program();		
		
		Program myProgram1 = new Program(2);
		new Program(5);
		
		
	}

}
