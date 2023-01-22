package variableTest;

public class FormatTest {
	public static void main(String[] args) {
		// name이라는 변수에 한동석을 담아줌
		String name = "한동석";
		// age라는 변수에 20을 담아줌
		int age = 20;
		// double 타입의 height 변수에 담아줌
		double height = 123.5;
		
		// 서식문자를 사용하여 name 출력 %s는 문자열
		System.out.printf("이름 : %s\n", name);
		// 서식문자를 사용하여 age 출력 %d는 정수
		System.out.printf("나이 : %d살\n", age);
		// 서식문자를 사용하여 height 출력 %.1f로 소수점 뒷자리 한자리까지 나오게함
		System.out.printf("키 : %.1fcm", height); // 반올림
	}
}
