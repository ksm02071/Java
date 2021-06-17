package javaException;

import java.util.Scanner;

public class InputMismatchException {
	
	public void result() {
		Scanner scan = new Scanner(System.in);
		while(true) {
			try {
				System.out.println("������ �Է��ϼ���.");
				int input = scan.nextInt();
				System.out.println("�Է��� ���� " + input + " �Դϴ� ");
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
		
		// 1. ������ ���� Ÿ�԰� �ٸ� Ÿ���� �Է¹޾��� ��
		// �߻��ϴ� ���ܰ� ���� ���� �н��ϱ�. Check
		
		// 2. ���� �߻� �� ���α׷��� ��� ������� �ʰ� �ұ�?
		InputMismatchException ime = new InputMismatchException();
		ime.result();
		
	}
}
