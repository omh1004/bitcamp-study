package for_ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class for_ex2 {
	public static void main(String[] args) throws IOException {
		
		//https://st-lab.tistory.com/26
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		
		
		br.close();
		
		for(int i=1;i<10;i++) {
			System.out.println(a+" * "+i+" = "+a*i);
		}
	}
}
