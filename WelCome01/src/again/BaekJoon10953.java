package again;


import java.util.Scanner;

public class BaekJoon10953 {
	
	public static void main(String[] args) throws Exception {
		// 1. A + B - 6 복습하기
		// 2. 두 정수 A 와 B를 입력받고 A + B를 출력하자
		// 3. A 와 B는 콤마 로 구분되어 있다.
		
		
		Scanner scan = new Scanner(System.in);
		
		// 1. 테스트 케이스
		int testCase = scan.nextInt();
		// 2. index
		int [] intArr = new int [testCase];
		// 3. 형변환 으로 사용 할 String배열
		String [] StringArray = null;

		
		
		// 4. 반복 
		for (int i = 0 ; i < testCase ; i ++) {
			// 5. String 데이터 입력
			StringArray = scan.next().split(",");
			// 6. 입력받은 String 을 정수형 으로 형변환 하여 저장
			intArr[i] = Integer.parseInt(StringArray[0]) + Integer.parseInt(StringArray[1]);
		}
		
		// 7. 출력
		for (int res : intArr) {
			System.out.println(res);
		}
	}

}
