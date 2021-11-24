package WhileExample;

public class whileExample2 {

	public static void main(String[] args) {
		int dan = 2;
		int num = 1;
		
		while(num <= 9) {
			while(dan<= 9) {
				System.out.print(dan+"*"+num+"="+dan*num+"  ");
				dan++;
			}
			System.out.println();
			dan= 2;
			num++;
		}
	}
}
