package sec07.exam06_other_constructor_call;

public class car {
	String Company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	car() {
		
	}
	car(String model) {
		this(model, null, 0);
	}
	car(String model, String color) {
		this(model, color, 0);
	}
	car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	

}
