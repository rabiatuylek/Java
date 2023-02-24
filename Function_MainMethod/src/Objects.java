//Class, Main Methods --> OOP in Java
class Methods{
	String animal;
	int year;
	int month;
	
	//create function
	void run() {
		System.out.println("Running");
		for (int i=0; i<3;i++) {
			System.out.println("My " + animal + " is " + year + " years old. ");
		}
		
	}
	
	void calculateMonthstoBirthday() {
		int monthsLeft = 12 - month;
		System.out.println("Months until birthday : " + monthsLeft);
	}
	
	void talk(String text) {
		System.out.println(text);
	}
	
	void timer(int minutes, double seconds) {		
		System.out.println("It took " + minutes+ " m and " + seconds + " s .");
	}
	
}

public class Objects {
	public static void main(String[] args) {
		Methods name = new Methods();
		name.animal = "Dog";
		name.year =  9;
		name.run(); //calling run function
		name.month = 7;
		name.calculateMonthstoBirthday();
		
		name.talk("Hello I am rabia!");
		name.timer(6, 3.67);
		
	}

}
