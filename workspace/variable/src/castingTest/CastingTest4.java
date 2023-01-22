package castingTest;

public class CastingTest4 {
	public static void main(String[] args) {
		// 문자열 + 정수 + 정수 : 139
		System.out.println("1" + 3 + 9);
		// Integer.parsInt는 문자열을 정수로 리턴해줌 따라서 
		// 결과는 13
		System.out.println(Integer.parseInt("1") + 3 + 9 );
		// 마찬가지로 Double.parseDouble은 문자열을 실수로 리턴해줌 따라서 12.9
		System.out.println(Double.parseDouble("3.9")+9);
	}
}
