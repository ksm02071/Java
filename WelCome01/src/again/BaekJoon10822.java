package again;

import java.util.Scanner;

public class BaekJoon10822 {
	
	public static void main(String[] args) {
		
		// 1. 더하기 복습하기.
		// 2. 주어진 문자열을 정수형으로 파싱하여 합 구하기.
		// 3. 콤마 처리는 어떻게할 것 인가?
		
		
		Scanner scan = new Scanner(System.in);
		
		int sum = 0 ;
		String[] S = scan.nextLine().split(",");
		
		for (String res : S) {
			
			int findString = Integer.parseInt(res);
			sum = sum += findString;
		}
		System.out.print(sum);
	}
}
