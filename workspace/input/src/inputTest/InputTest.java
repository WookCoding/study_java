package inputTest;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		// ��ĳ�� 
		Scanner sc = new Scanner(System.in);
//		�ʱⰪ : ���� � ���� ���� �� �� ��
//		���� : 0
//		�Ǽ� : 0.0
//		���� : ' ';
//		���ڿ� : null �Ǵ� ""(���ڿ�)
		
		//���� �ʱ�ȭ
		String name = "";
		System.out.print("�̸� : ");
//		name = sc.next();
//		System.out.println(name + "�� ȯ���մϴ�.");
		name = sc.nextLine();
		System.out.println(name + "�� ȯ���մϴ�.");
		
	}
}
