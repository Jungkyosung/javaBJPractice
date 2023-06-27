package arrayPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BJ10818 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String N = br.readLine();
		String listOfN = br.readLine();
		StringTokenizer st = new StringTokenizer(listOfN);
		
		br.close();
		
		int first = Integer.parseInt(st.nextToken());
		
		int max = first;
		int min = first;
		int tempInt = 0;
		
		while (st.hasMoreTokens()) {
			tempInt = Integer.parseInt(st.nextToken());
			if(max > tempInt) {
				
			} else {
				max = tempInt;
			}
			
			if(min < tempInt) {
				
			} else {
				min = tempInt;
			}
		}
		
		String result = "" + min + " " + max;
		bw.write(result);
		bw.flush();
		bw.close();
	}
}
