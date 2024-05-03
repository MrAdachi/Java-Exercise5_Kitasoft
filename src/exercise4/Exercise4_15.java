package exercise4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exercise4_15 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("数字を入力してください。素数であるか判定します。");
		int number = Integer.parseInt(br.readLine());
		int i = number;
		int excess = 0;
		String s = "素数です";
		
		while(i >= 1) { 
			excess = number % i;
			
			if(number == i || i == 1) {
				
			} else if(excess == 0) {
				s = "素数ではありません。";
				break;
			} else {
				
			}
			i--;
		}
		
		System.out.println(s);
	}

}
