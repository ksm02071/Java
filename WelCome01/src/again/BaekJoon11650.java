package again;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BaekJoon11650 {
	
	public static void main(String[] args) throws Exception{
		
		// 1.��ǥ �����ϱ� �����ϱ�
		// 2. x ��ǥ�� �����ϴ� ������ x ��ǥ�� ���ٸ� y ��ǥ�� �����ϴ� ������ ������ ��
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		
		
		// �׽�Ʈ ���̽�
		int testCase = Integer.parseInt(br.readLine());
		
		// 2�����迭 - N�� 2��
		int [][] array = new int [testCase][2];
		
		// �迭�� ������ �ֱ�.
		for (int i = 0 ; i < testCase ; i ++) {
			st = new StringTokenizer(br.readLine()," ");
			array[i][0] = Integer.parseInt(st.nextToken());
			array[i][1] = Integer.parseInt(st.nextToken());
			
			// �׽�Ʈ �ڵ�.
//			System.out.println(i +  " "  +  array[i][0] + "  0��°");
//			System.out.println(i +  " "  +  array[i][1] + "  1��°");
		}
		
		// �迭 ����
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
		
		// ���
		StringBuilder sb ;
		sb = new StringBuilder();
		
		for (int i = 0 ; i < testCase ; i ++) {
			
			sb.append(array[i][0]).append(" ").append(array[i][1] + "\n");
		}
		System.out.println(sb);
	}

}
