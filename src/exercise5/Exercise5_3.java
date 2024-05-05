package exercise5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise5_3 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] a = new int[10];
		
		for(int i = 0; i < a.length; i++) {
			System.out.print("数値を入力してください。");
			a[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.print("偶数 : ");
		
		for(int i = 0; i < a.length; i++) {
			
			if(a[i] % 2 == 0) {
				System.out.print(a[i] + " ");
			}
		}
		
		System.out.println();
		System.out.print("奇数 : ");
		
		for(int i = 0; i < a.length; i++) {
			
			if(a[i] % 2 != 0) {
				System.out.print(a[i] + " ");
			}
		}
	}
}
