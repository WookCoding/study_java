package codingTest;

public class CodingTest5 {

//	��� ���� N�� 1�� �� ������ ������ �� ���� �� �ϳ��� �ݺ������� �����Ͽ� �����Ϸ��� �Ѵ�.
//	��, �� ��° ������ N�� K�� ������ ������ ���� ������ �� �ִ�.
//	1. N���� 1�� ����
//	2. N�� K�� ������.
	
//	N�� K�� �־��� �� N�� 1�� �� ������ 1�� Ȥ�� 2���� ������ �����ؾ� �ϴ� �ּ� Ƚ����
//	���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
//	�Է� ����
//	ù° �ٿ� N(2 �� N �� 100,000)�� K(2 �� K �� 100,000)�� �������� ���еǸ� ���� �ڿ�����
//	�־�����. �̶� �Է����� �־����� N�� �׻� K���� ũ�ų� ����

//	��� ����
//	ù° �ٿ� N�� 1�� �� ������ 1�� Ȥ�� 2���� ������ �����ؾ� �ϴ� Ƚ���� �ּڰ��� ����Ѵ�.
	
//	�Է� ����
//	25 5
	
//	��� ����
//	2
	
	public int solution(int n, int k) {
		int result = 0, target = 0;
		while(true) {
			target = (n / k) * k;
			result += (n - target);
			n = target;
			
			if(n < k) {
				break;
			}
			result += 1;
			n /= k;
		}
		result += (n - 1);
		return result;
	}
	public static void main(String[] args) {
		CodingTest5 c = new CodingTest5();
		
		int result = 0;
		result = c.solution(24, 5);
		
		System.out.println("��� �� : " + result);
	}
	
}
