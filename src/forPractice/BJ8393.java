package forPractice;

import java.util.Scanner;

public class BJ8393 {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int N = scn.nextInt();
		
		int sum = 0;
		
		for ( int i = 1; i < N+1 ; i++) {
			sum = sum + i;
		}
		
		System.out.println(sum);
	}

}
