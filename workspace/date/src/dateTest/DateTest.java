package dateTest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date now = new Date();
		
		String date = simpleDateFormat.format(now);
		System.out.println(date);
//		getTime() : �� ��¥�� ���̸� ���� �� ���
		System.out.println(now.getTime());
	}
}
