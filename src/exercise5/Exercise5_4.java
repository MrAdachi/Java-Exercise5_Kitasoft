package exercise5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise5_4 {

	public static void main(String[] args) throws IOException {
		int input_sum;
		int i;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] a = new int[10];
		
		for(input_sum = 0, i = 0; input_sum <= 100 && i < 10; i++) {
			System.out.print("数値を入力してください。");
			a[i] = Integer.parseInt(br.readLine());
			input_sum += a[i];
		}
		
		for(int j = 0; j < i; j++) {
			System.out.print(a[j] + " ");
		}
	}
}
