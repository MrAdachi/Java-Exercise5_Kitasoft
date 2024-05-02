package exercise3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise3_5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
		
		System.out.print("正の整数 : ");
		int x = Integer.parseInt(br.readLine());
		
		if(x % 2 == 0) {
			System.out.println("偶数です。");
		} else {
			System.out.println("奇数です。");
		}
	}

}
