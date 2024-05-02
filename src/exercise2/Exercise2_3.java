package exercise2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise2_3 {
	public static void main(String[] args) throws IOException {
		
		System.out.println("xの値を入力してください。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		
		System.out.println("xの1乗:" + x);
		System.out.println("xの2乗:" + (x * x));
		System.out.println("xの3乗:" + (x * x * x));
		
	}
}
