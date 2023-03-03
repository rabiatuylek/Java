
public class Application {
	public static void main(String[] args) {
		
		Color color1 = Color.GREEN;
		
		switch(color1) {
		
		case BLUE:
			System.out.println("Blue haha");
			break;
		case GREEN:
			System.out.println("Green heyoo");
			break;
		case RED:
			System.out.println("Red hehe");
			break;
		default:
			break;
				
		}
		
		System.out.println(Color.RED);
		System.out.println("Enum meaning as a string is:" + Color.RED.name());
		System.out.println(Color.GREEN.getClass());
		System.out.println(Color.GREEN instanceof Enum);
		System.out.println(Color.RED.getMeaning());
		
		Color color2 = Color.valueOf("RED");
		System.out.println(color2);
	}

}
