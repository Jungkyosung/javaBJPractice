package ifPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BJ2480 {

	public static void main(String[] args) {


		Scanner scn = new Scanner(System.in);
		
		int A = scn.nextInt();
		int B = scn.nextInt();
		int C = scn.nextInt();
		
		scn.close();
		
		int[] arrInt = { A, B, C};
		
		int prize = 0;
		
		Map<Integer,Integer> cntOfDice = new HashMap<>();
		
		for (int i = 1; i < 7 ; i++) {
			cntOfDice.put(i, 0);
		}
		
		cntOfDice.put(A, cntOfDice.get(A)+1);
		cntOfDice.put(B, cntOfDice.get(B)+1);
		cntOfDice.put(C, cntOfDice.get(C)+1);
		
		boolean checkedOverTwo = false;
		
		for (int i = 1; i < 7 ; i++) {
			if(cntOfDice.get(i) == 3) {
				System.out.println(10_000 + i * 1_000);
				checkedOverTwo = true;
						
			} else if(cntOfDice.get(i) == 2) {
				System.out.println(1_000 + i * 100);
				checkedOverTwo = true;
			}
		}
		
		if(checkedOverTwo == false) {
			int max = 0;
			if(A > B) {
				max = A;
			} else {
				max = B;
			}
			
			if ( max > C) {
				
			} else {
				max = C;
			}
			System.out.println(max * 100);
		}
	}
}
