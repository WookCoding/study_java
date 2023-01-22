package castingTest;

import java.util.Scanner;

// ���ø���
// �ִϸ��̼�, ��ȭ, ��� Ŭ���� ����
// ����ڰ� ����,�� ������ 
// �ִϸ��̼��̶�� "�ڸ� ����"��� ���
// ��ȭ��� "4D"��� ���
// ��󸶶�� "����"���


public class CastingTask {
	
	void CheckCategory(Video video) {
		
		if(video instanceof Animation) {
			Animation animation = (Animation) video;
			animation.printVideo();
		}else if(video instanceof Drama) {
			Film film = (Film) video;
			film.printVideo();
		}else {
			Drama drama = (Drama) video;
			drama.printVideo();
		}
	}	
	
	public static void main(String[] args) {
		CastingTask c = new CastingTask();
		Video[] video = {
				new Animation(),
				new Film(),
				new Drama()
		};
		
		for (int i = 0; i < video.length; i++) {
			c.CheckCategory(video[i]);
		}
		
	}
}
