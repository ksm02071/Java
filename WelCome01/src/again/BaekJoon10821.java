package again;

import java.util.Scanner;

public class BaekJoon10821 {
	
	public static void main(String[] args) {
		// 1. 정수의 개수  복습하기
		// 2. 콤마로 이루어진 문자열이 주어진다
		// 3. 문자열에 포함된 정수의 개수를 구해야함
		
		Scanner scan = new Scanner(System.in);
		int count = 0;
		
		String [] array = null;
		String input = scan.next();
		
		array = input.split(",");
		
		for (String res : array) {
			count ++;
		}
		System.out.println(count);
	}
}
