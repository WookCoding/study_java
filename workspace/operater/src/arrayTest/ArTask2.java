package arrayTest;

import java.util.Scanner;

public class ArTask2 {
	public static void main(String[] args) {
//		�� ��ư�� ������ ��, �̵��ϴ� �������� ������ ����.
//		btn1 : ȸ������ ������
//		btn2 : �α��� ������
//		btn3 : ���� ������
		
//		ȸ������ -> �α��� -> ���� ������
//		�� ������� �Է��ؾ� �ϸ�, ���� ���� �ܰ踦 �����ϱ� ���� ���� �ܰ� ��ư�� ���� ���, ���� �ܰ迡 ���� �޼����� ������ش�.
//		ex) �α��� Ŭ�� �� , "ȸ�������� ���� �������ּ���" ���
		
//		�˸��� �ܰ��� ��ư�� ������, �ش� �ܰ迡 ���� �޼����� ������ش�.
//		ex) ȸ������ Ŭ�� ��, ȸ������ ����
//			���� ������ Ŭ�� �� ���� �̸��� ���� ���
		
		Scanner sc = new Scanner(System.in);
		String[] arBtn = {"btn1", "btn2", "btn3", "btn4"};
		String[] sccuees = {"ȸ������ ����","�α��� ����","�̸�: %s ����: %s"};
		String btn = "";
		String name = "", age = "";
		int count = 0;
		int click = 0;
		boolean flag = false;
		
		while(!flag) {
			for (int i = 0; i < arBtn.length; i++) {
				System.out.println(i + 1 + ". " + arBtn[i]);
			}
			btn = sc.next();
			
//			ȸ������ ��ư
			if(arBtn[0].indexOf(btn) == 0) {
				System.out.println("�̸��� �Է����ּ���");
				name = sc.next();
				System.out.println("���̸� �Է����ּ���");
				age = sc.next();
				System.out.println(sccuees[0]);
				count = 1;
				continue;
			}
//			�α��� ��ư
			if(arBtn[1].indexOf(btn) == 0 && count == 1) {
				System.out.println(sccuees[1]);
				count = 2;
				continue;
			}else if(count == 0){
				System.out.println("ȸ������ �Ǵ� �α����� �ؾ��մϴ�.");
			}
			
//			����������
			if(arBtn[2].indexOf(btn) == 0 && count == 2) {
				System.out.printf(sccuees[2]+"\n",name,age);
				count = 0;
			}else if(count == 1) {
				System.out.println("�α����� �ϼž��մϴ�");
			}
			
//			�α׾ƿ�
			if(arBtn[3].indexOf(btn) == 0 && count == 2) {
				System.out.println("�α׾ƿ� ����");
				flag = true;
			}
		}	
//-----------------------------------------------------------------------
//		����� �ڵ�
		
//      �� ��ư�� ������ ��, �̵��ϴ� �������� ������ ����.
	      
//      btn1 : ȸ������ ������
//      btn2 : �α��� ������
//      btn3 : ���� ������
      
//      ȸ������ -> �α��� -> ���� ������
//      �� ������� �Է��ؾ� �ϸ�, ���� ���� �ܰ踦 �����ϱ� ���� ���� �ܰ� ��ư�� ���� ���, ���� �ܰ迡 ���� �޼����� ������ش�.
//      ��) �α��� Ŭ�� ��, "ȸ�������� ���� �������ּ���" ���
      
//      �˸��� �ܰ��� ��ư�� ������, �ش� �ܰ迡 ���� �޼����� ������ش�.
//      ��)   ȸ������ Ŭ�� ��, ȸ������ ����
//         ���� ������ Ŭ�� ��, ���� �̸��� ���� ���
      
//      ��ư �迭
//      String[] arButton = {"btn1", "btn2", "btn3", "btn4"};
////      ���� �޼��� �迭
//      String[] arMessage = {"ȸ������ ����", "�α��� ����", "�ѵ���(20)", "�α׾ƿ� ����"};
////      ���� �޼��� �迭
//      String[] arError = {"ȸ�������� ���� �������ּ���.", "�α����� ���� �������ּ���"};
////      ���� �޼���
//      String errorMessage = "�ٽ� �õ����ּ���";
//      
//      Scanner sc = new Scanner(System.in);
////      choice : ����ڰ� �Է��� ��ȣ, temp : ����ڰ� ������ �Է��� ��ȣ
//      int choice = 0, temp = 0;
//      boolean condition = false;
//      
//      while(true) {
////         �޴� ���
//         for (int i = 0; i < arButton.length; i++) {
//            System.out.println(i + 1 + "." + arButton[i]);
//         }
//         
////         ���� temp�� 0�� ����ִٸ�, 0�� �����ؾ� �Ѵ�.
//         temp = temp == 0 ? 0 : choice;
////         ����ڰ� ������ ��ư ��ȣ
//         choice = sc.nextInt();
////         ��ư ��ȣ �̿��� ��ȣ�� �Է����� ��� ���� �޼��� ���
//         if(choice < 1 || choice > 4) {System.out.println(errorMessage); continue;}
////         �α׾ƿ� �� ���α׷� ����
//         if(choice == 4) {System.out.println(arMessage[choice - 1]); break;}
//         
////         ����ڰ� ������ ��ư�� ��ȣ - 1�� ������ ����ڰ� �Է��� ��ȣ�� ���� �� ��
////         �� �ܰ踦 ���� �ߴ� �� �˻�
//         condition = choice - 1 == temp;
//         
//         if(!condition) { // �� �ܰ踦 ������ ���
//            temp = 0; // ȸ�����Ժ��� �����϶�� ��.
//            System.out.println(arError[choice - 2]);
//            continue;
//         }
//         // �� �ܰ踦 �������� ���
//         System.out.println(arMessage[choice - 1]);
//         if(choice == 3) { // ���� �������� �������� ������
//            temp = 0; // ȸ�����Ժ��� �����϶�� ��.
//            continue;
//         }
////         ���� ������ �̿��� ���񽺸� �̿����� ��� �Է��ߴ� ��ȣ�� temp�� �����Ѵ�.
//         temp = choice;
//      }
		
		
		
		
		
		
		
	}
}
