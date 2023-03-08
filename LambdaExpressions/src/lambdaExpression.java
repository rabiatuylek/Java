
interface FunctionalInterface {
	int start(int value1, int value2);
}

interface AnotherFunctionalInterface {
	int start(String value);
}


class Car{
	
	public void drive(FunctionalInterface obj) {
		System.out.println("Driving the car..");
		int number = obj.start(10, 20);
		System.out.println("Returning the number: " + number);
	}
}


public class lambdaExpression {
	public static void main(String[] args) {
		
		Car car1 = new Car();
		
		//Anonymous Class
		car1.drive(new FunctionalInterface() {
			public int start(int value1, int value2) {
				System.out.println("Start driving..");
				return value1*value2;
				
			}
		});
		
		System.out.println(" ");
		System.out.println("Now using Lambda Expressions: ");
		
		//Lambda Expression
		car1.drive((value1, value2) -> {
			System.out.println("Again start driving!!");
			return value1*value2;
		});
		
	}

}
