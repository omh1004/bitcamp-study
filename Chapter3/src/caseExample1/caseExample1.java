package caseExample1;

import java.util.Scanner;

public class caseExample1 {
		
	public static void main(String[] args) {
		
		
		int lank=0;
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("점수를 입력하시오.");
		lank = sc.nextInt();
		
		
		switch(lank) {
			case 1: System.out.println("금메달");
				break;
			case 2: System.out.println("은메달");
				break;
			case 3: System.out.println("동메달");
				break;
		    default: 
		    		System.out.println("꼴지");
		
		}
	}
}

