package yogoo;

import java.util.Scanner;

public class yagoo {
	public static void main(String[] args) {
		
		int[] dap = new int[3];
		int[] answer = new int[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i =0 ; i<dap.length;i++) {
			dap[i] = (int)(Math.random()*10)+1;
			System.out.println(dap[i]);
		}
		
		while(true) {
			System.out.println("3�����Է��ϼ���");
			
			int strike=0;
			int ball=0;
			
			for(int i = 0;i<answer.length;i++) {
				answer[i] = sc.nextInt();	
			}
			
			for(int j= 0;j<dap.length;j++) {
				for(int f=0;f<answer.length;f++) {
					if(dap[j]==answer[f] && j==f) {
						strike++;
					}else if(dap[j]==answer[f] && j!=f) {
						ball++;
					}
				}
			}
			if(strike==3) {
				System.out.println("�հ�!");
				break;
			}else {
				System.out.println(strike+"��Ʈ����ũ"+ball+"���Դϴ�.");
			}
		}
	}
}
