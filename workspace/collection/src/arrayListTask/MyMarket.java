package arrayListTask;

import java.util.ArrayList;
import java.util.Iterator;

public class MyMarket {

	public ArrayList<Fruit> fruits = DBConnecter.fruits;

//	���� �߰�
	public void addFruit(Fruit fruit) {
		fruits.add(fruit);
	}

// ���� ����
	public void removeFruit(String fruitName) {
		for (int i = 0; i < fruits.size(); i++) {
			if(fruits.get(i).getFruitName().equals(fruitName)) {
				fruits.remove(i);
			}
		}
	}
	
// ���� ������ ��� ���ݺ��� ���� �� �˻�
	public boolean avgDownCheck(int price) {
		int priceTotal = 0;
		int priceAvg = 0;
		
		for (int i = 0; i < fruits.size(); i++) {
			priceTotal += fruits.get(i).getPirce();
		}
			priceAvg = priceTotal / fruits.size();
		
		if(price < priceAvg) {
			return true;
		}
		return false;
	}
	
	// ���� ��ü ��ȸ
	public ArrayList<Fruit> totalLookup() {
//		ArrayList<Fruit> fruitsInfo = new ArrayList<Fruit>();
//			for (Fruit fruit : fruits) {
//				fruitsInfo.add(fruit);
//			}
//		return fruitsInfo;
		return fruits;
	}
	
//	���� �̸����� ���� ��ȸ
	public int findFruitPrice(String FruitName) {
		int price = 0;
		for (int i = 0; i < fruits.size(); i++) {
			if(fruits.get(i).getFruitName().equals(FruitName)) {
				price = fruits.get(i).getPirce();
				return price;
			}
		}
		return price;
	}
}
