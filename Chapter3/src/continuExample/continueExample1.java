package continuExample;

public class continueExample1 {
	
	//1~100������ ���߿��� ¦���� �ո��� ���϶�-while�� �̿�
	public static void main(String[] args) {
		
		int num = 1;
		int total = 0;
		
		while(num <=100) {
			if(num%2==1) {
				num++;
				continue;
			}
			total+=num;
			num++;
		}
		System.out.println(total);
	}
}
