package interfaceEx;

//main ���� new ������ PerfectCalculator�� �����ϸ� �������̽� Calc���� �� �߻�޼��带 �����Ͽ� ��� ����Ҽ��ִ�. 
//���⼭ �ڷ����� ��������� �������̽��� Calc�� �����ϸ� ������ �������� PerfectCalculator���� ������ �޼ҵ��� CalcInfo�� ����Ҽ�����.
//������ Calc�� ������ ����ȯ�� �Ͼ� ���� ������ ������ Ŭ������ ������ �޼���� ����Ҽ� ���°��̴�.
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
