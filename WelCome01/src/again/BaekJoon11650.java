package again;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BaekJoon11650 {
	
	public static void main(String[] args) throws Exception{
		
		// 1.좌표 정렬하기 복습하기
		// 2. x 좌표가 증가하는 순으로 x 좌표가 같다면 y 좌표가 증가하는 순서로 정렬할 것
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		
		
		// 테스트 케이스
		int testCase = Integer.parseInt(br.readLine());
		
		// 2차원배열 - N행 2열
		int [][] array = new int [testCase][2];
		
		// 배열에 데이터 넣기.
		for (int i = 0 ; i < testCase ; i ++) {
			st = new StringTokenizer(br.readLine()," ");
			array[i][0] = Integer.parseInt(st.nextToken());
			array[i][1] = Integer.parseInt(st.nextToken());
			
			// 테스트 코드.
//			System.out.println(i +  " "  +  array[i][0] + "  0번째");
//			System.out.println(i +  " "  +  array[i][1] + "  1번째");
		}
		
		// 배열 정렬
		Arrays.sort(array , new Comparator<int []>() {
			
			
			
			@Override
			public int compare(int[] x, int[] y) {
				
				if (x[0] == y[0]) {
	
					return x[1] -  y[1];
				}else {
					return x[0] - y[0];
				}
				
			}
		});
		
		// 출력
		StringBuilder sb ;
		sb = new StringBuilder();
		
		for (int i = 0 ; i < testCase ; i ++) {
			
			sb.append(array[i][0]).append(" ").append(array[i][1] + "\n");
		}
		System.out.println(sb);
	}

}
