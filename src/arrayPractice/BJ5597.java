package arrayPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BJ5597 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = "";
		int arrInt[] = new int[30];
		int i = 0;
		
		while((str = br.readLine()) != null && !str.isEmpty()) {
			
			i = Integer.valueOf(str);
			
			arrInt[i-1] = 1;
		}
		
		int arrOfZero[] = new int[2];
		
		for(int j = 0 ; j < 30 ; j++) {
			if(arrInt[j] == 0 && arrOfZero[0] != 0 ) {
				arrOfZero[1] = j + 1;
			} else if( arrInt[j] == 0) {
				arrOfZero[0] = j + 1;
			}
		}
		
		br.close();
		
		bw.write(String.valueOf(arrOfZero[0]));
		bw.write("\n");
		bw.write(String.valueOf(arrOfZero[1]));
		bw.flush();
		bw.close();
	}

}
