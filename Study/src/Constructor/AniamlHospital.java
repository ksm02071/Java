package Constructor;

public class AniamlHospital {
	
	public static void main(String[] args) {
		Animal ani1 = new Animal("������",4,true);
		Animal ani2 = new Animal("�����",4,true);
		Animal ani3 = new Animal("�Ǿ�",4,false);
		System.out.print(ani1 + "\n");
		System.out.print(ani2 + "\n");
		System.out.print(ani3 + "\n");
		
		 Human a = new Human("����","�ɷ���",2,true);
		 System.out.print(a);
	}
}
