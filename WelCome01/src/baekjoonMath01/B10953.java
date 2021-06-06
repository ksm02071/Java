package baekjoonMath01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B10953 {
	
	public static void main(String[] args)  throws Exception{
		
		// Git 문제 10953번 A+B - 6 - 백준 알고리즘 분류 : 수학
		
		// 1. 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		
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
