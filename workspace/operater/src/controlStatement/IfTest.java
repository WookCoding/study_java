package controlStatement;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
//		�� ���� ��Һ�
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		String message = "�ΰ��� ������ �Է��ϼ���", result = "";
		
		System.out.println(message);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if(num1 > num2) {
			result = "ū�� : " + num1;
		}else if(num2 > num1) {
			result = "ū�� : " + num2;
		}else {
			result = "�� ���� �����ϴ�.";
		}
		
		System.out.println(result);
	}
}
