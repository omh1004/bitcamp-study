package interfaceEx;

//main 에서 new 예약어로 PerfectCalculator을 생성하면 인터페이스 Calc에서 의 추상메서드를 구현하여 모두 사용할수있다. 
//여기서 자료형을 가장상위의 인터페이스인 Calc로 선언하면 마지막 구현부인 PerfectCalculator에서 구현한 메소드인 CalcInfo는 사용할수없다.
//상위인 Calc로 묵시적 형변환이 일어 나기 때문에 하위의 클래스에 구현한 메서드는 사용할수 없는것이다.
public class CalclatorTest {
	public static void main(String[] args) {
		
		PerfectCalculator calc = new PerfectCalculator();
				
		System.out.println(calc.add(1, 2));
		System.out.println(calc.manus(3, 1));
		System.out.println(calc.complex(5, 4));
		System.out.println(calc.devide(2, 4));
		
		calc.CalcInfo();
		
	}
}
