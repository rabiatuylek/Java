// increase number of population in class.

class person {
	
	public String name;
	public static String studentClass;
	public static int count =0;
	public static String word = "heyyoo";
		
	public void studentName() {
		System.out.println(name + " is enrolled in: " + studentClass);
	}
	
	public static void classInfo() {
		System.out.println(word);
	}
	
	public person() {
		count++;
	}
	
}
public class IncreasingNumber {
	public static void main(String[] args) {
		person.studentClass = "welcome the course :)";
		System.out.println(person.studentClass);
		
		person.classInfo();
		System.out.println("before pop. numb.: " + person.count);
		
		person student1 = new person();
		person student2 = new person();
		
		student1.name = "elmas";
		student2.name = "rabia";
		student1.studentName();
		student2.studentName();	
			
		System.out.println("after enrolled: " + person.count);
		student2.classInfo();
		
	}

}
