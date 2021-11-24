package backjun_10950;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex1 {
	
	//갯수를 입력받고 갯수만큼 두수를 입력시켜 합을 구한다.
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int sum[] = new int[num];
		
		
		System.out.println(sum.length);
		
		for(int i=0 ; 0<sum.length ; i++) {
			int a =  Integer.parseInt(br.readLine());
			int b =  Integer.parseInt(br.readLine());
			
			sum[i] =(a+b);
		}
		
		br.close();
		
		for(int j=0; 0<sum.length;j++) {
			System.out.println(sum[j]);
		}
		
	}
}
