package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class FileTask {
	public static void main(String[] args) throws IOException {
		String[] games = {"��Ʋ�׶���","��","������ġ","�ν�Ʈ��ũ","�����ý��丮","��Ÿũ����Ʈ"};
		
		
//		�迭�� ����ϰ� ��ü ������ �����ͼ� �ֿܼ� ����ϱ�
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/games.txt",true));
//	
//		for (int i = 0; i < games.length; i++) {
//			bufferedWriter.write(games[i] + "\n");
//		}
//		
//		bufferedWriter.close();
		
//		BufferedReader bufferedReader = null;
//		String game = null;
//		try {
//		bufferedReader = new BufferedReader(new FileReader("src/games.txt"));
//			while((game = bufferedReader.readLine()) != null) {
//				System.out.println(game);
//			}
//		} catch (FileNotFoundException e) {
//			System.out.println("�߸��� ���");
//			e.printStackTrace();
//		} finally {
//			if(bufferedReader != null) {
//				bufferedReader.close();
//			}
//		}
		
//		�ν�Ʈ ��ũ�� ���� 2002�� ����
//		BufferedReader bufferedReader = null;
//		String line = null, temp = "";
//		final String TARGET = "�ν�Ʈ��ũ";
//		
//		try {
//			bufferedReader = new BufferedReader(new FileReader("src/games.txt"));
//			while((line = bufferedReader.readLine()) != null) {
//				if(line.equals(TARGET)) {
//					temp += "����2002\n";
//					continue;
//				}
//				temp += line + "\n";
//			}
//			
//			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/games.txt"));
//			bufferedWriter.write(temp);
//			bufferedWriter.close();
//			
//		} catch (FileNotFoundException e) {
//			System.out.println("�߸��� ���");
//			e.printStackTrace();
//		} finally {
//			if(bufferedReader != null) {
//				bufferedReader.close();
//			}
//		}
		
//		���� 2002 ����
//		BufferedReader bufferedReader = null;
//		String line = null, temp = "";
//		final String TARGET = "����2002";
//		
//		try {
//			bufferedReader = new BufferedReader(new FileReader("src/games.txt"));
//			while((line = bufferedReader.readLine()) != null) {
//				if(line.equals(TARGET)) {
//					continue;
//				}
//				temp += line + "\n";
//			}
//			
//			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/games.txt"));
//			bufferedWriter.write(temp);
//			bufferedWriter.close();
//			
//		} catch (FileNotFoundException e) {
//			System.out.println("�߸��� ���");
//			e.printStackTrace();
//		} finally {
//			if(bufferedReader != null) {
//				bufferedReader.close();
//			}
//		}
		
		
	}
}
