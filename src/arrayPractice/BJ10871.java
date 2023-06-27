package arrayPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BJ10871 {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String first = br.readLine();
		StringTokenizer st = new StringTokenizer(first);
		
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		String listOfN = br.readLine();
		StringTokenizer st2 = new StringTokenizer(listOfN);
		
		br.close();
		
		String str = "";
		
		while (st2.hasMoreTokens()) {
			String token = st2.nextToken();
			if (X > Integer.parseInt(token)) {
				str = str + " " + token;
			}
		}
		str = str.substring(1);
		
		bw.write(str);
		bw.flush();
		bw.close();

	}

}
