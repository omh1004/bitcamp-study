package classExample1;

public class student {
	int student_id;
	String student_name;
	String student_address;
	
	//인스턴스를 생성하면 생성자가 없을시 자동으로 jvm에서 디폴트 생성자를 생성하는데,
	//개발자가 직접 생성자를 생성하면, jvm에서 자동으로 생성자를 생성하지 않는다.
	//필요에 의해서 생성자를 추가하는 경우에는 하나의 클래스에 여러개의 생성자가 존재할수있다.(오버로드)//매개변수가 다름
	
	public student(int id, String name, String adress) {
	}
	public student() {}
	public void StudentInfo() {
		System.out.println(student_id+","+student_address+","+student_name);
	}
}
