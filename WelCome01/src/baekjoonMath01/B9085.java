package baekjoonMath01;

import java.util.Scanner;


public class B9085 {
	public static void main(String[] args) throws Exception  {
		
		// Git ���� 9085�� ���ϱ� - ���� �˰��� �з� : ����
		// 1. 10���� �۰ų� ���� �ڿ��� N���� �ָ� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
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
