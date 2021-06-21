package ObjectExample;

public class toStringTest {
	
	int x , y;
	
	public void toReceiveValue(int x , int y) {
		this.x = x;
		this.y = y;
	}
	
	public void sum() {
		System.out.print(this.x + "  " + this.y);
	}
	
	public void avg() {
		System.out.print( (this.x + this.y) / 2 );
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "x 값 : " + this.x + " y 값 : " + this.y +"\n";
	}
	
	
	public static void main(String[] args) {
		toStringTest ts = new toStringTest();
		ts.toReceiveValue(50, 100);
		// 인스턴스 ts 가 이곳 클래스 의 인스턴스 라는 의미.
		// @ 뒤의 내용은 인스턴스 만의 고유식별값.
		System.out.print(ts);
	}

}
