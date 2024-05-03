package exercise4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise4_7 {

	public static void main(String[] args) throws IOException {
		int g_sum = 0;
		int h_sum = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
		
		for(int i = 1; i <= 9; i++) {
			System.out.print(i + "回表、巨人の得点は？　");
			int x1 = Integer.parseInt(br.readLine());
			g_sum += x1;
			
			System.out.print(i + "回裏、阪神の得点は？　");
			int x2 = Integer.parseInt(br.readLine());
			h_sum += x2;
		}
		
		System.out.println("巨人: " + g_sum + "点、阪神: " + h_sum + "点");
		
		if(g_sum > h_sum) {
			System.out.println("巨人の勝ち");
		} else if (g_sum < h_sum) {
			System.out.println("阪神の勝ち");
		} else {
			System.out.println("引き分け");
		}
	}

}
