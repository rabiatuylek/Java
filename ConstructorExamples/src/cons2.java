

class studentt {
	
	public String name;
	public static String studentClass;
	
	
	public void studentName() {
		// it can call all of variable.
		System.out.println(name);
		System.out.println(name + " is enrolled in: " + studentClass);
	}
	
	public static void classInfo() {
		System.out.println("Java");
		// static just can call static variable.
		//System.out.println(name); this gives you an error.
	}
}

public class cons2 {
	public static void main(String[] args) {
		
		studentt.studentClass = "Web Development Fundamentals";
		System.out.println(studentt.studentClass);
		studentt student1 = new studentt();
		studentt student2 = new studentt();

		student1.name = "Steven";
		student2.name = "Daniel";
		
		student1.studentName();
		student2.studentName();
		
		studentt.classInfo();
						
	}

}
