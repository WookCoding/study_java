package anonymousTask;

public class Building {
   public static void main(String[] args) {
      StarBucks gangnam = new StarBucks();
      StarBucks jamsil = new StarBucks();
      
//      �޴��� �����ϸ� �Ǳ� ������ FormAdapter�� �ۼ��Ѵ�.
      jamsil.register(new FormAdapter() {
         
         @Override
         public String[] getMenu() {
            return new String[] {"��"};
         }
      });
      
//      ��� ��ü�� �ۼ��ؾ� �ϱ� ������ Form�� �ۼ��Ѵ�.
      gangnam.register(new Form() {
         
         @Override
         public void sell(String menu) {
            String[] menus = getMenu();
            for (int i = 0; i < menus.length; i++) {
               if(menus[i].equals(menu)) {
                  System.out.println(menu + " �Ǹ� �Ϸ�");
               }
            }
         }
         
         @Override
         public String[] getMenu() {
            return new String[] {"�Ƹ޸�ī��", "īǪġ��", "��������", "�̴Ͼ� �����"};
         }
      });
//      --------------------------------------------------------
      System.out.println("---------------------------------");
      Nike gangNam2 = new Nike();
      Nike jamsil2 = new Nike();

      System.out.println("-- ������ �Ǹ� ��� --");
      gangNam2.register(new FormAdapter() {
		@Override
		public String[] getMenu() {
			return new String[] {"�Ź�","��","�е�"};
		}
	});
      
      System.out.println("-- ����� �Ǹ� ��� -- ");
      jamsil2.register(new Form() {
		
		@Override
		public void sell(String menu) {
			String[] sellMenus = getMenu();
			for (int i = 0; i < sellMenus.length; i++) {
				if(sellMenus[i].equals(menu)) {
					System.out.println(menu + " �Ǹ�");
				}else {
					System.out.println(menu + "�� ���� �Դϴ�.");
				}
			}
		}
		
		@Override
		public String[] getMenu() {
			return new String[] {"������Ʈ ����"};
		}
	});
      
      
      
   }
}








