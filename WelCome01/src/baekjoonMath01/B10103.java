package baekjoonMath01;

import java.util.Scanner;

public class B10103 {
	public static void main(String[] args) {
		// Git ���� 10103�� �ֻ��� ���� - ���� �˰��� �з� : ���� ���� ��Ģ����
		// ������ ���� ���� �� ����� ������ ���ϴ� ���α׷� �����
		
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
