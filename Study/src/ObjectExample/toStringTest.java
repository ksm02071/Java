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
		return "x �� : " + this.x + " y �� : " + this.y +"\n";
	}
	
	
	public static void main(String[] args) {
		toStringTest ts = new toStringTest();
		ts.toReceiveValue(50, 100);
		// �ν��Ͻ� ts �� �̰� Ŭ���� �� �ν��Ͻ� ��� �ǹ�.
		// @ ���� ������ �ν��Ͻ� ���� �����ĺ���.
		System.out.print(ts);
	}

}
