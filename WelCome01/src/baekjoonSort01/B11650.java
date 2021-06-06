package baekjoonSort01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;


public class B11650 {
	public static void main(String[] args) throws Exception {
		// Git ���� 11650�� ��ǥ �����ϱ�   - ���� �˰��� �з� : ����
		
		// 1. x ��ǥ�� �����ϴ� ������ x ��ǥ�� ���ٸ� y��ǥ�� �����ϴ� ������ �����ϱ�
						
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		
		int N = Integer.parseInt(br.readLine());
		int [][] array = new int [N][2]; // N�� 2�� 
		
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
