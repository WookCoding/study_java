package stringTest;

import java.util.Iterator;
import java.util.Scanner;

public class StringTask {
	public static void main(String[] args) {
//		����ڿ��� �Է¹��� ���ڿ� �� �ҹ��ڴ� ��� �빮�ڷ�,
//		�빮�ڴ� ��� �ҹ��ڷ� �����Ѵ�.
//		Scanner sc = new Scanner(System.in);
//		String msg = "����� �Է��ϼ��� ��)AbCD";
//		null�� �ʱ�ȭ�ߴٸ�, ���� �����ڸ� ����ϰڴٴ� ��.
//		""�� �ʱ�ȭ �ߴٸ�, ���� �����ڸ� ����ϰڴٴ� ��.
//		String text = null;
//		String text1 = "";
//		
//		�޽��� ���
//		System.out.println(msg);
//		text�� �Է� ���� �ޱ�
//		text = sc.nextLine();
//
//		text�� ���̸�ŭ �ݺ����� ������.
//		for (int i = 0; i < text.length(); i++) {
//			���� �ڷ����� ���ڿ��� ���ڸ� �̴´�.
//			char c = text.charAt(i);
//			if(c >= 65 && c <= 90) {
//				 text1 += (char)(c + 32);
//			}else if(c >= 97 && c <= 122) {
//				text1 += (char)(c - 32);
//			}else{
//				text1 += c;
//			}
//		}
//		System.out.println(text1);
		
		
//		������ �ѱ۷� ����
//		��) 1024 -> �ϰ��̻�
		Scanner sc = new Scanner(System.in);
		String str = "�����̻�����ĥ�ȱ�";
		String msg = "������ �Է��ϼ���\n ��)1024";
		String number = "";
		String result = "";
		
		System.out.println(msg);
		number = sc.next();
		
		for (int i = 0; i < number.length(); i++) {
			 result += str.charAt(number.charAt(i)-48);
		}
		
		System.out.println(result);
	
//      int number = 0;
//      
//      System.out.print(message);
//      number = sc.nextInt();
//      
//      while(number != 0) { // ��� ����� ���� 0�� �� ������ �ݺ�
//         result = hangle.charAt(number % 10) + result;
//         number /= 10;
//      }
//      System.out.println(result);

		
		
		
		
	}
}
