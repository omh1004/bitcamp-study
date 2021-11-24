package for_ex;

import java.util.Scanner;

public class for_ex1 {

	public static void main(String[] args) {

		//https://st-lab.tistory.com/26
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		sc.close();
		
		for(int i =1 ; i<10; i++) {
			System.out.println(a+" * "+i+" = "+(a*i));
		}
	}	
}
