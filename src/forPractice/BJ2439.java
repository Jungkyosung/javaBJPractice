package forPractice;

import java.util.Scanner;

public class BJ2439 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		int lineOfStar = scn.nextInt();
		
		String starLine = "";
		
		for (int i = 0 ; i < lineOfStar ; i++) {
			String blankLine = "";
			for ( int j = lineOfStar-1 ; j > i ; j--) {
				blankLine = blankLine + " ";
			}
			
			starLine = starLine + "*";
			
			System.out.println(blankLine + starLine);
		}
	}
}
