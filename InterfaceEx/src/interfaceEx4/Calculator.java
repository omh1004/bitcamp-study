package interfaceEx4;

//������ �������̽��� Calc�� ��� �߻�޼��带 �������� �ʾ����Ƿ� abstract ������ �߻�Ŭ�������� �������ش�. 
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
