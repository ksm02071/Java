package baekjoonString01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B10821 {
	
	public static void main(String[] args) throws Exception {
		// Git 문제 10821번 정수의 개수 - 백준 알고리즘 분류 : 문자열 애드 혹 파싱
		
		// 1. 숫자와 콤마로만 이루어진 문자열 S에서 정수의 개수를 구하는 프로그램 만들기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] array = null;
		String S = br.readLine();
		int count = 0;
		
		array = S.split(",");
		
		for (String res : array) {
			// 예외처리 추가
			try {
				int change = Integer.parseInt(res);
				count ++;
			} catch (Exception e) {
				System.out.println(e);
				System.out.println(e.getMessage());
			}
			
		}
		
		System.out.print(count);

	}
}
