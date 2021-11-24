package interfaceEx2;

public class flatCall implements callCenter {

	@Override
	public void devideMen() {
		System.out.println("상담전화를 순서대로 받아옵니다!");
	}

	@Override
	public void sendAgentCall() {
		System.out.println("걸려온 순서대로 상당원을 연결해줍니다!");
	}
}
