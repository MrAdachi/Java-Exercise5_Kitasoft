package exercise5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise5_2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] a = new int[10];
		
		for(int i = 0; i < a.length; i++) {
			
			System.out.print("数値を入力してください。");
			a[i]  = Integer.parseInt(br.readLine());
			
		}
		
		for(int i = 0; i < a.length; i++) {
			
			System.out.print(a[a.length - 1 - i] + " ");
		}
		
	}
}
