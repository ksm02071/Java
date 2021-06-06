package baekjoonMath01;

import java.util.Scanner;


public class B9085 {
	public static void main(String[] args) throws Exception  {
		
		// Git 문제 9085번 더하기 - 백준 알고리즘 분류 : 수학
		// 1. 10보다 작거나 같은 자연수 N개를 주면 합을 구하는 프로그램을 작성하시오.
		
		Scanner scan = new Scanner(System.in);
	
		int count = scan.nextInt();
		
	
		for (int i = 0 ; i < count ; i ++) {
			int sum = 0;
			int twoTestCase = scan.nextInt();
			
			for (int j = 0 ; j < twoTestCase ; j ++) {
				
				int a = scan.nextInt();
				
				sum += a;
			}
			System.out.println(sum);
		}
	}

}
