package arrayPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BJ3052 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = "";
		int arrInt[] = new int[10];
		int i = 0;
		
		while((str = br.readLine()) != null && !str.isEmpty()) {
			arrInt[i] = Integer.valueOf(str);
			i = i + 1;
		}
		
		int arrModOfInt[] = new int[10];
		
		for ( int j = 0 ; j < 10 ; j ++) {
			arrModOfInt[j] = arrInt[j]%42;
		}
		
		int arrCnt[] = new int[42];
		
		for ( int k = 0 ; k < 10 ; k++) {
			
			int a = arrModOfInt[k];
			arrCnt[a] = 1;
		}
		
		int cntOfMod = 0;
		
		for(int z = 0 ; z < 42 ; z++) {
			cntOfMod = cntOfMod + arrCnt[z];
		}
		
		String result = String.valueOf(cntOfMod);
		br.close();
		bw.write(result);
		bw.flush();
		bw.close();
		
	}

}
