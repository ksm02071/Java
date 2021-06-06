package baekjoonMath01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B10822 {
	public static void main(String[] args) throws Exception {
		// Git 문제 10822번 더하기  - 백준 알고리즘 분류 : 수학 구현 문자열 사칙연산 파싱
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		String [] array = S.split(",");
		int sum = 0 ;
		
		for (String res : array) {
			
			// 문자열 -- > 정수형 파싱
			int changeString = Integer.parseInt(res);
			
			sum = sum + changeString;
		}
		
		System.out.println(sum);
		
	}

}
