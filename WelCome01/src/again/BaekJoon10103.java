package again;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon10103 {
	public static void main(String[] args)  throws Exception{
		// 1. 주사위 게임 다시 풀기 10103
		// 2. 매 라운드마다 유저는 주사위를 던지고 
		// 3. 낮은 숫자가 나온 사람은 상대편 주사위에 나온 숫자만큼 감점
		// 4. 두 사람의 주사위가 같은 숫자가 나온 경우에는 무효
		// 5. 라운드 가 종료되면 최종적으로 남은 점수로 승패를 가림.
		
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
