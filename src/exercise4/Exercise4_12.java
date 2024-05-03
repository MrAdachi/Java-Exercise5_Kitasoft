package exercise4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exercise4_12 {

	public static void main(String[] args) throws Exception {
		int sumval = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			
			if(sumval >= 100) {
				System.out.println("入力値の合計が100を超えて、" + sumval + "になりましたので、入力を停止します。");
				break;
			}
			
			System.out.print("数値を入力してください。");
			int x = Integer.parseInt(br.readLine());
			
			sumval += x;
		}
		
		System.out.println("-------------------------------------------------------------------------------");
		
		int sumval2;
		int x2;
		for(sumval2 = 0; sumval2 <= 100; sumval2 += x2) {
			System.out.print("数値を入力してください。");
			x2 = Integer.parseInt(br.readLine());
		}
		
		System.out.println("入力値の合計が100を超えて、" + sumval2 + "になりましたので、入力を停止します。");
	}
}
