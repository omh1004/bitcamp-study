
public class convertContans {
	public static void main(String[] args) {
		//����ȯ
		//������ ����ȯ
		int iNum = 10;
		long lNum = iNum;
		double dNum = iNum;
		float fNum = 0.9f;
		double pi = 3.14;
		
		System.out.println(iNum);
		System.out.println(lNum);
		System.out.println(dNum);
		// int���� �����Ͱ� ū long �̳� �Ǽ��� double�� �־��� ��쿡�� ���� ����ȯ�� ���� �ʾƵ� �ȴ�.
		
		
		//������ ����ȯ
		iNum = (int)lNum;
		System.out.println(iNum);
		iNum = (int)dNum;
		System.out.println(iNum);
		//int���� ū long���̳� �Ǽ��� double������ �����͸� int�� ���� ������ ����ȯ ĳ������ �ʿ��ϴ�.
		
		
		//����ȯ ����
		int sum1 = (int)(fNum + pi);
		int sum2 = (int)fNum +(int)pi;
		
		System.out.println(sum1);//4
		System.out.println(sum2);//3
		//sum1 �� ���� ���� ����ȯ �ϱ��� 0.9�� 3.14�� ���Ѵ����� ����ȯ�� �ؼ� 4�� ���°��̰�,
		//sum2 �� ���ϱ��� ����ȯ�� ���� int���� ������ �ٲ�鼭 �Ҽ��� �ڰ� Ʈ��ũ �Ǽ� 0+3�� �����߱⶧���� 3�̳��´�.
	}
}
