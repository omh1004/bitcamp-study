package classExample1;

public class studentTest {
	public static void main(String[] args) {
		//클래스를 사용하기 위해서는 new를 통해서 객체(인스턴스)를 생성해서 사용해야하는데,
		//new를 통해 인스턴스를 생성하게 되면, heap메모리에 저장이된다.
		student oh = new student();
		oh.student_id = 11;
		oh.student_address="화성시";
		oh.student_name="ohoh";
		
		oh.StudentInfo();
	}
}
