package ifPractice;

import java.util.Scanner;

public class BJ2525 {
	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		
		int H = scn.nextInt();
		int M = scn.nextInt();
		int cookTime = scn.nextInt();
		
		int HOfCookTime = cookTime/60;
		int MOfCookTime = cookTime%60;
		
		H = HOfCookTime + H;
		M = MOfCookTime + M;
		
		if( M > 59) {
			M = M - 60;
			H = H + 1;
		}
		
		if( H > 23) {
			H = H - 24;
		}
		
		System.out.println(H+" "+M);
				
	}
}
