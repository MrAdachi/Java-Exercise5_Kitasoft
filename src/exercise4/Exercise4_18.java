package exercise4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise4_18 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sumval = 0;
		int x = 0;
		do {
			System.out.print("数値を入力してください。 ");
			x = Integer.parseInt(br.readLine());
			sumval += x;
		} while(x != 0);
		System.out.println("入力値の合計は、" + sumval + "です。");
	}
}
