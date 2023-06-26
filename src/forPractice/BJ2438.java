package forPractice;

import java.util.Scanner;

public class BJ2438 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int lineOfStar = scn.nextInt();
		
		String starLine = "";
		
		for (int i = 0 ; i < lineOfStar ; i++) {
			starLine = starLine + "*";
			System.out.println(starLine);
		}
	}
}
