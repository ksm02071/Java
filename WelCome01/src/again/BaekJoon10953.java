package again;


import java.util.Scanner;

public class BaekJoon10953 {
	
	public static void main(String[] args) throws Exception {
		// 1. A + B - 6 �����ϱ�
		// 2. �� ���� A �� B�� �Է¹ް� A + B�� �������
		// 3. A �� B�� �޸� �� ���еǾ� �ִ�.
		
		
		Scanner scan = new Scanner(System.in);
		
		// 1. �׽�Ʈ ���̽�
		int testCase = scan.nextInt();
		// 2. index
		int [] intArr = new int [testCase];
		// 3. ����ȯ ���� ��� �� String�迭
		String [] StringArray = null;

		
		
		// 4. �ݺ� 
		for (int i = 0 ; i < testCase ; i ++) {
			// 5. String ������ �Է�
			StringArray = scan.next().split(",");
			// 6. �Է¹��� String �� ������ ���� ����ȯ �Ͽ� ����
			intArr[i] = Integer.parseInt(StringArray[0]) + Integer.parseInt(StringArray[1]);
		}
		
		// 7. ���
		for (int res : intArr) {
			System.out.println(res);
		}
	}

}
