package again;

import java.util.Scanner;

public class BaekJoon10822 {
	
	public static void main(String[] args) {
		
		// 1. ���ϱ� �����ϱ�.
		// 2. �־��� ���ڿ��� ���������� �Ľ��Ͽ� �� ���ϱ�.
		// 3. �޸� ó���� ����� �� �ΰ�?
		
		
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
