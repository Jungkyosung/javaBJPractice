package ifPractice;

import java.util.Scanner;

public class BJ1330 {

	public static void main(String[] args) {


		Scanner scn = new Scanner(System.in);
		
		int A = scn.nextInt();
		int B = scn.nextInt();
		
		if( A - B == 0 ) {
			System.out.println("==");
		} else if( A - B > 0) {
			System.out.println(">");
		} else {
			System.out.println("<");
		}

	}

}
