package googoodan;

public class forGoogoodan {
	public static void main(String[] args) {
		
		int dan = 2;
		int num = 1;
				
		
		//������ 1�ڷ� ���
		
//		for(dan=2;dan<=9;dan++) {
//			for(num=1;num<=9;num++) {
//				System.out.println(dan+"*"+num+"="+dan*num);
//			}
//		}
		
		//������ �ܺ��� �����ؼ� ���
		
		for(num=1;num<=9;num++) {
			for(dan=2;dan<=9;dan++) {
				System.out.print(dan+"*"+num+"="+dan*num+" ");
			}		
			System.out.println();
		}
	}
}
