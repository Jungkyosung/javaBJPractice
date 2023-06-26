package forPractice;

import java.util.Scanner;

public class BJ25304 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int totalAmount = scn.nextInt();
		int cntOfProducts = scn.nextInt();
		
		for (int i = 0; i < cntOfProducts ; i ++) {
			
			int price = scn.nextInt();
			int quantity = scn.nextInt();
			
			totalAmount -= (price*quantity);
		}
		
		if(totalAmount == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
