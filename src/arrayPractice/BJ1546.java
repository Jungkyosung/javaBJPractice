package arrayPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ1546 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = "";
		
		int cntOfSubject = 0;
		
		int maxScore = 0;
		
		input = br.readLine();
		
		StringTokenizer st = new StringTokenizer(input);
		cntOfSubject = Integer.parseInt(st.nextToken());
		
		input = br.readLine();
		StringTokenizer lineOfSubject = new StringTokenizer(input);
		
		int[] arrOfScore = new int[cntOfSubject];
		double[] reArrOfScore = new double[cntOfSubject];
		
		//배열에 과목별 점수 입력
		for ( int i = 0 ; i < arrOfScore.length ; i ++) {
			arrOfScore[i] = Integer.parseInt(lineOfSubject.nextToken());
		}
		
		//과목 중 최대값 구하기
		maxScore = BJ1546.getMaxIntInArray(arrOfScore);
		
		//과목별 값 재계산
		reArrOfScore = BJ1546.recalculatedSubjectArray(arrOfScore, maxScore);
		
		double sumOfReArrScore = 0;
		
		for( double each : reArrOfScore) {
			sumOfReArrScore += each;
		}
		
		double avg = sumOfReArrScore / reArrOfScore.length;
		
		bw.write(String.valueOf(avg));
		bw.flush();
		bw.close();
	}

	public static int getMaxIntInArray(int[] arr) {
		int max = 0;
		
		for(int each : arr) {
			if(max > each) {
			} else {
				max = each;
			}
		}
		
		return max;
	}
	
	public static double[] recalculatedSubjectArray(int[] arr, int max) {
		double[] reArrOfDouble = new double[arr.length];
		
		for (int i = 0 ; i < arr.length ; i++) {
			reArrOfDouble[i] = (double)arr[i] / max * 100;
		}
		
		return reArrOfDouble;
	}
	
}
