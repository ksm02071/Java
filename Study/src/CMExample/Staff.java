package CMExample;

import java.util.Scanner;

// �ڽ� Ŭ����

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
		

		System.out.println("������ �̸��� �Է����ּ���.");
		String staffName = scan.next();
		
		while (true) {
			try {
				if (staffName.equals("Kim") || staffName.equals("kim")) {
					stf.gameMasterPermissions(true, true);
					System.out.print("�̸� : " + staffName +"\n");
					System.out.print("���� �¿��� ���� : " + stf.serverOnOff + "\n");
					System.out.print("���� �б� ���� : " + stf.userInfo + "\n");
					System.out.print("���� ������ ������ : " + stf.setRewords("1500 Ruby") );
					break;
					
				}else {
					stf.count ++;
					System.out.print("�߸��� �̸��Դϴ�. ���ī��Ʈ(5ȸ�� ����) :" + stf.count + "\n");
					
					if (stf.count == 5) {
						System.out.print("���α׷� ���� ");
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


