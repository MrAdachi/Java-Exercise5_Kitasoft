package exercise3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise3_13 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
		
		System.out.print("月: ");
		int m = Integer.parseInt(br.readLine());
		
		switch(m) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(m + "月の日数は、31日です。");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(m + "月の日数は、30日です。");
				break;
			case 2:
				System.out.println(m + "月の日数は、28日です。");
				break;
			default:
				System.out.println("入力が間違っています");
		}
		
	}

}
