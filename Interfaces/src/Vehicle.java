
public class Vehicle implements Information {
	
	private String type;
	
	public Vehicle(String type) {
		this.type = type;		
	}
	
	public void drive() {
		System.out.println("Driving the vehicle.");
	}
	
	@Override
	public void displayInformation() {
		System.out.println("Vehicle type is: " + type);
	}
}
