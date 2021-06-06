package baekjoonString01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B11365 {
	
	public static void main(String[] args) throws Exception {
		
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
