package sec09.exam01_instance_member;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car("람보르기니");
		Car yourCar = new Car("SM5");
		
		//Car.run(); // x
		myCar.run();
		yourCar.run();

	}

}
