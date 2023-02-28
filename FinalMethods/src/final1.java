//Final Methods

class Student{
	
	public static final int MY_CONSTANT = 8;
	public String name;
	public static String studentClass;
	public static String word = "again me";
	
	// public void
	public void studentName() {
		System.out.println(name + "is enrolled in: " + studentClass);
		
	}
	
	// public static void
	public static void classInfo() {
		System.out.println(word);
	}	
	
}

public class final1 {
	public static void main(String[] args) {
		
		Student.studentClass = "Welcome the course :))";
		System.out.println(Student.studentClass);
		
		Student student1 = new Student();
		Student student2 = new Student();
		
		student1.name = "Steven";
		student2.name = "daniel";
		
		student1.studentName();
		student2.studentName();
		
		student2.classInfo();
		System.out.println(Student.MY_CONSTANT);
	}

}
