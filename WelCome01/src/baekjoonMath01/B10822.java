package baekjoonMath01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B10822 {
	public static void main(String[] args) throws Exception {
		// Git ���� 10822�� ���ϱ�  - ���� �˰��� �з� : ���� ���� ���ڿ� ��Ģ���� �Ľ�
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		String [] array = S.split(",");
		int sum = 0 ;
		
		for (String res : array) {
			
			// ���ڿ� -- > ������ �Ľ�
			int changeString = Integer.parseInt(res);
			
			sum = sum + changeString;
		}
		
		System.out.println(sum);
		
	}

}
