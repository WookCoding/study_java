package codingTest;

public class CodingTest3 {
//	�Ӿ��̳� �粿ġ ���Դ� 10�κ��� ������ ����� �ϳ��� ���񽺷� �ݴϴ�. 
//	�粿ġ�� 1�κп� 12,000��, ������� 2,000���Դϴ�.
//	���� n�� k�� �Ű������� �־����� ��, 
//	�粿ġ n�κа� ����� k���� �Ծ��ٸ� �Ѿ󸶸� �����ؾ� �ϴ��� return �ϵ��� solution �Լ��� �ϼ��غ�����.

//	���ѻ���
//	0 < n < 1,000
//	n / 10 �� k < 1,000
//	���񽺷� ���� ������� ��� ���ʴϴ�.

// ����� ��
// n	k	result
// 10	3	124,000
// 64	6	768,000
	
	//n= �粿ġ ���� �κ� 
	//k= ����� ����
	
	    public int solution(int n, int k) {
//	        int answer = 0;  
//	        answer = 12000*n;
//	        for(int i=0; i < n/10; i++){
//	            k--;
//	        }
//	        answer += k*2000;
//	        
//	        return answer;
	    	
	    	return n * 12000 + k * 2000 - (n / 10 * 2000);
	    }
	
	public static void main(String[] args) {
		final int COUNT_ONE = 10;
		final int COUNT_TWO = 9;
		
		CodingTest3 c = new CodingTest3();
		
		
		
		for (int i = 0; i < COUNT_ONE; i++) {
			for (int j = 0; j < COUNT_TWO; j++) {
				System.out.println("�粿ġ ���� �κ� : " + i);
				System.out.println("����� ���� : " + j);
				System.out.println(c.solution(i, j));
				System.out.println("----------------");
			}
		}
		
	}
}
