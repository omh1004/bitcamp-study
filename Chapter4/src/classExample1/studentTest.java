package classExample1;

public class studentTest {
	public static void main(String[] args) {
		//Ŭ������ ����ϱ� ���ؼ��� new�� ���ؼ� ��ü(�ν��Ͻ�)�� �����ؼ� ����ؾ��ϴµ�,
		//new�� ���� �ν��Ͻ��� �����ϰ� �Ǹ�, heap�޸𸮿� �����̵ȴ�.
		student oh = new student();
		oh.student_id = 11;
		oh.student_address="ȭ����";
		oh.student_name="ohoh";
		
		oh.StudentInfo();
	}
}
