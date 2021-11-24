package backjun_8393;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex01 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int sum = 0;
				
		br.close();
		
		for(int i=0;i<num;i++) {
			sum+=i+1;
		} 
				
		System.out.println(sum);

	}
}
