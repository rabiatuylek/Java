
public class converting {
	public static void main(String[] args) {
		
		byte byteValue = 3;
		short shortValue = 38;
		int intValue = 29;
		long longValue = 93024;
		
		float floatValue = 5.456f;
		double doubleValue = 23.876;
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		
		//Converting Step
		// (int) , (float) ......
		System.out.println("Before int value: " + intValue);
		intValue = (int) longValue;
		System.out.println("After int value:  " + intValue);
		
		int a = (int) floatValue;
		System.out.println("a: " + a);
		
		float b = (float) intValue;
		System.out.println("b : " + b);
		
	}

}
