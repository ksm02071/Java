package again;

import java.util.Scanner;

public class BaekJoon10821 {
	
	public static void main(String[] args) {
		// 1. ������ ����  �����ϱ�
		// 2. �޸��� �̷���� ���ڿ��� �־�����
		// 3. ���ڿ��� ���Ե� ������ ������ ���ؾ���
		
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
