package exercise6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise6_2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("整数1: ");
		int x1 = Integer.parseInt(br.readLine());
		
		System.out.print("整数2: ");
		int x2 = Integer.parseInt(br.readLine());
		
		Exercise6_2 ave = new Exercise6_2();
		
		int ans = ave.ave_method(x1, x2);
		
		System.out.print("2値の平均は " + ans + "です。");
	}
	
	public int ave_method(int n1, int n2) {
		return (n1 + n2) / 2;
	}

}
