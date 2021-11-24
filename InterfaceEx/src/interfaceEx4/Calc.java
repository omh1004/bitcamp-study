package interfaceEx4;

//정적메소드, private 메소드
//정적메소드는 인터페이스를 구현하는 클래스에서 인스턴스 생성없이 사용할수 있고, 인터페이스명으로 직접 메소드를 불러서 사용할수 있으며, 예약어 static을 사용하여 메소드를 구현한다.
//private 메소드는 자바9부터 인터페이스에도 private메소드를 구현할수 있으며, 인터페이스를 구현하는 클래스에서는 생성하거나 호출할수없다. 그래서 인터페이스를 구현하는 여러클래스
//에서 똑같은 기능의 메소드를 사용할때 , 인터페이스에 private메소드를 사용하면, 코드의 재활용성을 높일수있다.
//private 메소드는 static예약어와 같이 사용하여 private static 메소드로 사용이가능하다.
public interface Calc {

	int ERROR = -99999;
	double PI = 3.14;
	
	int add(int num1,int num2);
	int manus(int num1,int num2);
	double devide(int num1 ,int num2);
	int complex(int num1, int num2);
	int squre(int num);
	
	//default 메소드에 private메소드를 호출 
	default void discuss() {
		System.out.println("디폴드 메소트 호출!");
	}
	
	//배열의 모든값을 받아서 합을 구하는 메소드를 정적메소드로 구현
	static int hap(int [] arr) {
		int total=0;
		
		for(int num : arr) {
			total+=num;
		}		
		return total;
	}
}
