package sec08.exam01_method_declaration;

public class CalculatorExampl {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result 1 :" + result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println(result2);
		
		myCalc.poewrOff();
	}

}
