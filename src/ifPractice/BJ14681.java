package ifPractice;

import java.util.Scanner;

public class BJ14681 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int X = scn.nextInt();
		int Y = scn.nextInt();
		
		if( X > 0 && Y > 0) {
			System.out.println(1);
		} else if( X < 0 && Y < 0) {
			System.out.println(3);
		} else if( X < 0 && Y > 0 ) {
			System.out.println(2);
		} else {
			System.out.println(4);
		}

	}

}
