package arrayPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BJ10807 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String cntOfN = br.readLine();
		String listOfN = br.readLine();
		String v = br.readLine();
		br.close();
		int intV = Integer.valueOf(v);
		
		StringTokenizer st = new StringTokenizer(listOfN);
		
		int cntOfV = 0;
		
		while(st.hasMoreTokens()) {
			if(intV == Integer.valueOf(st.nextToken())){
				cntOfV ++;
			}
		}
		bw.write(String.valueOf(cntOfV));
		bw.flush();
		bw.close();
	}
}
