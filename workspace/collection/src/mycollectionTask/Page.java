package mycollectionTask;

import java.util.Scanner;

public class Page {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserField userField = new UserField();
		User user = new User();

		String id = null, name = null, pw = null, phoneNumber = null, number = null, checkNumber = null,
				password = null;
		boolean flag1 = false, flag2 = false ,flag3 = false;
		int choice = 0;

		while (!flag2) {
			// �޴� �޼��� 
			System.out.println("1.ȸ������ 2.�α��� 3.��й�ȣ ã�� 4.����");
			// ��ȣ 
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				// ȸ������
				System.out.println("���̵� : ");
				id = sc.next();
				// id�� �ߺ��̾��� ��
				if (userField.idCheck(id).equals(id)) {
					System.out.println("�ߺ��� ���̵� �Դϴ�.");
					continue;
				}

				System.out.println("��й�ȣ : ");
				pw = sc.next();

				System.out.println("�̸� :");
				name = sc.next();
				while (true) {
					System.out.println("�޴��� ��ȣ : ");
					phoneNumber = sc.next();
					// �ڵ�����ȣ ���� 010����
					if(phoneNumber.startsWith("010")) {
						// �ڵ��� ��ȣ�� �ߺ��̾��� ��
						if (userField.phoneNumberCheck(phoneNumber)) {
							System.out.println("�ߺ��� �ڵ��� ��ȣ�Դϴ�.");
						} else {
							break;
						}
					}else {
						System.out.println("�ڵ��� ��ȣ�� 010���� �������ּ���.");
					}
				}
				// ȸ������ �޼ҵ�
				userField.sign(name, id, pw, phoneNumber);
				for (int i = 0; i < userField.users.size(); i++) {
					if (i == 0) {
						System.out.println("=================");
					}
					System.out.println(userField.users.get(i).toString());
					System.out.println("=================");
				}
				break;

			// �α���
			case 2:
				System.out.println("���̵� : ");
				id = sc.next();
				System.out.println("��й�ȣ : ");
				pw = sc.next();
				// �α��� ���� ��
				if (userField.loginCheck(id, pw)) {
					user = userField.login(id, pw);
					System.out.println("�α��� ����");
					// �α��� �� �ݺ��� ����
					while (true) {
						System.out.println("1.��й�ȣ ���� 2. �α׾ƿ�");
						choice = sc.nextInt();
						if (choice == 1) {
							System.out.println("���� ��й�ȣ�� �Է����ּ���.");
							pw = sc.next();
							// ���� ��й�ȣ�� �Էµ� ��й�ȣ�� ������ Ȯ���ϴ� �޼ҵ�
							if (userField.pwCheck(user, pw)) {
								System.out.println("������ ��й�ȣ �Է����ּ���.");
								pw = sc.next();
								// ������ ��й�ȣ�� �������ִ� �޼ҵ�
								userField.pwChange(user, pw);

								System.out.println("��й�ȣ ������ �Ϸ�Ǿ����ϴ�.");
								System.out.println("�ٽ� �α��� ���ּ���.");
								// ��й�ȣ ����Ǹ� �α��� �ϱ��� �������� �ǵ��ư��� ���� flag
								flag1 = true;
							} else { // ���� ��й�ȣ�� Ʋ����
								System.out.println("���� ��й�ȣ�� Ʋ�Ƚ��ϴ�.");
							}
							// ����
						} else if (choice == 2) {
							break;
						}
						// ��й�ȣ ���� �� �ٽ� �α��� �ϱ� ���ؼ� while�� ������ ����
						if (flag1) {
							break;
						}
					}
				} else { // �α��� ���� �� 
					System.out.println("�α��� ����");
				}
				break;
			case 3: // ��й�ȣ ã��
				System.out.println("���̵� �Է����ּ���.");
				id = sc.next();
				// ��й�ȣ ã���� ���̵� �ִ� �� �˻�
				if (userField.idCheck(id).equals(id)) {
					while(true) {
						System.out.println("�ڵ��� ��ȣ�� �Է����ּ���.");
						phoneNumber = sc.next();
						// �ش� ���̵��� �ڵ�����ȣ�� ��ġ�ϴ� �� �˻�
						if(userField.phoneNumberCheck(phoneNumber,id)) {
							// ���� �ڵ��� ��ȣ�� �Է��ϰ� sms�� ���ִ� �޼ҵ�
							checkNumber = userField.smsCheck(phoneNumber);
							while(true) {
								System.out.println("������ ������ȣ�� �Է����ּ���.");
								number = sc.next();
								if (checkNumber.equals(number)) {
									password = userField.findPw(phoneNumber);
									System.out.println(password);
									flag3 = true;
								}else {
									System.out.println("������ȣ�� Ʋ�Ƚ��ϴ�.");
								}
								if(flag3) {
									break;
								}
							}
						}else {
							System.out.println("�ش� ���̵��� �ڵ�����ȣ�� ��ġ���� �ʽ��ϴ�.");
						}
						if(flag3) {
							break;
						}
					}
				}else {
					System.out.println("���� ���̵� �Դϴ�.");
				}
				break;
			case 4:
				System.out.println("�ý��� ����");
				flag2 = true;
				break;
			default:
				break;
			}
		}
	}
}
