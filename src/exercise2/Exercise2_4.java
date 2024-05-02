package exercise2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise2_4 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("xの値");
		int x = Integer.parseInt(br.readLine());
		
		System.out.println("yの値");
		int y = Integer.parseInt(br.readLine());
		
		System.out.println("2値の和は、" + (x + y) + "です。");
		System.out.println("2値の差は、" + (x - y) + "です。");
		System.out.println("2値の積は、" + (x * y) + "です。");
		System.out.println("2値の商は、" + (x / y) + "です。");
		System.out.println("2値の余りは、" + (x % y) + "です。");
		
	}
}
