package caseExample1;

import java.util.Scanner;

public class caseExample1 {
		
	public static void main(String[] args) {
		
		
		int lank=0;
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("������ �Է��Ͻÿ�.");
		lank = sc.nextInt();
		
		
		switch(lank) {
			case 1: System.out.println("�ݸ޴�");
				break;
			case 2: System.out.println("���޴�");
				break;
			case 3: System.out.println("���޴�");
				break;
		    default: 
		    		System.out.println("����");
		
		}
	}
}

