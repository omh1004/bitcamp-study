package breakExample;

public class breakExample1 {

	//합이 백이 넘으면 빠져나와라-- 와일문 이용
	
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
