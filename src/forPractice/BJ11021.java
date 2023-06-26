package forPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BJ11021 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		
		int cntOfCase = Integer.parseInt(s);
		
		for ( int i = 0; i < cntOfCase ; i++) {
			String bufferInput = br.readLine();
			StringTokenizer st = new StringTokenizer(bufferInput);
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			int sum = N + M;
			String strOfSum = "Case #" + (i+1) + ": " + sum;
			bw.write(String.valueOf(strOfSum));
			bw.newLine();
			
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
