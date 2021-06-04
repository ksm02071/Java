package baekjoonMath01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B4101 {
	
	public static void main(String[] args) throws Exception {
		// Git 문제 4101번 크냐 ? - 백준 알고리즘 분류 : 수학
		
		// 1. 첫 번째 수가 두번째 수 보다 큰지 구하는 프로그램 만들기
		
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
