package exercise4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise4_16 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("2以上の数値を入力してください。");
		int x = Integer.parseInt(br.readLine());
		
		for(int n = 2; n <= x; n++) {
			while(x % n == 0) {
				System.out.print(n + " ");
				x /= n;
			}
		}
	}
}
