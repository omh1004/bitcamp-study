package interfaceEx;

// Calc �������̽��� 4���� �߻�޼ҵ� �߿��� 2���� �����ϰ� �� �������� �ʾ����Ƿ� , abstract ������ �߻�Ŭ������ �����Ѵ�.
public abstract class Calculator implements Calc {

	@Override
	public int add(int num1, int num2) {
		System.out.println("�μ��� ���ؼ� ��ȯ�մϴ�.");
		return num1 + num2;
	}

	@Override
	public int manus(int num1, int num2) {
		
		System.out.println("�μ��� ���� ��ȯ�մϴ�.");
		if (num1 > num2) {
			return num1 - num2;
		} else if (num1 < num2) {
			return num2 - num1;
		} else {
			return 0;
		}
	}
}
