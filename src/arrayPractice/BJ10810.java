package arrayPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class BJ10810 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Scanner scn = new Scanner(System.in);
		
		int N = 0;
		int M = 0;
		String str = "";
		String arrStr[] = {}; 
		
		str = br.readLine();
		arrStr = str.split(" ");
		
		N = Integer.parseInt(arrStr[0]);
		M = Integer.parseInt(arrStr[1]);
		
		int arrInt[] = new int[N];
		for (int each : arrInt) {
			each = 0;
		}
		
		str = null;
		while ((str = br.readLine()) != null && !str.isEmpty()) {
            arrStr = str.split(" ");
            int a = Integer.parseInt(arrStr[0]);
            int b = Integer.parseInt(arrStr[1]);
            int c = Integer.parseInt(arrStr[2]);
            
            for(int j = a; j <= b; j++ ) {
				
				arrInt[j-1] = c;
			}
        }
		String result = "";
		for (int each : arrInt) {
			result = result + " " + each;
		}
		
		result = result.substring(1);
		
		br.close();
		bw.write(result);
		bw.flush();
		bw.close();
	}

}
