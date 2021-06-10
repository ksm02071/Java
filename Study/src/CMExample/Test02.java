package CMExample;

public class Test02 {
	
	int a ;
	
	public void sum (Test02 test) {
		System.out.println("¸Ş¼Òµå : "+test.a);
		test.a ++;
	}
	
	public static void main(String[] args) {
		
		Test02 test02 = new Test02();
		test02.a = 1;
		test02.sum(test02);
		System.out.println(test02.a);	
	}
}
