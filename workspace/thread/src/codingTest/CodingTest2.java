package codingTest;

import java.util.Iterator;

public class CodingTest2 {
	public int solution(String p, String s) {
		int result = 0;
		
		for (int i = 0; i < p.length(); i++) {
			// ��й�ȣ�� ���ݼ��� ���� 4���� ũ��
			if(4 < p.charAt(i) - s.charAt(i) || s.charAt(i) - p.charAt(i) > 4) {
			// ���ݼ��� ���ڰ� ��й�ȣ�� ���ں��� ũ�� 10 - ���ݼ� ���� + ��й�ȣ
			// ��й�ȣ�� ���ڰ� ���ݼ��� ���ں��� ũ�� 10 - ��ֹ�ȣ + ���ݼ� ����
				result += p.charAt(i) > s.charAt(i) ? 10 - p.charAt(i) + s.charAt(i) : 10 - s.charAt(i) + p.charAt(i);
			//���ݼ��� ���ڰ� ��й�ȣ�� ���ں��� ũ��
			}else if(p.charAt(i) > s.charAt(i)) {
				// ���ݼ��� ���� - ��й�ȣ�� ����
				result += p.charAt(i) - s.charAt(i);
			}else { // ��й�ȣ�� ���ڰ� �� ũ��
				// ��й�ȣ�� ���� - ���ݼ��� ����
				result += s.charAt(i) - p.charAt(i);
			}
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		String n = "0000";
		String r = "5655";
		int result = 0;
		
		CodingTest2 c = new CodingTest2();
		
		result = c.solution(n, r);
		System.out.println(result);
	}
}
