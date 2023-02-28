//Java Encapsulation, temel olarak bir sınıfın, içinde yer alan metotların ve degişkenlerin 
//koruması islemine denir. Programlarımızı hazırlarken bazı bilgilerin her yerden kolay bir şekilde 
//degistirilmemesini ve ulaşılmamasını isteyebiliriz.

// just public return with return !!
class Car {
	
	public static final int speed = 150;
	private String type;
	
	public String getType() {
		//System.out.println(type);
		return type;
	}
	
	public String getRevenueData() {
		String data = "Revenue: " + calculateRevenue();
		System.out.println(data);
		return data;
	}
	
	private int calculateRevenue() {
		return 12000;
	}
	
	public void setType(String type) {
		this.type = type;
		System.out.println(type);
	}
	
}

public class App {
	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.getType();
		car1.getRevenueData();
		car1.setType("hello");
	}

}
