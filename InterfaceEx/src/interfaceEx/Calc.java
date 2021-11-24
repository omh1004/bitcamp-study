package interfaceEx;

import interfaceEx.Calc;

//인터페이스 연습 
public interface Calc {
	// 인터페이스는 인터페이스를 구현한 클래스가 어떤 기능을 구현하는지 명세하는기능을한다.
	// 인터페이스는 추상메서드와 상수로만 구성되어 있었으나, 자바8부터는 정적메소드, 디폴트 메소드를 통해 메소드를 구현할수있다.
	// 인터페이스에서 변수를 선언하면 따로 final static 을 붙일 필요없이 , 컴파일 과정에서 상수가 된다.
	// 반드시 인터페이스를 구현하면, 추상메소드를 모두 구현하여야 하는데 구현할때, 자식클래스가 구현을 대신할수있다.
	// 그리고 구현을 다 하지못한 부모클래스는 추상클래스로 abstact 예약어를 클래스에 붙여 추상클래스로 선언해주어야한다.
	// 인터페이스를 구현한 클래스를 생성하면 묵시적으로 인터페이스로 묵시적형변환이 일어나므로 인터페이스의 메소드를 사용할수 있다.
	// 단, 클래스를 생성할때, 인터페이스 자료형으로 선언하면, 인터페이스에서 구현한 메소드만 사용이 가능하다.
	// Calc라는 인터페이스를 선언하고, 클래스를 만들어 implements 받아서 구현한다.
	// 계산기인터페이스 이고, 우선 인터페이스에서는 추상메서드만 선언하여 , 클래스에 인터페이스를 상속받아서 구현한다.
	
	double PI = 3.14;
	int error = -9999999;

	int add(int num1, int num2);
	int manus(int num1, int num2);
	double devide(int num1, int num2);
	int squre(int num1);
	int complex(int num1, int num2);
	// 디폴트 메소드 
	// 인터페이스를 구현할 클래스에 제공할
	default void descript() {
	  System.out.println("디폴트 메서드를 구현한다.");
	}
}
