
public class matrice2 {
	public static void main(String[] args) {
		
		int[][] twoDarray = new int[4][3]; // (3,2) matris oluşturuldu.
		// default old. icin her elemen 0.
		System.out.println(twoDarray[3][2]); // got 0 on the console.
		twoDarray[2][1] = 47;
		System.out.println(twoDarray[2][1]);
	}

}
