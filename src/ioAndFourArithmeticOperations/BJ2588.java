package ioAndFourArithmeticOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BJ2588 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int intA = scn.nextInt();
		int intB = scn.nextInt();
		
		int lengthOfIntB = (int)(Math.log10(intB)+1);
		
		List<Integer> arrIntB = new ArrayList<>();
		
		int tempIntB = intB;
		
		for (int i = 1; i <= lengthOfIntB ; i++) {
			arrIntB.add(tempIntB%10);
			tempIntB /= 10;
		}
		
		for (int i = 0; i < lengthOfIntB ; i++) {
			System.out.println(intA * arrIntB.get(i));
			//System.out.println(intA * arrIntB.indexOf(i));
		}
		
		System.out.println(intA*intB);
		
	}

}
