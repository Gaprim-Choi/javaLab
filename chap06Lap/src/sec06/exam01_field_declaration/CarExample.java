package sec06.exam01_field_declaration;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		System.out.println(myCar.Company);
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		System.out.println(myCar.maxSpeed);
		System.out.println(myCar.speed);
		
		myCar.speed = 60;
		System.out.println(myCar.speed);
	}
}
