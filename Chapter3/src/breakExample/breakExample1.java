package breakExample;

public class breakExample1 {

	//���� ���� ������ �������Ͷ�-- ���Ϲ� �̿�
	
	public static void main(String[] args) {
		
		int num = 1;
		int total=0;
		
		while(true) {
			total+=num;
			if(total>=100) {				
				break;
			}
			num++;
		}
		System.out.println(total);
		System.out.println(num);
	}
	
}
