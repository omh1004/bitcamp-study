package interfaceEx2;

import java.io.IOException;

public class callCenterTest {
	public static void main(String[] args) throws IOException {
		System.out.println("���Ͻô� ���񽺸� �����ϼ���");
		System.out.println("����� �ݼ��񽺸� ���ϸ� f �Ǵ� F�� �Է��ϼ���");
		System.out.println("Vip �ݼ��񽺸� ���ϸ�  v�Ǵ� V�� �Է��ϼ���");
		
		int ch = System.in.read();
		callCenter callCenter = null;
		
		
		if(ch=='f' || ch=='F') {
			callCenter = new flatCall(); 
		}else if(ch=='v'|| ch=='V') {
			callCenter = new ImportanteCall();
		}else {
			System.out.println("�������� �ʴ� �����Դϴ�.");
			return;
		}
		
		callCenter.devideMen();
		callCenter.sendAgentCall();
	}
}
