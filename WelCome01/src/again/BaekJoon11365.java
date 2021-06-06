package again;

import java.util.Scanner;

public class BaekJoon11365 {
	public static void main(String[] args) {
		
		// 1. !밀비급일 복습하기
		// 2. 주어진 문자열을 뒤집어보자
		
		Scanner scan = new Scanner(System.in);
		
		String S = "";
	
		while(true) {
			
			S = scan.nextLine();
			
			if (S.equals("END")) {
				break;
			}else {
				StringBuilder sb = new StringBuilder();
				sb.append(S).reverse();
				System.out.println(sb);
			}
		
		}
	}

}
