package arrayPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BJ2562 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int order = 1;
		int orderOfMax = 1;
		int max = 0;
		
		max = Integer.parseInt(br.readLine());
		
		String str = "";
		
		while((str = br.readLine()) != null) {
			if(str == "") break;
			order ++;
			
			int temp = Integer.parseInt(str);
			if( max > temp) {
				
			} else {
				max = temp;
				orderOfMax = order;
			}
		}
		br.close();
		
		bw.write(String.valueOf(max));
		bw.write("\n");
		bw.write(String.valueOf(orderOfMax));
		bw.flush();
		bw.close();
	}

}
