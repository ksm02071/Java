package again;

import java.util.Scanner;

public class BaekJoon11365 {
	public static void main(String[] args) {
		
		// 1. !�к���� �����ϱ�
		// 2. �־��� ���ڿ��� �������
		
		Scanner scan = new Scanner(System.in);
		
		String S = "";
	
		while(true) {
			
			S = scan.nextLine();
			
			if (S.equals("END")) {
				break;
			}else {
				StringBuilder sb = new StringBuilder();
				sb.append(S).reverse();
				System.out.println(sb);
			}
		
		}
	}

}
