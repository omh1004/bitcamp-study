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
			System.out.println("���ڸ� �Է��ϼ���");
			anser = sc.nextInt();

			if (dap == anser) {
				System.out.println("�����Դϴ�.");
				System.out.println("�õ�Ƚ����" + count + "�Դϴ�.");
				break;

			} else if (dap > anser) {
				System.out.println("�� �� ū���Դϴ�.");
			} else if (dap < anser) {
				System.out.println("�� �� ������ �Դϴ�.");
			}
		} while (true);
	}
}