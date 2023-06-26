package forPractice;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ10951 {

	public static void main(String[] args) throws IOException {
		
		Scanner scn = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int A = 0;
		int B = 0;
		
		while(scn.hasNextLine()) {
			StringTokenizer st = new StringTokenizer(scn.nextLine());
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		bw.write(String.valueOf(A+B));
		bw.newLine();
		}

		bw.flush();
		bw.close();
		scn.close();
	}
}
