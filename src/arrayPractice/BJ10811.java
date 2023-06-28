package arrayPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BJ10811 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		//첫재쭐 입력 받음
		String str = br.readLine();
		String arrStr[] = str.split(" ");
		
		int N = Integer.parseInt(arrStr[0]);
		int M = Integer.parseInt(arrStr[1]);
		int arrInt[] = new int[N];
		int arrIntCopy[] = new int[N];
		
		for ( int i = 0 ; i < N ; i++) {
			arrInt[i] = i+1;
		}
		
		arrIntCopy = arrInt.clone();
		
		while ((str = br.readLine()) != null  && !str.isEmpty()) {
			arrStr = str.split(" ");
			int a = Integer.parseInt(arrStr[0]);
			int b = Integer.parseInt(arrStr[1]);
			
			for (int i = a ; i <= b ; i++) {
				arrInt[i-1] = arrIntCopy[b-i+a-1];
			}
			arrIntCopy = arrInt.clone();
		}
		
		String result = "";
		for ( int each : arrInt) {
			result = result + " " + each;
		}
		
		result = result.substring(1);
		
		br.close();
		bw.write(result);
		bw.flush();
		bw.close();
		
	}

}
