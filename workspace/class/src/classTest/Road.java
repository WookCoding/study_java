package classTest;

class Car{
//	�귣��
//	����
//	����
	/*��������*/
	String brand;
	String color;
	int price;
	
	public Car() {; }
	
	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	
	public Car(String color, int price) {
		this.color = color;
		this.price = price;
	}

	//	�õ��ѱ�
	void enginOn() {
		System.out.println(this.brand + " �õ� �ѱ�");
	}
//	�õ�����
	void enginOff() {
		System.out.println(this.brand + " �õ� ����");
	}
}

public class Road {
	public static void main(String[] args) {
		Car myCar = new Car("KIA","Black",3000);
		Car momCar = new Car("BENZ","WHITE",3000);
		Car dadyCar = new Car("RED",6000);
		myCar.enginOn();
		myCar.enginOff();
		
		dadyCar.enginOn();
		dadyCar.enginOff();
	}
}
