package exercise4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise4_19 {

	public static void main(String[] args) throws IOException {
		int sumval = 0;
		int i = 1;
		int x = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(; ;) {
			
			if(i == 1) {
				int j = 1;
				
				do {
					if(j == 1) {
						System.out.print("0以外の数値を入力してください。(1回目)：");
					} else {
						System.out.print("0が入力されました。再入力してください。(1回目)：");
					}
					
					x = Integer.parseInt(br.readLine());

					j ++;
					
				} while(x == 0);
				
			} else {
				System.out.print("数値を入力してください。(" + i + "回目)：");
				x = Integer.parseInt(br.readLine());
			}
			
			if(x == 0) {
				break;
			}
			
			sumval += x;
			i++;
		}
		
		System.out.println("入力値の平均値は、" + (sumval / (i - 1)) + "です。");
		
	}
}
