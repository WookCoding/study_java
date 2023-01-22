package codingTest;

import java.util.Scanner;

public class CodingTest2 {
// 	배열의 크기 N, 숫자가 더해지는 횟수 M, 그리고 K가 주어질 때 동빈이의  
// 	큰 수의 법칙에 따른 결과를 출력하시오
	
//	첫째 줄에 N(2 ≤ N ≤ 1,000), M(1 ≤ M ≤ 10,000), K(1 ≤ K ≤ 10,000)의
//	자연수가 주어지며, 각 자연수는 공백으로 구분한다.
//	둘째 줄에 N개의 자연수가 주어진다. 각 자연수는 공백으로 구분한다.
//	단, 각각의 자연수는 1 이상 10,000 이하의 수로 주어진다.
//	입력으로 주어지는 K는 항상 M보다 작거나 같다

//	출력 조건
//	첫째 줄에 동빈의의 큰 수의 법치겡 따라 더해진 답을 출력한다
	
//	입력 예시
//	5 8 3
//	2 4 5 4 6
	
//	출력 예시
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
		
//		입력한 배열의 숫자를 받을 변수
		int[] arData = null;
		
//		배열의 크기, 숫자가 더해질 횟수, 연속된 숫자의 반복횟수를 받을 변수;
		int[] arNumber = new int[3];
		String[] arMsg = {"배열의 크기 : ","숫자가 더해질 횟수 : ","연속된 숫자의 반복횟수 : "};
		
		for (int i = 0; i < arNumber.length; i++) {
			System.out.print(arMsg[i]);
			arNumber[i] = sc.nextInt();
		}

		arData = new int[arNumber[0]];
		
		for (int i = 0; i < arNumber[0]; i++) {
			System.out.print("숫자 입력 : ");
			arData[i] = sc.nextInt();
		}
		
		result = c.solution(arData, arNumber);
		System.out.println(result);
	}
}
