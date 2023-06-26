package forPractice;

import java.util.Scanner;

public class BJ10952 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int A = 0;
		int B = 0;
		int sum = 0;
		do {
			A = scn.nextInt();
			B = scn.nextInt();
			sum = A + B;
			if(sum != 0) {
				System.out.println(sum);
			}
			
		} while ((sum) != 0);
	}

}
