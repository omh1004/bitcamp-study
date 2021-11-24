package interfaceEx4;



public class CaculatorTest {
	public static void main(String[] args) {
		PerfactCalculator calc = new PerfactCalculator();
		System.out.println(calc.add(1, 2));
		System.out.println(calc.devide(1, 0));
		System.out.println(calc.complex(1, 2));
		System.out.println(calc.squre(2));
		
		int[] arr = {1,2,3,4,5};
		int[] arr1 = new int[3];
		int[] arr2 = new int[] {1,2,3,4};
		
		//인터페이스에 구현된 정적메소드인 hap을 인터페이스 이름으로 직접 호출하여 사용
		System.out.println(Calc.hap(arr2));
	}
}
