package baekjoonMath01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B9295 {
	
	public static void main(String[] args) throws Exception{
		// Git ���� 9285�� �ֻ��� - ���� �˰��� �з� : ���� ���� ��Ģ����
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		
		int x , y;
		int testCase = Integer.parseInt(br.readLine());
		
		for (int i = 0 ; i < testCase ; i ++) {
			st = new StringTokenizer(br.readLine(), " ");
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			
			System.out.println("Case "+ (i +1) +": " + (x + y));
		}
	}

}
