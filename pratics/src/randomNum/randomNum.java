package randomNum;

import java.util.Scanner;

public class randomNum {

	public static void main(String[] args) {

		int dap = (int) ((Math.random() * 100) + 1);
		int anser = 0;
		int count = 0;

		do {
			count++;
			Scanner sc = new Scanner(System.in);
			System.out.println("숫자를 입력하세요");
			anser = sc.nextInt();

			if (dap == anser) {
				System.out.println("정답입니다.");
				System.out.println("시도횟수는" + count + "입니다.");
				break;

			} else if (dap > anser) {
				System.out.println("좀 더 큰수입니다.");
			} else if (dap < anser) {
				System.out.println("좀 더 작은수 입니다.");
			}
		} while (true);
	}
}