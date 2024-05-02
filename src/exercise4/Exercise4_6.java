package exercise4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise4_6 {
	public static void main(String[] args) throws IOException{
		int win_num = 0;
		int lose_num = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
		
		for(int i = 0; i < 10; i++) {
			System.out.print("整数0か1を入力してください。" + (i + 1) + "回目: ");
			int x = Integer.parseInt(br.readLine());
			
			if(x == 0) {
				win_num ++;
			} else {
				lose_num ++;
			}
		}
		System.out.println("勝ちの総数: " + win_num + "回、負けの総数: " + lose_num + "回です。");
	}
}
