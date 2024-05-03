package exercise4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise4_11 {
	public static void main(String[] args) throws IOException {
		String s = "";
		// int j = 0; ブロック（メソッド）内のみで使用するローカル変数の初期化は、ブロック（メソッド）内で行うべし。
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("表示する数字の個数を入力してください。　");
		int x = Integer.parseInt(br.readLine());
		
		for(int i = 0, j = 0; i < x; i++) {
			s += j;
			
			if(j == 9) {
				j = 0;
			} else {
				j++;
			}
		}
		System.out.println(s);
		
		System.out.println("-------------------------------------------------------------------------------");
		
		// 模範解答
		int count = Integer.parseInt(br.readLine());
		
		for(int i = 0, out = 0; i < count; i++) {
			System.out.print(out++);
			
			if(out > 9) {
				out = 0;
			}
		}
	}
}
