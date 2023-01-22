package castingTest;

public class CastingTest3 {
	public static void main(String[] args) {
		// 문자열 + 정수 = 문자열 결과 : 13 
		System.out.println("1" + 3) ;
		// 문자열 + 정수 = 문자열 결과: 138
		System.out.println("1" + 3 + 8);
		// 문자열 + 정수 = 문자열 결과: 111
		System.out.println("1" + (3 + 8));
		// 문자열 + 정수 = 문자열 결과: 1 더하기 3은 13
		System.out.println("1 더하기 3은 " + 1 + 3);
		// 문자열 + 정수 = 문자열 결과 : 1 더하기 3은 4
		System.out.println("1 더하기 3은 " + (1 + 3));
	}
}
