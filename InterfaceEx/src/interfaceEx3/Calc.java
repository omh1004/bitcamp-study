package interfaceEx3;

//����Ʈ �޼ҵ� 
//�������̽��� ������ Ŭ������ ������ ����Ʈ�޼���� default ���� ����ο� ����, �����α��� ������ ���´�.
//����Ʈ �޼ҵ� ���� ��ӹ��� �޼��忡�� �����ǰ� �����ϴ�.
public interface Calc {
	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int num1,int num2);
	int manus(int num1,int num2);
	double devide(int num1,int num2);
	int complex(int num1 , int num2);
	int squre(int num);
	
	default void decreipt() {
		System.out.println("����Ʈ �޼��带 �����Ѵ�.");
	}
}
