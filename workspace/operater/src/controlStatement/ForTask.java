package controlStatement;

import java.util.Iterator;
import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
//		�����
//		1~100���� ���
//		for (int i = 0; i < 100; i++) {
//			System.out.print(i+1 + " ");
//		}
//		100~1���� ���
//		for (int i = 0; i < 100; i++) {
//			System.out.print(100-i + " ");
//		}
//		1~100���� �� ¦���� ���
//		for (int i = 1; i < 50; i++) {
//				System.out.print((i+1)*2+ " ");
//		}
		
//		�ǹ�	
//		1~10���� �� ���
//		int sum = 0;
//		for (int i = 0; i < 10; i++) {
//			sum += i+1;
//		}
//		System.out.println(sum);
		
//		1~n���� �� ���
//		Scanner sc = new Scanner(System.in);
//		int sum = 0;
//		System.out.print("1~n ���� ���� n�� �Է��ϼ��� : ");
//		int count = sc.nextInt();
//		for (int i = 0; i < count; i++) {
//			sum += i+1;
//		}
//		System.out.println(sum);
		
//		���
//		A~F���� ���
//		for (int i = 0; i < 6; i++) {
//			System.out.println((char)(i+65));
//		}
		
//		A~F���� �� C�����ϰ� ���
//		for (int i = 0; i < 5; i++) {
//			System.out.println(i>1 ? (char)(i+1+65) : (char)(i+65));
//		}
		
//		���̾�
//		0 1 2 3 0 1 2 3 0 1 2 3 ���
//		for (int i = 0; i < 4; i++) {
//			System.out.println(i % 4 + " ");
//		}
		
//		aBcDeFgH..... ���
		for (int i = 0; i < 26 ; i++) {
			if(i%2 == 0) {
				System.out.print((char)(i	+97));
			}else {
				System.out.print((char)(i+65));
			}
		}
	}
}
