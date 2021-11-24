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
			System.out.println("3개를입력하세요");
			
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
				System.out.println("합격!");
				break;
			}else {
				System.out.println(strike+"스트라이크"+ball+"볼입니다.");
			}
		}
	}
}
