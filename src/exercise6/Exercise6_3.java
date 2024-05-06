package exercise6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise6_3 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("xの値は？ ");
		int x = Integer.parseInt(br.readLine());
		
		System.out.print("yの値は？ ");
		int y = Integer.parseInt(br.readLine());
		
		System.out.print("zの値は？ ");
		int z = Integer.parseInt(br.readLine());
		
		Exercise6_3 max_2 = new Exercise6_3();
		
		int ans1 = max_2.max_2num(max_2.max_2num(x, y), z);
		
		System.out.println("3値で大きい値は、" + ans1 + "です。");
		
	}
	
	public int max_2num(int num1, int num2) {
		
		if(num1 > num2) {
			return num1;
		} else {
			return num2;
		}
		
	}

}
