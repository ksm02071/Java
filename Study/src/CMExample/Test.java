package CMExample;

public class Test {
	
	public int vartest(int a) {
		System.out.print("최초로 들어온 값 : " + a);
		a ++;
		System.out.print("마지막으로 들어온 값" + a);
		return a;
	}
	
	public static void main(String[] args) {
		
		int a= 1;
		Test test = new Test();
		a = test.vartest(a);
		System.out.println(a);
		
	}
}
