package anonymousTask;

public class Nike {

	void register(Form form) {
		String[] sellMenu = form.getMenu();
		for (int i = 0; i < sellMenu.length; i++) {
			System.out.println("�Ǹ� �޴� : "+  sellMenu[i]);
		}
		
		if(form instanceof FormAdapter) {
			System.out.println("���� ������ �Դϴ�.");
			return;
		}
		
		form.sell("�Ź�");
	}
}
