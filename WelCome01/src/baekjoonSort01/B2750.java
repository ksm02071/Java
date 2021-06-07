package baekjoonSort01;

import java.util.Arrays;
import java.util.Scanner;

public class B2750 {
	public static void main(String[] args) {
		// Git 문제 2750번 수 정렬하기   - 백준 알고리즘 분류 : 정렬
		
		// 1. N개의 수가 주어졌을때 오름차순으로 정렬할 것
		
		Scanner scan = new Scanner(System.in);
		
		int testCase = scan.nextInt();
		
		int [] array = new int [testCase];
		
		for (int i = 0 ; i < testCase ; i ++) {
			
			array[i] = scan.nextInt();
		}
		
		Arrays.sort(array);
		
		for (int res : array) {
			System.out.println(res);
		}
								
	}

}
