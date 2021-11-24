package interfaceEx3;

//디폴트 메소드 
//인터페이스를 재현할 클래스에 제공할 디폴트메서드는 default 예약어를 선언부에 적고, 구현부까지 구현해 놓는다.
//디폴트 메소드 역시 상속받은 메서드에서 재정의가 가능하다.
public interface Calc {
	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int num1,int num2);
	int manus(int num1,int num2);
	double devide(int num1,int num2);
	int complex(int num1 , int num2);
	int squre(int num);
	
	default void decreipt() {
		System.out.println("디폴트 메서드를 구현한다.");
	}
}
