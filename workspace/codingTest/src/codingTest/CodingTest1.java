package codingTest;

public class CodingTest1 {
//	����� �������� ����� �����ִ� �����̴�. ī���Ϳ��� �Ž��������� ����� 500��, 100��, 50��, 10��¥�� ������
//	������ �����Ѵٰ� �����Ѵ�. �մԿ��� �Ž��� ��� �� ���� N���� �� �Ž��� ��� �� ������ �ּ� ������ ���϶�
//	��, �Ž��� ��� �� �� N�� �׻� 10�� ����̴�.
	public int solution(int change) {
		int count = 0;
	
		int[] arData = {500, 100, 50, 10};
		
		for (int i = 0; i < arData.length; i++) {
			count += change / arData[i];
			
			change %= arData[i];
		}

		return count;
	}	
	
	public static void main(String[] args) {
		CodingTest1 c = new CodingTest1();
		int result = 0;
		
		result = c.solution(1260);
		
		System.out.println(result);
		
	}
}
