package inputTest;

import java.util.Scanner;

public class InputTask1 {
	public static void main(String[] args) {
//		�� ������ �Է��� �� ���� ��� ���
//		��, next()�� ����Ѵ�.
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0 , num2 = 0;
		System.out.print("ù���� ���� : ");
		num1 = Integer.parseInt(sc.next());
		System.out.print("�ι�° ���� : ");
		num2 = Integer.parseInt(sc.next());
		
		System.out.println("�� ������ ��: " + (num1+num2));
		System.out.printf("%d + %d = "+(num1+num2),num1,num2);
	}
}
