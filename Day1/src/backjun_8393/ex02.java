package backjun_8393;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex02 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		br.close();
		System.out.println((num*(1+num))/2);
	}
}
