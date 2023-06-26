package ioAndFourArithmeticOperations;

import java.util.Scanner;

public class hello {

	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int A = scn.nextInt();
		int B = scn.nextInt();
		
		
		System.out.println(hello.sumOf(A,B));
		System.out.println(hello.minusAtoB(A,B));
		System.out.println(hello.multiplyAtoB(A,B));
		System.out.println(hello.divideAtoB(A,B));
		System.out.println(hello.modOfDivedeAtoB(A,B));
		
	}
	
	public static int sumOf(int intA, int intB) {
		
		return intA + intB;
	}
	
	public static int minusAtoB(int intA, int intB) {
		
		return intA - intB;
	}

	public static int multiplyAtoB(int intA, int intB) {
	
		return intA * intB;
	}

	public static int divideAtoB(int intA, int intB) {
		
		return intA / intB;
	}

	public static int modOfDivedeAtoB(int intA, int intB) {
		
		return intA%intB;
	}

}
