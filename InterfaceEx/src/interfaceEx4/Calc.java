package interfaceEx4;

//�����޼ҵ�, private �޼ҵ�
//�����޼ҵ�� �������̽��� �����ϴ� Ŭ�������� �ν��Ͻ� �������� ����Ҽ� �ְ�, �������̽������� ���� �޼ҵ带 �ҷ��� ����Ҽ� ������, ����� static�� ����Ͽ� �޼ҵ带 �����Ѵ�.
//private �޼ҵ�� �ڹ�9���� �������̽����� private�޼ҵ带 �����Ҽ� ������, �������̽��� �����ϴ� Ŭ���������� �����ϰų� ȣ���Ҽ�����. �׷��� �������̽��� �����ϴ� ����Ŭ����
//���� �Ȱ��� ����� �޼ҵ带 ����Ҷ� , �������̽��� private�޼ҵ带 ����ϸ�, �ڵ��� ��Ȱ�뼺�� ���ϼ��ִ�.
//private �޼ҵ�� static������ ���� ����Ͽ� private static �޼ҵ�� ����̰����ϴ�.
public interface Calc {

	int ERROR = -99999;
	double PI = 3.14;
	
	int add(int num1,int num2);
	int manus(int num1,int num2);
	double devide(int num1 ,int num2);
	int complex(int num1, int num2);
	int squre(int num);
	
	//default �޼ҵ忡 private�޼ҵ带 ȣ�� 
	default void discuss() {
		System.out.println("������ �޼�Ʈ ȣ��!");
	}
	
	//�迭�� ��簪�� �޾Ƽ� ���� ���ϴ� �޼ҵ带 �����޼ҵ�� ����
	static int hap(int [] arr) {
		int total=0;
		
		for(int num : arr) {
			total+=num;
		}		
		return total;
	}
}
