package baekjoonString01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B10821 {
	
	public static void main(String[] args) throws Exception {
		// Git ���� 10821�� ������ ���� - ���� �˰��� �з� : ���ڿ� �ֵ� Ȥ �Ľ�
		
		// 1. ���ڿ� �޸��θ� �̷���� ���ڿ� S���� ������ ������ ���ϴ� ���α׷� �����
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] array = null;
		String S = br.readLine();
		int count = 0;
		
		array = S.split(",");
		
		for (String res : array) {
			// ����ó�� �߰�
			try {
				int change = Integer.parseInt(res);
				count ++;
			} catch (Exception e) {
				System.out.println(e);
				System.out.println(e.getMessage());
			}
			
		}
		
		System.out.print(count);

	}
}
