package castingTest;

public class CastingTest3 {
	public static void main(String[] args) {
		// ���ڿ� + ���� = ���ڿ� ��� : 13 
		System.out.println("1" + 3) ;
		// ���ڿ� + ���� = ���ڿ� ���: 138
		System.out.println("1" + 3 + 8);
		// ���ڿ� + ���� = ���ڿ� ���: 111
		System.out.println("1" + (3 + 8));
		// ���ڿ� + ���� = ���ڿ� ���: 1 ���ϱ� 3�� 13
		System.out.println("1 ���ϱ� 3�� " + 1 + 3);
		// ���ڿ� + ���� = ���ڿ� ��� : 1 ���ϱ� 3�� 4
		System.out.println("1 ���ϱ� 3�� " + (1 + 3));
	}
}
