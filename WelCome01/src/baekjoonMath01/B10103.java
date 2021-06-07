package baekjoonMath01;

import java.util.Scanner;

public class B10103 {
	public static void main(String[] args) {
		// Git 문제 10103번 주사위 게임 - 백준 알고리즘 분류 : 수학 구현 사칙연산
		// 게임이 끝난 이후 두 사람의 점수를 구하는 프로그램 만들기
		
		Scanner scan = new Scanner(System.in);
		
		int userOne = 100;
		int userTwo = 100;
		
		int diceX = 0;
		int diceY = 0;
		
		int round = scan.nextInt();
		
		for (int i = 0 ; i < round ; i ++) {
			
			diceX = scan.nextInt();
			diceY = scan.nextInt();
			
			// 
			if (diceX < diceY) {
				userOne = userOne - diceY;
				
			}if (diceX > diceY ) {
				userTwo = userTwo - diceX;
				
			}else if (diceX == diceY) {
				continue;
			}
		}
		System.out.println(userOne + "\n" + userTwo);
//		System.out.println(userTwo);
	}
}
