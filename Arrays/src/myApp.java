//Arrays
public class myApp {
	public static void main(String[] args) {
		int[] numbers = new int[5];  //liste kaç elemana sahip, onu söylüyor.
		numbers[0] = 1;
		numbers[1] = 2;
		//numbers[2] = 3;
		numbers[3] = 4;
		numbers[4] = 5;
		
		int[] otherList = {12,14,15,19,23,15,19,27};  // 1D Array
		
		System.out.println(numbers[0]); 
		System.out.println(numbers[1]);
		System.out.println(numbers[2]); //atanmamıs olan listedeki degiskeni default olarak 0 dondurur.
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		
		// or
		//listeyi pythondaki gibi direk print(liste) yapamazsın!!!!
		for(int i = 0; i<otherList.length; i++) {
			
			System.out.println("Other List: "+ " " + otherList[i]);
		}
	}

}
