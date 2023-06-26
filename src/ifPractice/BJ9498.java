package ifPractice;

import java.util.Scanner;

public class BJ9498 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		int A = scn.nextInt();
		
		scn.close();
		
		if ( A%4 == 0 && (A%400 == 0 || A%100 != 0)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
		
	}
}
