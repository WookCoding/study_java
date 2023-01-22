package codingTest;

import java.util.Scanner;

public class ThreadMain {
	public static void main(String[] args) {
		final int SIZE = 3;
		Runnable threadTask = new ThreadTask();
		Scanner sc = new Scanner(System.in);
		int[] arInput = new int[3];
		Thread[] arThread = new Thread[SIZE];
		
		
		for (int i = 0; i < arThread.length; i++) {
			arThread[i] = new Thread(threadTask);
		}
		
		System.out.println("��) 3 1 2");
		System.out.print("�Է� : ");
		for (int i = 0; i < arThread.length; i++) {
			arThread[i].setName(sc.next());
			arThread[i].start();
			try {arThread[i].join();} catch (InterruptedException e) {;}
		}
	}
}
