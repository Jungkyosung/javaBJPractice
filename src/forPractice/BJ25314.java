package forPractice;

import java.util.Scanner;

public class BJ25314 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int valueOfByte = scn.nextInt();
		
		int cnt = valueOfByte / 4;
		
		String strOfByte = "";
		
		for (int i = 0; i < cnt ; i++) {
			strOfByte = strOfByte + "long ";
		}
		
		System.out.println(strOfByte + "int");
	}

}
