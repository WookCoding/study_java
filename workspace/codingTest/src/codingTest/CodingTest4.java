package codingTest;

public class CodingTest4 {
	
//	���� ����
//	�Ӿ��̳� ���ڰ��Դ� ���ڸ� �ϰ� �������� �߶� �ݴϴ�. ���ڸ� �������� ����� �� n�� �־��� ��, 
//	��� ����� ���ڸ� �� ���� �̻� �Ա� ���� �ʿ��� ������ ���� return �ϴ� solution �Լ��� �ϼ��غ�����.
	
//	���ѻ���
//	1 �� n �� 100
	
//	����� ��
//	n	result
//	7	1
//	1	1
//	15	3
	
//	����� �� ����
//	����� �� #1

//	7���� �ּ� �� ������ �Ա� ���ؼ� �ּ� 1���� �ʿ��մϴ�.
//	����� �� #2

//	1���� �ּ� �� ������ �Ա� ���� 1���� �ʿ��մϴ�.
//	����� �� #3

//	15���� �ּ� �� ������ �Ա� ���ؼ� �ּ� 3���� �ʿ��մϴ�.
	
	
	public int solution(int n) {
		 int answer = (n%7==0) ? n/7 : n/7 + 1;
	        
	        return answer;
	}
}