package collectionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.IntStream;

public class StreamTask {
	public static void main(String[] args) {
		ArrayList<Integer> datas = new ArrayList<Integer>();
		
//		10���� 1���� ArrayList�� ��� ���
//		IntStream.range(0, 10).forEach(v -> datas.add(10-v));
//		System.out.println(datas);

//		1���� 10���� ArrayList�� ��� ���
//		IntStream.range(1, 11).forEach(datas::add);
//		System.out.println(datas);
		
//		ABCDEF�� �����ں��� ���
//		"ABCDEF".chars().forEach(v -> System.out.println((char)v));
//		IntStream.range('A', 'F').forEach(c -> System.out.println((char)c));

//		1~100���� �� Ȧ���� ArrayList�� ��� ���
//		IntStream.range(1, 51).map(v -> v * 2 - 1).forEach(datas::add);;
//		System.out.println(datas);

//		A~F���� �� D�����ϰ� ArrayList�� ��� ���
//		IntStream.range('A', 'F').map(c -> c > 67 ? c + 1 : c).forEach(c -> System.out.println((char)c));
	
//		5���� ���ڿ��� ��� �ҹ��ڷ� ����(Black, WHITE, reD, yeLLow, PINk), toLowerCase()
//		ArrayList<String> datas2 = new ArrayList<String>(Arrays.asList("Black","WHITE","reD","PINk"));
//		datas2.stream().map(String::toLowerCase).forEach(v -> System.out.println(v));
		
//		1~100���� �� Ȧ���� ArrayList�� ��� ���	
//		IntStream.range(1, 101).filter(v -> v % 2 != 0).forEach(datas::add);
//		System.out.println(datas);
		
//		Apple, banana, Melon �� ù��° ���ڰ� �빮���� ���ڿ� ���
//		ArrayList<String> datas3 = new ArrayList<String>(Arrays.asList("Apple","banana","Melon"));
//		datas3.stream().filter(v -> v.charAt(0) >= 'A' && v.charAt(0) <= 'Z').forEach(v -> System.out.println(v));
		
//		�ѱ��� ������ ����
		String e = "�����̻�����ĥ�ȱ�";
//		String f = "�������";
		String a = "1024";
		
//		f.chars().map(e::indexOf).forEach(System.out::print);
//		������ �ѱ۷� ����
		
		a.chars().map(c -> c - 48).forEach(c -> System.out.println((char)c));
	
	}
}
