import java.util.HashSet;
//import java.util.TreeSet;
// HashSet is just like list in python.
public class AppHashSet {
	public static void main(String[] args) {
		
		HashSet<String> test1 = new HashSet<String>();
		//TreeSet<String> test1 = new TreeSet<String>();   // sıralı bir sekilde cıkartır.
		if(test1.isEmpty()) {
			System.out.println("Set is empty before adding the items");
		}
		
		test1.add("red");
		test1.add("blue");
		test1.add("yellow");
		test1.add("black");
		test1.add("grey");
		test1.add("green");
		test1.add("green");
		
		if (test1.isEmpty()) {
			System.out.println("That is empt :((");
		}
		System.out.println(test1);
		
		for(String items: test1) {
			System.out.println(items);
		}
		if(test1.contains("purple")) {
			System.out.println("Contains Purple");
		}
		else {
			System.out.println("there id not exist purple");
		}
		
		if(test1.contains("blue")){ 
				System.out.println("Contains blue");
		}
		
		HashSet<String> test2 = new HashSet<String>();
		test2.add("red");
		test2.add("heyo");
		test2.add("white");
		test2.add("green");
		
		//Common Items between test1 and test2
		HashSet<String> commonItems = new HashSet<String>(test1);
		commonItems.retainAll(test2);
		System.out.println("New Scheme");
		System.out.println(commonItems);
		
		// Different Items between test1 and test2
		
		HashSet<String> differentItems = new HashSet<String>(test2);
		differentItems.removeAll(test1);
		System.out.println(differentItems);
	}

}
