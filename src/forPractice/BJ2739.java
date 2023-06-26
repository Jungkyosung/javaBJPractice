package forPractice;

import java.util.Scanner;

public class BJ2739 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		for ( int i = 1; i < 10 ; i++) {
			String A = n + " * " + i + " = " + n*i;
			System.out.println(A);
		}

	}

}
