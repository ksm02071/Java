package javaException;

public class NullPointerException {
	public static void main(String[] args) {
		
		// 1. 객체가 null 인 것을 체크해볼 것
		
		Person p = null;

		if (p == null) {
			System.out.print("Object is Null");
			return ;
		}else {
			System.out.print("Object is True");
		}
		
	}
	class Person {
		
		String name ;
		int age;
	}
}
