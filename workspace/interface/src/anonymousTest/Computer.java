package anonymousTest;

public class Computer {
	public static void main(String[] args) {
//		�������̽��� �������� ���� �ʵ尡 �����ϱ� ������,
//		�͸� Ŭ������ ���� �� �������̽��� �����ϸ� ������Ų��.
//		������ �͸� Ŭ������ �ʵ尡 �޸𸮿� �Ҵ�� �� �������̽� Ÿ����
//		��ü�� up casting�ȴ�.
		Game game = new Game() {
			
			@Override
			public void play() {
				System.out.println("���� ����");
			}
			
			@Override
			public void exit() {
				System.out.println("���� ����");
			}
		};
		
		game.play();
		game.exit();
	}
}
