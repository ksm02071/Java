package javaException;

import java.util.Scanner;

public class InputMismatchException {
	
	public void result() {
		Scanner scan = new Scanner(System.in);
		while(true) {
			try {
				System.out.println("정수를 입력하세요.");
				int input = scan.nextInt();
				System.out.println("입력한 값은 " + input + " 입니다 ");
				break;
				
			} catch (Exception e) {
				scan = new Scanner(System.in);
				System.out.println(e.getMessage());
				System.out.print(e.getClass());
				System.out.println("\n");
			}	
		}
	}
	public static void main(String[] args) {
		
		// 1. 지정한 변수 타입과 다른 타입을 입력받았을 때
		// 발생하는 예외가 무엇 인지 학습하기. Check
		
		// 2. 에러 발생 후 프로그램을 어떻게 종료되지 않게 할까?
		InputMismatchException ime = new InputMismatchException();
		ime.result();
		
	}
}
