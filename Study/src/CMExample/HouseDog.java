package CMExample;

public class HouseDog extends Dog{
	
	// �θ�Ŭ������ �޼ҵ带 �ڽ�Ŭ������ ������ ���·� �� �ٽ� �����ϴ� ��
	// �޼ҵ� �������̵� 
	// �� �θ�Ŭ���� Dog ���� �켱 ������ ���ԵǾ HouseDog Ŭ������ sleep �޼ҵ� ȣ����
	
	public void sleep() {
		System.out.print(this.name + "zzz in House" +"\n");
	}
	
	public void sleep(int hour) {
		System.out.print(this.name + "zzz in House " + hour + " hours");
	}
	
	public static void main(String[] args) {
		
		HouseDog hd = new HouseDog();
		hd.setName("Happy");
		hd.sleep();
		hd.sleep(3);
	}
}
