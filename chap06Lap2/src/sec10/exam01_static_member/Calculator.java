package sec10.exam01_static_member;

public class Calculator {
	static double pi = 3.14159;  // 정적 필드, 메소드 메모리 생성
	
	static int plus(int x, int y) { 
		return x+y;
	}
	
	static int minus(int x, int y) { 
		return x - y;
	}
}
