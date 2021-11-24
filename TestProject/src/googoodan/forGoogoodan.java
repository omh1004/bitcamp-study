package googoodan;

public class forGoogoodan {
	public static void main(String[] args) {
		
		int dan = 2;
		int num = 1;
				
		
		//구구단 1자로 출력
		
//		for(dan=2;dan<=9;dan++) {
//			for(num=1;num<=9;num++) {
//				System.out.println(dan+"*"+num+"="+dan*num);
//			}
//		}
		
		//구구단 단별로 구분해서 출력
		
		for(num=1;num<=9;num++) {
			for(dan=2;dan<=9;dan++) {
				System.out.print(dan+"*"+num+"="+dan*num+" ");
			}		
			System.out.println();
		}
	}
}
