package continuExample;

public class continueExample1 {
	
	//1~100까지의 합중에서 짝수의 합만을 구하라-while문 이용
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
