package interfaceEx2;

import java.io.IOException;

public class callCenterTest {
	public static void main(String[] args) throws IOException {
		System.out.println("원하시는 서비스를 선택하세요");
		System.out.println("평등한 콜서비스를 원하면 f 또는 F를 입력하세요");
		System.out.println("Vip 콜서비스를 원하면  v또는 V를 입력하세요");
		
		int ch = System.in.read();
		callCenter callCenter = null;
		
		
		if(ch=='f' || ch=='F') {
			callCenter = new flatCall(); 
		}else if(ch=='v'|| ch=='V') {
			callCenter = new ImportanteCall();
		}else {
			System.out.println("지원하지 않는 서비스입니다.");
			return;
		}
		
		callCenter.devideMen();
		callCenter.sendAgentCall();
	}
}
