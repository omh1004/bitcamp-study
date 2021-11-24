package baseball;

import java.util.Random;

import randomNum.randomNum;

public class numBaseball {
	public static void main(String[] args) {
		int count = 0;
		int[] dap = new int[3];
		int[] anser = new int[3];
		
		for(int i=0;i<dap.length;i++) {
			int num = (int)(Math.random()*10)+1;
			dap[i] = num;
			System.out.println(dap[i]);
		}
		
		System.out.println(dap[1]);

		//while (true) {
//		}
	}
}
