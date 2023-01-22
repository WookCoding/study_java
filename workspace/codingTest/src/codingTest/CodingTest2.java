package codingTest;

import java.util.Scanner;

public class CodingTest2 {
// 	�迭�� ũ�� N, ���ڰ� �������� Ƚ�� M, �׸��� K�� �־��� �� ��������  
// 	ū ���� ��Ģ�� ���� ����� ����Ͻÿ�
	
//	ù° �ٿ� N(2 �� N �� 1,000), M(1 �� M �� 10,000), K(1 �� K �� 10,000)��
//	�ڿ����� �־�����, �� �ڿ����� �������� �����Ѵ�.
//	��° �ٿ� N���� �ڿ����� �־�����. �� �ڿ����� �������� �����Ѵ�.
//	��, ������ �ڿ����� 1 �̻� 10,000 ������ ���� �־�����.
//	�Է����� �־����� K�� �׻� M���� �۰ų� ����

//	��� ����
//	ù° �ٿ� �������� ū ���� ��ġ�� ���� ������ ���� ����Ѵ�
	
//	�Է� ����
//	5 8 3
//	2 4 5 4 6
	
//	��� ����
//	46
	
//	6 + 6 + 6 + 5 + 6 + 6 + 6 + 5
	public int solution(int[] arData, int[] arNumber) {
		int number = arNumber[1];
		int maxNumber = 0, count = 0, result = 0;
		int secondNumber = 0;
		
		for (int i = 0; i < arData.length; i++) {
			if(secondNumber < arData[i] && arData[i] < maxNumber) {
				secondNumber = arData[i];
			}
			
			if(maxNumber < arData[i]) {
				maxNumber = arData[i];
			}
		}
		
		for (int i = 0; i < number; i++) {
			if(count <= arData[2]) {
				result += maxNumber;
				count ++;
			}else {
				result += secondNumber;
				count = 0;
			}
			
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CodingTest2 c = new CodingTest2();
		int result = 0;
		
//		�Է��� �迭�� ���ڸ� ���� ����
		int[] arData = null;
		
//		�迭�� ũ��, ���ڰ� ������ Ƚ��, ���ӵ� ������ �ݺ�Ƚ���� ���� ����;
		int[] arNumber = new int[3];
		String[] arMsg = {"�迭�� ũ�� : ","���ڰ� ������ Ƚ�� : ","���ӵ� ������ �ݺ�Ƚ�� : "};
		
		for (int i = 0; i < arNumber.length; i++) {
			System.out.print(arMsg[i]);
			arNumber[i] = sc.nextInt();
		}

		arData = new int[arNumber[0]];
		
		for (int i = 0; i < arNumber[0]; i++) {
			System.out.print("���� �Է� : ");
			arData[i] = sc.nextInt();
		}
		
		result = c.solution(arData, arNumber);
		System.out.println(result);
	}
}
