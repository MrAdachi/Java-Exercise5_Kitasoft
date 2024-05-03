package exercise4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise4_10 {
	public static void main(String[] args) throws IOException {
		String s = "";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("*を表示する個数を入力してください。　");
		int x = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < x; i++) {
			s += "*";
		}
		
		System.out.println(s);
		
	}
}
