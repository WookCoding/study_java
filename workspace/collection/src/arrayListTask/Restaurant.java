package arrayListTask;

import java.util.ArrayList;

public class Restaurant{
	public ArrayList<Food> foods = DBConnecter.foods;
	
// 	���� �߰�
	public void add(Food food) {
		foods.add(food);
	}
	
//	���� �̸����� ���� ���� ��ȸ
	public String lookUp(String name) {
		String kind = null;
		for (int i = 0; i < foods.size(); i++) {
			if(foods.get(i).getName().equals(name)) {
				kind = foods.get(i).getKind();
			}
		}
		return kind;
	}

//	����ڰ� ���ϴ� ������ ���� ��ü ��ȸ
	public ArrayList<Food> findFood(String kind){
		ArrayList<Food> kindInfo = new ArrayList<Food>();
		for (Food food : foods) {
			if(food.getKind().equals(kind)) {
				kindInfo.add(food);
			}
		}
		return kindInfo;
	}
	
//	���� ���� ���� �� ���� 10% ���
	public void changeKind(Food food) {
		int price = price10Up(food);
		for (Food foodInfo : foods) {
			if(foodInfo.getName().equals((food.getName()))) {
				food.setKind(food.getKind());
				food.setPrice(price);
			}
		}
	}
	
//	10% �����λ�
	public int price10Up(Food food) {
		int price = food.getPrice();
		price += price * 0.1;
		
		return price;
	}
	
	
//	����ڰ� ���ϴ� ������ ���� ���� ��ȸ
	public int kindCount(String kind) {
		int count = 0;
		
		for (Food food : foods) {
			if(food.getKind().equals(kind)) {
				count++;
			}
		}
		return count;
	}
}
