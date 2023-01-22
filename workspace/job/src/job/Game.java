package job;

import java.util.Random;
import java.util.Scanner;

class PrimitiveMan {
//	����
	String identity;
//	����
	String gender;
//	���, ä�� ���� Ƚ��
	int count;
//	����� 
	int restCount;
	
//	�⺻ ������
	public PrimitiveMan() {;}
//	������
	public PrimitiveMan(String identity, int restCount) {
		this.identity = identity;
		this.restCount = restCount;
	}
	
//	ä��
	boolean faming() {
		// ä������ 5���� Ŭ �� false;
		if(count < 5) {
			//ä������ 5���� ������ ä���� +1 , true ���� 
			count++;
			return true;
		}
		return false;
	}
	
//	���
	boolean hunting() {
		// ��ɼ���Ƚ���� 10���� Ŭ �� false;
		if(count < 10) {
			//��ɼ���Ƚ���� 10���� ���� �� ��ɼ���Ƚ�� 1ȸ ���� 
			count++;
			return true;
		}
		return false;
	}
	
//	����� ����
	boolean restCountMin() {
		if(restCount == 0) {
			return false;
		}else {
			restCount--;
			return true;
		}
	}
	
//	�޽� �� ����� �߰�
	void restCountUp() {
		restCount += 3;
	}
	
//	Ȯ�� �޼ҵ�
	boolean percent() {
		Random r = new Random();
		int[] rating = new int[10];
		int data = 50;
		
		for (int i = 0; i < data / 10; i++) {
			rating[i] = 1;
		}
		if(rating[r.nextInt(10)] == 1) {
			return true;
		}
		
		return false;
	}
	
//	���������� ��ȭ
	boolean wonsi() {
		if(count == 5) {
			return true;
		}
		return false;
	}
	
//	������ -> ���
	boolean human() {
		if(count == 10) {
			return true;
		}
		return false;
			
	}
	
}

public class Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] menus = {"������ ������ �ּ���.\n1.������\n2.������\n3.����� ���\n4.�ܰ���\n5.����",
				"������ ����ּ���.\n1.��\n2.��",
				"1.ä�� 2.���ڱ� 3.��ȭ 4.������ 5.����",
				"1.��� 2.�Ա� 3.��ȭ 4.������ 5.����"
		};
		PrimitiveMan[] pm = new PrimitiveMan[2];
		pm[0] = new PrimitiveMan("������", 10);
		pm[1] = new PrimitiveMan("������", 15);
		
		String errMsg = "�ٽ� �Է����ּ���", famingMsg = "";
		int choice = 0, data = 0;
		// flag������ ����� �� ����
		boolean check = false, flag = false;
		
		// �ݺ��� ����
		while(true) {
			System.out.println(menus[0]);
			choice = sc.nextInt();
//			�������� (������)
			if(choice == 1) {
				
				System.out.println(pm[0].identity + "�Դϴ�. -�쳢��-");	
				
				while(true) {
					
					System.out.println(menus[1]);
					choice = sc.nextInt();
//					���� ����
					if(choice == 1) {
						pm[0].gender = "��";
						
						while(true) {
							System.out.println(menus[2]);
							choice = sc.nextInt();
//							�ٳ��� ä��
							if(choice == 1) {
//								ä������ 5�� ���� ���� ��
								if(pm[0].count < 5) {
									if(pm[0].restCount > 0) {
									
										famingMsg ="�쳢��";
//										������.sleep()�� �Ἥ ä�� �ð��� ����
										try {
											System.out.print(famingMsg);
											for (int i = 0; i < 2; i++) {
												Thread.sleep(500);
												System.out.print("...");
												famingMsg += "...";
											}
											System.out.println();
										}catch(Exception e) {
											System.out.println(e);
										}
										
										check = pm[0].percent();
//										�ٳ��� ä�� ���� ��
										if(check) {
											pm[0].faming();
											pm[0].restCountMin();
											System.out.println("�ٳ��� ä�� ����");
											System.out.println("�ٳ��� ���� : " + pm[0].count +"��");
//									   ä�� ���� ��
										}else {
											pm[0].restCountMin();
											System.out.println("ä�� ����\n�ٳ��� ���� : " + pm[0].count + "��");
										}
//									������� 0�� ��
									}else {
										System.out.println("�޽��� ���ؾ��մϴ�.");
									}
//									ä������ 5�� �� ��
								}else {
									System.out.println("ä���� �ִ� 5������ �����մϴ�.");
								}
						
//							������ �޽� 
							}else if(choice == 2) {
								
								check = pm[0].percent();
								
								if(check) {
									pm[0].restCountUp();
									System.out.println("���ڱ� ���� " + pm[0].restCount + " �����");
								}else {
									System.out.println("�Ҹ���");
									System.out.println("���ڱ� ���� " + pm[0].restCount + " �����");
								}
//							3�� ��ȭ ���� ��
							}else if(choice == 3) {
//								�ٳ��� ä������ 5�� �϶�
								if(pm[0].wonsi()) {
									pm[0].count -= 5;
									
									check = pm[0].percent();
									
									if(check) {
										pm[1].gender = pm[0].gender;
										System.out.println(pm[1].identity + "�� ��ȭ�ϼ̽��ϴ�.");
										System.out.println("�찡�찡�찡��~~~~��");
										System.out.println("������� 15�� �ʱ�ȭ �˴ϴ�.");
										while(true) {
											System.out.println(menus[3]);
											choice = sc.nextInt();
	//										������ ���
											if(choice == 1) {
												if(pm[1].count < 10) {
													if(pm[1].restCount > 0){
														famingMsg ="�찡�찡...";
//														������.sleep()
														try {
															System.out.print(famingMsg);
															for (int i = 0; i < 2; i++) {
																Thread.sleep(500);
																System.out.print("...");
																famingMsg += "...";
															}
															System.out.println();
														}catch(Exception e) {
															System.out.println(e);
														}
														
														check = pm[1].percent();
														
														if(check) {
//															��� ���� ��
															pm[1].hunting();
															pm[1].restCountMin();
															System.out.println("����� ��� ���� -�찡�찡-");
															System.out.println("��� ���� Ƚ�� : " + pm[1].count +"ȸ");
//														��� ���� ��
														}else {
															pm[1].restCountMin();
															System.out.println("��� ����\n��� ���� Ƚ�� : " + pm[1].count + "ȸ");
														}
													}else {
//														������� 0 �� ��
														System.out.println("�޽��� �ʿ��մϴ�.");
													}
//												��� ����Ƚ���� 10�� �� ��
												}else {
													System.out.println("����� 10�� �������� �����մϴ�.");
												}
												
	//										������ �޽� 
											}else if(choice == 2) {
												
												check = pm[1].percent();
												
												if(check) {
													pm[1].restCountUp();
													System.out.println("�ּ��Ա� ���� " + pm[1].restCount + " �����");
												}else {
													System.out.println("������...");
													System.out.println("�ּ��Ա� ���� " + pm[1].restCount + " �����");
												}
//											��� ���� Ƚ���� 10�� �� ��
											}else if(choice == 3) {
												if(pm[1].human()) {
													pm[1].count -= 10;
													System.out.println("�����ο� ������~");
													flag = true;
//											10���� ����� ������ �� ä�m����;
												}else {
													
													System.out.println("10���� ��� ������ �̷ﳻ����.");
												}
//											�������� ������
											}else if(choice == 4) {
												
												System.out.println("���� : " + pm[1].identity + "\n���� : " + pm[1].gender + "\n��ɼ���Ƚ�� : " + pm[1].count +"ȸ" + "\n����� : " + pm[1].restCount);
//											���� ������ ��
											}else if(choice == 5){

												flag = true;
//											1,2,3,4,5 �� �ٸ� �� �������� ��
											}else {
												System.out.println(errMsg);
											}
											if(flag) {
												
												break;
											}
											
										}
										
									}else {
//										��ȭ ���� �� Ȯ���ο򿡼� ���� ��ȭ ����
										System.out.println("��ȭ ����");
									}
//									�̹� 5���� ä������ ������ �ִٸ�
								}else {
									System.out.println("5���� �ٳ����� ä���ϼ���.");
								}
//							������
							}else if(choice == 4) {
								
								System.out.println("���� : " + pm[0].identity + "\n���� : " + pm[0].gender + "\n�ٳ��� ���� : " + pm[0].count +"��" + "\n����� : " + pm[0].restCount);
//							���� ���ý�
							}else if(choice == 5){
								
								flag = true;
							}else {
								
								System.out.println(errMsg);
							}
							if(flag) {
								
								break;
							}
							
						}
//					������ ������ ���
					}else if(choice == 2) {
							System.out.println("���ܰ� �� �˾� �ǵ��ư�");
					}
					if(flag) {
						
						break;
					}
				}
				
//			������	
			}else if(choice == 2) {
				System.out.println("�������� �� �� �˾Ѿ�?");
			
//			����� ���
			}else if(choice == 3) {
				System.out.println("����� ����� ���� ���� ��");

//			�ܰ���
			}else if(choice == 4) {
				System.out.println("�ܰ����� ���� �� �Ѥ�;;");

//			����
			}else if(choice == 5) {
				flag = true;
			}else {
				System.out.println("errMsg");
			}
			if(flag) {
				System.out.println("������ �����մϴ�.");
				break;
			}
			
		}	
		
	}
}
