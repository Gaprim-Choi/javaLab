package sec13.exam03_field_method_access.package1;

public class B {
	public B() {  // �⺻ ������
		A a = new A();
		a.field1 = 1;  // public, 0
		a.field2 = 1;  // default, 0
		//a.field3 = 1;  // private, x
		
		a.method1();
		a.method2();
		//a.method3();
		
	}

}
