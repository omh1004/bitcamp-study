package interfaceEx4;

//구현할 인터페이스인 Calc의 모든 추상메서드를 구현하지 않았으므로 abstract 예약어로 추상클래스임을 선언해준다. 
public abstract class Calculator implements Calc {
	
	@Override
	public int manus(int num1, int num2) {
		
		return num1-num2;
	}

	@Override
	public int add(int num1 , int num2) {
		return num1+num2;
	}
}
