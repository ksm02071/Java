package baekjoonSort01;

import java.util.Arrays;
import java.util.Scanner;

public class B2750 {
	public static void main(String[] args) {
		// Git ���� 2750�� �� �����ϱ�   - ���� �˰��� �з� : ����
		
		// 1. N���� ���� �־������� ������������ ������ ��
		
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
