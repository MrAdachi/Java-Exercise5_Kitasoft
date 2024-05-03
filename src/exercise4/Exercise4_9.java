package exercise4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise4_9 {

	public static void main(String[] args) throws IOException {
		int maxval = 0;
		int minval = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 1; i <= 10; i++) {
			System.out.print("整数を入力してください。　");
			int x = Integer.parseInt(br.readLine());
			
			if(i == 1) {
				maxval = x;
				minval = x;
			}
			
			if(maxval < x) {
				maxval = x;
			} else if (minval > x) {
				minval = x;
			}
		}
		
		System.out.println("最大値は、" + maxval + "　最小値は、" + minval + "です。");
	}
}
