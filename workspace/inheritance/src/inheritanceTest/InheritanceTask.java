package inheritanceTest;

class Car {
	String brand;
	String color;
	int price;
	
	public Car() {;}
	
	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	void enginStart() {
		System.out.println("����� �õ� Ŵ");
	}
	
	void enginStop() {
		System.out.println("����� �õ� ��");
	}
}

class SuperCar extends Car {

	String mode;
	
	public SuperCar() {;}

	public SuperCar(String brand, String color, int price, String mode) {
		super(brand, color, price);
		this.mode = mode;
	}

//	����ī�� �������� �õ��� �Ѱ� �� �� �ִ�.
	@Override
	void enginStart() {
		System.out.println("�������� �õ� Ŵ");
	}
	
	@Override
	void enginStop() {
		System.out.println("�������� �õ� ��");
	}
	
}

public class InheritanceTask {
	public static void main(String[] args) {
		SuperCar ferrari = new SuperCar("Ferrari", "Red", 55000, "Sport");
	
		ferrari.enginStart();
		ferrari.enginStop();
	}
}
