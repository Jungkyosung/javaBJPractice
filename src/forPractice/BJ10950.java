package forPractice;

import java.util.Scanner;

public class BJ10950 {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);

		int cntOfRepeat = scn.nextInt();
		
		for ( int i = 0 ; i < cntOfRepeat ; i ++) {
			int A = scn.nextInt();
			int B = scn.nextInt();
			
			System.out.println(A+B);
		}
		
	}

}
