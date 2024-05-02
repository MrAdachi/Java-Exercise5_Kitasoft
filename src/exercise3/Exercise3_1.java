package exercise3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise3_1 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
		
		System.out.println("xの値 : ");
		int x = Integer.parseInt(br.readLine());
		
		System.out.println("yの値 : ");
		int y = Integer.parseInt(br.readLine());
		
		if(x > y) {
			System.out.println("xはyより大きい");
		}
	}
}
