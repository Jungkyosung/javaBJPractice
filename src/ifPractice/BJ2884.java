package ifPractice;

import java.util.Scanner;

public class BJ2884 {
	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		
		int H = scn.nextInt();
		int M = scn.nextInt();
		
		if( M - 45 < 0) {
			
			H = H - 1;
			if( H == -1 ) {
				H = 23;
			}
			
			int tempM =  M - 45;
			
			M = 60 + tempM;
			
			
		} else {
			M = M - 45;
		}
		
		System.out.println(H+" "+M);
				
	}
}
