package exercise6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//class Pow {
//
//}

public class Exercise6_1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("2乗する値を入力してください。 ");
		int x = Integer.parseInt(br.readLine());
		
		Exercise6_1 pow = new Exercise6_1();
		
		int ans = pow.pow_met(x);
		
		System.out.println(x + "の2乗は " + ans + "です。");
	}

	int pow_met(int n) {
		int ans = n * n;
		return ans;
	}

}
