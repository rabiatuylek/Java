//inheritance
// extends using

public class Application {
	public static void main(String[] args) {
		Factory factory1 = new Factory();
		
		factory1.design();
		factory1.build();
		
		Car car1 = new Car();
		//we can work these classes(design and build) by  using extends
		car1.design();
		car1.build();
		car1.brand();
	}

}
