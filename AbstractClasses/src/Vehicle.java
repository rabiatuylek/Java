
public abstract class Vehicle {
	
	private String engine;
	
	public String getEngine() {
		System.out.println(engine);
		return engine;
	}
	
	public void setEngine(String engine) {
		this.engine = engine;
		System.out.println(this.engine);
	}
	
	public abstract void drive();

}
