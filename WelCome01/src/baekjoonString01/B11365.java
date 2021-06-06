package baekjoonString01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B11365 {
	
	public static void main(String[] args) throws Exception {
		// Git 문제 11365번 !밀비급일 - 백준 알고리즘 분류 : 문자열
		
		// 1. 주어진 문자열 뒤집기.
				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String S = br.readLine();
			if (S.equals("END")) {
				break;
			}else {
				StringBuilder sb = new StringBuilder(S);
				sb.reverse();
				
				System.out.println(sb);
			}
			
		}
	}
}
