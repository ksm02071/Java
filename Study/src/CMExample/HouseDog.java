package CMExample;

public class HouseDog extends Dog{
	
	// 부모클래스의 메소드를 자식클래스가 동일한 형태로 또 다시 구현하는 것
	// 메소드 오버라이딩 
	// 단 부모클래스 Dog 보다 우선 순위를 갖게되어서 HouseDog 클래스의 sleep 메소드 호출함
	
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
