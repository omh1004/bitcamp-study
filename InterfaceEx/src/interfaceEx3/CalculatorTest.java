package interfaceEx3;

public class CalculatorTest {
	public static void main(String[] args) {
		PerfectCaculator calc = new PerfectCaculator();
		System.out.println(calc.add(1, 2));
		System.out.println(calc.manus(5, 1));
		System.out.println(calc.complex(1, 5));
		System.out.println(calc.squre(5));
		//default ¸Þ¼Òµå
		calc.decreipt();
	}
}
