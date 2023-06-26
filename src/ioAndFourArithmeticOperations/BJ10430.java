package ioAndFourArithmeticOperations;

import java.util.Scanner;

public class BJ10430 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int intA = scn.nextInt();
		int intB = scn.nextInt();
		int intC = scn.nextInt();
		
		System.out.println(BJ10430.cal1(intA, intB, intC));
		System.out.println(BJ10430.cal2(intA, intB, intC));
		System.out.println(BJ10430.cal3(intA, intB, intC));
		System.out.println(BJ10430.cal4(intA, intB, intC));

	}
	
	public static int cal1(int A, int B, int C) {
		
		return (A + B) % C;
	}
	public static int cal2(int A, int B, int C) {
		
		return ((A%C) + (B%C))%C;
	}
	public static int cal3(int A, int B, int C) {
		
		return (A * B) % C;
	}
	public static int cal4(int A, int B, int C) {
		
		return ((A%C) * (B%C))%C;
	}

}
