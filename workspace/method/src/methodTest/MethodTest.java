package methodTest;

public class MethodTest {
// �� ������ ���� �޼ҵ� ����
	int multiple(int num1, int num2) {
		return num1 * num2;
	}
	
//	static
//		�����Ϸ��� ���� ���� �޸𸮿� �Ҵ����ش�.
//		�Ϲ� �޼ҵ带 static �޼ҵ忡�� ����ϱ� ���ؼ��� �Ʒ� �� ���� ����� �ʿ��ϴ�.
//		1. �Ϲ� �޼ҵ忡 static�� �ۼ��Ͽ� ���� �ð��뿡 �޸𸮷� �÷��ش�.
//		2. �Ϲ� �޼ҵ��� �Ҽ��� �˷��ش�.
	
	public static void main(String[] args) {
		MethodTest methodTest = new MethodTest();
		methodTest.multiple(1, 3);
		
	}
}
