package variableTest;

public class FormatTest {
	public static void main(String[] args) {
		// name�̶�� ������ �ѵ����� �����
		String name = "�ѵ���";
		// age��� ������ 20�� �����
		int age = 20;
		// double Ÿ���� height ������ �����
		double height = 123.5;
		
		// ���Ĺ��ڸ� ����Ͽ� name ��� %s�� ���ڿ�
		System.out.printf("�̸� : %s\n", name);
		// ���Ĺ��ڸ� ����Ͽ� age ��� %d�� ����
		System.out.printf("���� : %d��\n", age);
		// ���Ĺ��ڸ� ����Ͽ� height ��� %.1f�� �Ҽ��� ���ڸ� ���ڸ����� ��������
		System.out.printf("Ű : %.1fcm", height); // �ݿø�
	}
}
