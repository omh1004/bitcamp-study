package classExample1;

public class student {
	int student_id;
	String student_name;
	String student_address;
	
	//�ν��Ͻ��� �����ϸ� �����ڰ� ������ �ڵ����� jvm���� ����Ʈ �����ڸ� �����ϴµ�,
	//�����ڰ� ���� �����ڸ� �����ϸ�, jvm���� �ڵ����� �����ڸ� �������� �ʴ´�.
	//�ʿ信 ���ؼ� �����ڸ� �߰��ϴ� ��쿡�� �ϳ��� Ŭ������ �������� �����ڰ� �����Ҽ��ִ�.(�����ε�)//�Ű������� �ٸ�
	
	public student(int id, String name, String adress) {
	}
	public student() {}
	public void StudentInfo() {
		System.out.println(student_id+","+student_address+","+student_name);
	}
}
