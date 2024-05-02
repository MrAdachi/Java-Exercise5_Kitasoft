package exercise3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise3_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
		
		System.out.println("1つ目の整数 : ");
		int x = Integer.parseInt(br.readLine());
		
		System.out.println("2つ目の整数 : ");
		int y = Integer.parseInt(br.readLine());
		
		if(x > y) {
			System.out.println(x);
		} else if (x < y) {
			System.out.println(y);
		} else {
			System.out.println("2つの値は同じです。");
		}
	}

}
