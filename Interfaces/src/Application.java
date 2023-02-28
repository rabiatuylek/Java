
public class Application {
	public static void main(String[] args) {
		
		Computer comp1 = new Computer();
		comp1.start();
		
		Vehicle vehic1 = new  Vehicle("Volswagen");
		vehic1.drive();
		
		Information info = new Computer();
		Information info1 = vehic1;
		
		info.displayInformation();
		info1.displayInformation();
		
		// other presentation shape
		System.out.println();
		showInformation(comp1);
		showInformation(vehic1);
		
	}
	
	private static void showInformation(Information info) {
		info.displayInformation();
	}

}
