package baekjoonString01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B11365 {
	
	public static void main(String[] args) throws Exception {
		// Git ���� 11365�� !�к���� - ���� �˰��� �з� : ���ڿ�
		
		// 1. �־��� ���ڿ� ������.
				
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
