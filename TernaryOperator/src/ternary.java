// ternary operator
// x ?  a : b ---> If x is true, a is converted or if x is false, b is converted.

public class ternary {
	public static void main(String[] args) {
		
		int number = 8;
		number = number > 28 ? 45 : number;
		System.out.println("The number is: " + number);
		
		 int[] liste = {222, 78, 45};
		 int exp;
		 exp = liste[1] < 47 ? liste[2] : liste[0];
		 System.out.println(exp);
	}
	

}
