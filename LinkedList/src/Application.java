import java.util.LinkedList;

public class Application {
	public static void main(String[] args) {
		
		LinkedList<Integer> values = new LinkedList<Integer>();
		//[0]->[1]->[2]->[3]->[4]...
		
		values.add(67);   //index 0.
		values.add(35);   //index 1.
		values.add(20);   // index 2.
		values.add(190);  // index 3.
		
		System.out.println(values.get(2));
		
		for (int i=0; i<values.size(); i++) {
			System.out.println(i + ".index " + values.get(i));
		}
		
		System.out.println("Otger part ");
		System.out.println("Array Size: " + values.size());
		
		values.remove(values.size()-1);
		for (Integer myValues: values) {
			System.out.println(myValues);
		}
		System.out.println("New Array Size: " + values.size());
		
	}

}
