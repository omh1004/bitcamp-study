package interfaceEx2;

//인터페이스와 다형성 
//인터페이스에서 구현할 메소드의 선언부를 작성하고, 여러 클래스에서 하나의 인터페이스를 구현하여 다형성을 이용하여 메소드를 재정의한다.
//실행을 할때, 자료형은 인터페이스로 선언하고, 인터페이스를 구현한 클래스를 서로 다른 클래스를 상황에 따라 생성하면, 다형성으로 인해, 
//클래스마다 재정의된 메소드로 실행이 된다.
public interface callCenter {
	public void devideMen();
	public void sendAgentCall();
}
 