package WhileExample;

public class whileExample1 {

	public static void main(String[] args) {
		int dan = 2;
		int num = 1;
		
		while(dan <= 9) {
			while(num<= 9) {
				System.out.println(dan+"*"+num+"="+dan*num);
				num++;
			}
			num= 1;
			dan++;
		}
	}
}
