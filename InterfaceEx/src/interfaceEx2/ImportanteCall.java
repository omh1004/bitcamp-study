package interfaceEx2;

public class ImportanteCall implements callCenter  {

	@Override
	public void devideMen() {
		System.out.println("Vip 먼저 전화를 받아옵니다!");
	}

	@Override
	public void sendAgentCall() {
		System.out.println("Vip에게 친절한 상담원을 연결해줍니다!");
	}
}
