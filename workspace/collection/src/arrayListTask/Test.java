package arrayListTask;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	public static void main(String[] args) {
		Love a = new Love();
		Love b = new Love();
		Love c = new Love();
		Love d = new Love();
		Love e = new Love();
		Love f = new Love();
		Love g = new Love();
		Love h = new Love();
		DateApp t = new DateApp();
		ArrayList<Love> l = new ArrayList<Love>();
		
		a.setName("ȫ�浿");
		a.setAge(20);
		b.setName("ȫ");
		b.setAge(21);
		c.setName("ȫ��");
		c.setAge(21);
		d.setName("ȫ��");
		d.setAge(26);
		f.setName("�浿");
		f.setAge(25);
		g.setName("��");
		g.setAge(24);
		h.setName("��");
		h.setAge(23);
		
		t.add(a);
		t.add(b);
		t.add(c);
		t.add(d);
		t.add(e);
		t.add(f);
		t.add(g);
		t.add(h);
		
		
		l = t.sortAge();
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
	}
}
