package for_ex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException{
		
		//https://st-lab.tistory.com/26
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		
		br.close();
		
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		
		
		
		for(int i= 1;i<10;i++) {
			bw.write(a+" * "+i+" = "+(a*i)+"\n");	
		}
		bw.flush();
		bw.close();
	}
}