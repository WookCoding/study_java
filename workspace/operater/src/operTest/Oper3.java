package operTest;

import java.util.Scanner;

public class Oper3 {
	public static void main(String[] args) {
//		����ڿ��� Ű�� �Է¹ް�
//		������� ������ ���
//		�Ǽ���� �Ǽ��� �Է�
//		��) 183 -> 183 ���
//		183.5 -> 183.5 ���
//		���� �����ڸ� ���
		Scanner sc = new Scanner(System.in);

//		Ű�� ������ ����
		double height = 0.0;
//		�Ǽ����� �������� �Ǵ�
		String result = "";
		String msg = "����� Ű��?";
		String forLength = "";
		int length = 0;
		boolean check = false;
		
		System.out.println(msg);
//		����ڰ� �Է��� ��
		height = sc.nextDouble();
		check = height - (int)height == 0;
		forLength = height - (int)height + "";
		
		length = forLength.length() > 8 ?  8 :  forLength.length();
		
//		���� 0�̸� true �ƴϸ� false
		
//		���� 0�� �� %.0f �Դϴ� �ƴϸ� %.1f �Դϴ�.�� result�� ���� �ȴ�.
		result = check ? "%.0f �Դϴ�" : "%." + (length - 2)  + "fcm";
//		printf() ������� printf(���Ĺ���,��)
		System.out.printf(result,height);
	
	}
}
