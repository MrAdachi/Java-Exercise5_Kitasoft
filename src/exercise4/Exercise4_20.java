package exercise4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise4_20 {

	public static void main(String[] args) throws IOException {
		int i;
		String dollar;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("サイズを入力してください。");
		
		int size = Integer.parseInt(br.readLine());
		
		for(i = 1, dollar = "$"; i <= size; i++) {
			System.out.println(dollar);
			dollar += "$";
		}
	}
}
