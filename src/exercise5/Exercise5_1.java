package exercise5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise5_1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] a = new int[10];
		
		for(int i = 0; i < a.length; i++) {
			
			System.out.print((i + 1) + "個目の要素に入れる数値を入力してください。");
			int x = Integer.parseInt(br.readLine());
			a[i] = x;
		}
		
		for(int i = 0; i < a.length; i++) {
			
			System.out.print(a[i] * 2 + " ");
		}
	}
}
