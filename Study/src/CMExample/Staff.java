package CMExample;

import java.util.Scanner;

// 자식 클래스

public class Staff  extends GameAdmin{

	int count = 0;
	
	public void myInfo() {
		System.out.print("My name is Kim" + "\n");
	}
	public int count(int count) {
		
		return count;
	}
	
	public static void main(String[] args) {
		Staff stf = new Staff();
		Scanner scan = new Scanner(System.in);
		stf.myInfo();
		

		System.out.println("직원의 이름을 입력해주세요.");
		String staffName = scan.next();
		
		while (true) {
			try {
				if (staffName.equals("Kim") || staffName.equals("kim")) {
					stf.gameMasterPermissions(true, true);
					System.out.print("이름 : " + staffName +"\n");
					System.out.print("서버 온오프 권한 : " + stf.serverOnOff + "\n");
					System.out.print("유저 읽기 권한 : " + stf.userInfo + "\n");
					System.out.print("보상 지급할 아이템 : " + stf.setRewords("1500 Ruby") );
					break;
					
				}else {
					stf.count ++;
					System.out.print("잘못된 이름입니다. 경고카운트(5회시 종료) :" + stf.count + "\n");
					
					if (stf.count == 5) {
						System.out.print("프로그램 종료 ");
						break;
					}
					staffName = scan.next();
					
				}
				
			} catch (Exception e) {
				System.out.print(e.getMessage());
			}
		}
	}
}


