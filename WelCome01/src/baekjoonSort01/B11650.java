package baekjoonSort01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;


public class B11650 {
	public static void main(String[] args) throws Exception {
		// Git 문제 11650번 좌표 정렬하기   - 백준 알고리즘 분류 : 정렬
		
		// 1. x 좌표가 증가하는 순으로 x 좌표가 같다면 y좌표가 증가하는 순서로 정렬하기
						
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		
		int N = Integer.parseInt(br.readLine());
		int [][] array = new int [N][2]; // N행 2열 
		
		for (int i = 0 ; i < N ; i ++) {
			st = new StringTokenizer(br.readLine()," ");
			array[i][0] = Integer.parseInt(st.nextToken());
			array[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(array, new Comparator<int []>() {
			
			@Override
			public int compare(int[] obj1, int[] obj2) {
				
				if (obj1[0] == obj2[0]) {
					
					return obj1[1] - obj2[1];
				}else {
					return obj1[0] - obj2[0];
				}

			}
		});
		
		for (int i = 0 ; i < N ; i ++) {
			sb.append(array[i][0]).append(" ").append(array[i][1] + "\n");
		}
		
		System.out.println(sb);
		
	}

}
//
//  5
//  3 4
//  1 1
//  1 -1
//	2 2
//	3 3
