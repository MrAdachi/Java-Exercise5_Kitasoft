package exercise4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise4_8 {

	public static void main(String[] args) throws IOException {
		int maxval = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 1; i <= 10; i++) {
			System.out.print("自然数を入力してください。　");
			int x = Integer.parseInt(br.readLine());
			
			if(i == 1) {
				maxval = x;
			}
			
			if(!(i == 1) && (maxval < x)) {
				maxval = x;
			}
		}
		
		System.out.println(maxval);
		
	}

}
