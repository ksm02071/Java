package CMExample;

// �θ� Ŭ����

public class GameAdmin {
	
	String rewords; // ��������
	boolean userInfo;  // ���� ���� �б� ����
	boolean serverOnOff;// ���� �� ���� ����
	
	public String setRewords(String rewords) {
		return this.rewords = rewords;
	}
	
	public void gameMasterPermissions(boolean userInfo , boolean serverOnOff) {
		this.userInfo = userInfo;
		this.serverOnOff = serverOnOff;
	}
}

//OO����ȸ�翡��  �����ϰ� ���ϴ� A���� �ִ�
//A���� ����� B���� ���̻� ���Ӱ����� ���� �Ҽ� ���� �Ǿ�
//���������� A������ ���Ӱ����� ������ �ο��ϱ�� �Ͽ���
//�̿� �´� ��� Ŭ������ �ۼ��غ� ��
