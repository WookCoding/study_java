package castingTest;

public class CastingTest4 {
	public static void main(String[] args) {
		// ���ڿ� + ���� + ���� : 139
		System.out.println("1" + 3 + 9);
		// Integer.parsInt�� ���ڿ��� ������ �������� ���� 
		// ����� 13
		System.out.println(Integer.parseInt("1") + 3 + 9 );
		// ���������� Double.parseDouble�� ���ڿ��� �Ǽ��� �������� ���� 12.9
		System.out.println(Double.parseDouble("3.9")+9);
	}
}
