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
		
		//�������̽��� ������ �����޼ҵ��� hap�� �������̽� �̸����� ���� ȣ���Ͽ� ���
		System.out.println(Calc.hap(arr2));
	}
}
