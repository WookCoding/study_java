package codingTest;

import java.util.Iterator;

public class CodingTest1 {
	
	public int result(String number) {
//		���ӵǴ� 1�� �ִ� ���� ���ϱ�
//		0�� ���ְ� �迭�� ����ֱ�
		int result = 0;
		
//		ó�� �迭�� ���̸� ����ֱ�
		String[] numbers = number.split("0");
		try {
			result = numbers[0].length();
			
			for (int i = 0; i < numbers.length; i++) {
//				����� ���̺��� �� ��ٸ� �ٽ� ����ش�.
					if(result < numbers[i].length()) {
						result = numbers[i].length();
					}
			}
		} catch (Exception e) {;}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		String number = "00000";
		int result = 0;
		CodingTest1 c = new CodingTest1();
		
		result = c.result(number);
		System.out.println(result);
	}
}
