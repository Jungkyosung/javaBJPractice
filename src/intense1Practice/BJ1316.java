package intense1Practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BJ1316 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		
		while ((str = br.readLine()) != null  && !str.isEmpty()) {
			//문자 길이 체크
			//첫째 문자
			//문자 인덱스 찾기
			//예를 들어 aaa면
			//0,1,2
			//반복문으로 연속된지 체크(만약 문자가 한개면 패스)
			//0 + 1 == 1...
			//1 + 1 == 2
			//패스하면 최종개수 + 1
			//그렇다면 aabaa면
			//0, 1, 3, 4
			//그렇다면 aabbcc면
			//0, 1
			//0, 1
			
			//a를 패스 했다면 이후 a는 무시하면 좋겠음
			
			//2, 3
			//2, 3
			
			//4, 5
			//4, 5
			
			
			

		}

	}

}
