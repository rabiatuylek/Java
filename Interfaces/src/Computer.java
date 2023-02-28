
public class Computer implements Information{
	private int serialNumber = 8035;
	
	public void start() {
		System.out.println("Computer Started!");
	}
	
	public void displayInformation() {
		System.out.println("Computer serial number is: " + serialNumber);
	}

}
