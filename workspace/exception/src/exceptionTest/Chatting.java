package exceptionTest;

import java.io.IOException;
import java.util.Scanner;

public class Chatting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = null;
		
		System.out.print("�޼��� : ");
		message = sc.nextLine();
		
		if(message.contains("�ٺ�")) {
			try {
				throw new BadWordExption("�弳�� �ȵǿ�!");
			} catch (BadWordExption e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
