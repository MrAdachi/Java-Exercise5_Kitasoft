package exercise2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise2_5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("1つ目の整数値");
		int x = Integer.parseInt(br.readLine());
		
		System.out.println("2つ目の整数値");
		int y = Integer.parseInt(br.readLine());
		
		
		int ave = (x + y)/2;
		System.out.println("平均値は、" + ave + "です。");
		
	}
}
