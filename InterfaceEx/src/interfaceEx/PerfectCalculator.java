package interfaceEx;

//Calc �������̽��� ���ø���Ʈ�� Calculator Ŭ�������� �޼��带 �� �������� �ʰ� �߻�Ŭ���� ó�� �Ѱ��� ��ӹ޾����Ƿ� ������ �޼��带 �����ؾ��Ѵ�. 
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
		return "Calclator �����Ͽ����ϴ�.";
	}
}
