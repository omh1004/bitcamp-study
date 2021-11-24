
public class operationEx3 {
	public static void main(String[] args) {
		//비트연산자
		int num1 = 5; //00000101
		int num2 = 10; // 00001010
		
		int bNum = ~num1; //11111010
		
		int num3 = num1 & num2; //  00000101 
							    //& 00001010
		
		int num4 = num1 | num2; //  00000101
								//| 00001010
								//  00001111 = 15
		
		int num5 = num1 << 2; 
		int num6 = num1 >> 2; 
		
		System.out.println(bNum);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		
		
		
		
		
	}
}
