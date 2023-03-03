//Enum önceden tanımlanmıs sabit degerleri ifade etmek icin kullanılır.
// Enum tanımlandıgında private methodu kullanmak zorunludur!!

public enum Color {
	
	RED("Passion"), GREEN("Health"), BLUE("Calm");
	
	private String meaning;
	
	Color(String meaning){
		this.meaning= meaning;
	}
	
	public String getMeaning() {
		return meaning;
	}
	
	public String toString() {
		return "This color meaning is: " + meaning;
	}
	

}
