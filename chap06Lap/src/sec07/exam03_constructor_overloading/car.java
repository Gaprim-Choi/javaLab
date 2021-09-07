package sec07.exam03_constructor_overloading;

public class car {
	String Company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	car() {
		
	}
	car(String model) {
		this.model = model;
	}
	car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	

}
