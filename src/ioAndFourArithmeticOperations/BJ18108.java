package ioAndFourArithmeticOperations;

import java.util.Scanner;

public class BJ18108 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int byear = scn.nextInt();
		
		System.out.println(BJ18108.exchangeByeartoCyear(byear));

	}
	
	public static int exchangeByeartoCyear(int byear) {
		int cyear = byear - 544;
		return cyear;
	}

}
