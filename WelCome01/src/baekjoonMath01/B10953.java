package baekjoonMath01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B10953 {
	
	public static void main(String[] args)  throws Exception{
		
		// Git ���� 10953�� A+B - 6 - ���� �˰��� �з� : ����
		
		// 1. �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine()); // input 5
		
		String [] array = null;
		int [] numberArray = new int [count];
		
		
		for ( int i = 0 ; i < count ; i ++) { // ing 5
			array = br.readLine().split(","); // input number , number			
			numberArray[i] = Integer.parseInt(array[0]) + Integer.parseInt(array[1]);
		}
		
		for (int res : numberArray) {
			System.out.println(res);
		}
		
	}
}
