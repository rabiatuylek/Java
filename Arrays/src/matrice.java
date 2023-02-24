//Multidimensional Arrays
//Nested For Loops

public class matrice {
	public static void main(String[] args) {
		//create 1D Array
		int[] oneDarray = {12, 49, 922};
		System.out.println(oneDarray[0]);
		System.out.println("The length of 1D Array is: "+ oneDarray.length);
		for (int i=0; i< oneDarray.length; i++){
			System.out.println(i + ".index "+ "1D Array is: "+" " + oneDarray[i]);
		}
		
		int j;
		//create 2D Array
		//2D Arrays also mean Nested For Loops.
		int[][] twoDarray = {{34,58,12,67}, {16, 6, 90,24}, {39,63,98,47}};
		System.out.println("The length of 2D Array is: "+ twoDarray.length);
		for (int i=0; i< twoDarray.length; i++) {
			for(j = 0; j< twoDarray[i].length; j++ ) {
				System.out.println(twoDarray[i][j] + "\t");
			}
			System.out.println();
			
		}
	}

}
