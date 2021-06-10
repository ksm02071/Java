package CMExample;

public class Test {
	
	public int vartest(int a) {
		a ++;
		return a;
	}
	
	public static void main(String[] args) {
		
		int a= 1;
		Test test = new Test();
		a= test.vartest(a);
		System.out.println(a);
		
	}
}
