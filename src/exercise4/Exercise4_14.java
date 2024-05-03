package exercise4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exercise4_14 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int strike = 0;
		int ball = 0;
		
		while(strike < 3 && ball < 4) {
			System.out.println("ストライク=1 or ボール=2 or ファール=3 ？");
			int judge = Integer.parseInt(br.readLine());
			
			if(judge == 1 || (judge == 3 && strike < 2)) {
				strike++;
			} else if (judge == 2) {
				ball++;
			}
		}
		
		System.out.println(ball + "ボール," + strike + "ストライク");
	}
}
