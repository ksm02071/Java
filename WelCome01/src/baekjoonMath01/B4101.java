package baekjoonMath01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B4101 {
	
	public static void main(String[] args) throws Exception {
		// Git ���� 4101�� ũ�� ? - ���� �˰��� �з� : ����
		
		// 1. ù ��° ���� �ι�° �� ���� ū�� ���ϴ� ���α׷� �����
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		
		while(true) {
			st = new StringTokenizer(br.readLine()," ");
			int oneNumber = Integer.parseInt(st.nextToken());
			int twoNumber = Integer.parseInt(st.nextToken());
			
			if (oneNumber > twoNumber) {
				System.out.println("Yes");
				
			}else if (oneNumber == 0 && twoNumber == 0) {
				break;
			}
			else {
				System.out.println("No");
				
			}
		}
	}
}
