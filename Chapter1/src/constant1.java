
public class constant1 {
	public static void main(String[] args) {
		//final로 선언하여 상수화 시키기
		final int Student = 10;		
		 //final로 선언된 cNum 에 다른 값을 대입하면 에러가난다.
		// final을 사용하는 이유는 하나의 변수를 상수로 정해놓고, 수정할떄 변수의 값을 여러번 바꿀필요없이 
		//선언부에서만 변수의 값을 바꿀때 유용하다.
		if(Student == 10) {
			System.out.println(true);
		}
	}
}
