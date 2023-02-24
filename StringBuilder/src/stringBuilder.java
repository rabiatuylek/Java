//String Builder works promptly instead of writing long sentences.


public class stringBuilder {
	public static void main(String[] args) {
		
		String text = "Rabia";
		
		StringBuilder example = new StringBuilder();
		example.append("hello ").append("my name ").append("is: ").append(text);
		
		System.out.println(example);
		
		// or
		
		StringBuilder exp2 = new StringBuilder();
		exp2.append("a");
		exp2.append("b");
		exp2.append("c");
		
		String result = exp2.toString();
		System.out.println(result);
	}
}
