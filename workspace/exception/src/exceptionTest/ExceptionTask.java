package exceptionTest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTask {
	public static void main(String[] args) {
//		5���� ������ �Է¹ޱ�
//		- ���� �Է� ���·� ����
//		- q �Է� �� ������
//		- �� ������ �迭�� ���
//		- if���� �� �ѹ��� ����ϱ�
		Scanner sc = new Scanner(System.in);
		int[] arData = new int[5];
		String temp = "";
		
		for(int i = 0;; i++) {
			System.out.println(i + 1 + "��° ����[q: ������]: ");
			temp = sc.next();
			temp = temp.toLowerCase();
			
			if(temp.equals("q")) {
				break;
			}
			
			try {
				arData[i - 1] = Integer.parseInt(temp);
			} catch (NumberFormatException e) {
				System.out.println("������ �Է����ּ���.");
				i--;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("5���� ������ �Է��� �����մϴ�.");
				for (int j = 0; j < arData.length; j++) {
					System.out.print(arData[j] + " ");
				}
				break;
			} catch (Exception e) {
				System.out.println("�ٽ� �õ����ּ���.");
				i--;
			}
			
			
		}
		
	}
		
}

