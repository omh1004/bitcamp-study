package interfaceEx;

//Calc 인터페이스를 임플리먼트한 Calculator 클래스에서 메서드를 다 구현하지 않고 추상클래스 처리 한것을 상속받았으므로 나머지 메서드를 구현해야한다. 
public class PerfectCalculator extends Calculator {

	@Override
	public double devide(int num1, int num2) {
		if (num2 != 0) {
			return num1 / num2;
		} else
			return Calc.error;
	}

	@Override
	public int squre(int num1) {
		return num1 * num1;
	}

	@Override
	public int complex(int num1, int num2) {
		return num1 * num2;
	}

	public String CalcInfo() {
		return "Calclator 구현하였습니다.";
	}
}
