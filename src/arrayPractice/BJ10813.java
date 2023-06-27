package arrayPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BJ10813 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		String arrStr[] = str.split(" ");
		
		int N = Integer.parseInt(arrStr[0]);
		int M = Integer.parseInt(arrStr[1]);
		
		int arrInt[] = new int[N];
		for(int i = 0; i< N ; i++) {
			arrInt[i] = i+1;
		}
		
		
		while((str = br.readLine()) != null && !str.isEmpty()) {
			int temp = 0;
			int a = 0;
			int b = 0;
			
			String arrStr2[] = str.split(" ");
			
			a = Integer.parseInt(arrStr2[0])-1;
			b = Integer.parseInt(arrStr2[1])-1;
			
			temp = arrInt[a];
			arrInt[a] = arrInt[b];
			arrInt[b] = temp;
			
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
