package again;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon10103 {
	public static void main(String[] args)  throws Exception{
		// 1. �ֻ��� ���� �ٽ� Ǯ�� 10103
		// 2. �� ���帶�� ������ �ֻ����� ������ 
		// 3. ���� ���ڰ� ���� ����� ����� �ֻ����� ���� ���ڸ�ŭ ����
		// 4. �� ����� �ֻ����� ���� ���ڰ� ���� ��쿡�� ��ȿ
		// 5. ���� �� ����Ǹ� ���������� ���� ������ ���и� ����.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		int round = Integer.parseInt(br.readLine());
		
		int user01 = 100;
		int user02 = 100;
		int input1,input2;
		
		for (int i = 0 ; i < round ; i ++ )  {
			st = new StringTokenizer(br.readLine()," ");
			input1 = Integer.parseInt(st.nextToken());
			input2 = Integer.parseInt(st.nextToken());
			
			if (input1 < input2) {
				user01 = user01 - input2;
			}else if (input1 > input2) {
				user02 = user02 - input1;
			}else if (input1 == input2) {
				continue;
			}
		}
		System.out.println(user01 + "\n"+ user02);
	}

}
