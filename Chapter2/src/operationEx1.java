
public class operationEx1 {

	public static void main(String[] args) {
		//���� && �� ������ ��� true �϶��� ����� true
		//���� || �� ������ �ϳ��� true ���� ����� true
		
		//�ܶ�ȸ�� ��
		
		int num = 10;
		int i = 1;
		
		//�������� ���� ���� false�̸� �ڿ� ���� ������ �����Ƿ� ����� false�̰� �ڿ� ���� ���Կ����� i�� ���� �ٲ��� �ʴ´�.
		
		boolean value =  ((num+10 < 10) && ((i = i+2) < 10));
		
		System.out.println(value);
		System.out.println(num);
		System.out.println(i);

		//���տ��� ���� ���� true�̸� �ڿ� ���� ������ �����Ƿ� ����� true�̰� , �ڿ� ���� ������ �����Ƿ� i�� ���� �ٲ��� �ʴ´�.
		
		boolean value2 = (num+10 > 10) || ((i = i+2) <10);
		
		System.out.println(value2);
		System.out.println(num);
		System.out.println(i);
		
	}

}
