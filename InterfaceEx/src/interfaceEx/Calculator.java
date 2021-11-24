package interfaceEx;

// Calc 인터페이스의 4가지 추상메소드 중에서 2개만 구현하고 다 구현하지 않았으므로 , abstract 예약어로 추상클래스로 선언한다.
public abstract class Calculator implements Calc {

	@Override
	public int add(int num1, int num2) {
		System.out.println("두수를 더해서 반환합니다.");
		return num1 + num2;
	}

	@Override
	public int manus(int num1, int num2) {
		
		System.out.println("두수를 빼서 반환합니다.");
		if (num1 > num2) {
			return num1 - num2;
		} else if (num1 < num2) {
			return num2 - num1;
		} else {
			return 0;
		}
	}
}
