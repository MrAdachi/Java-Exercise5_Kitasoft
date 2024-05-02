package exercise3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise3_9 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
		
		String opening;
		
		System.out.println("0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜");
		int d = Integer.parseInt(br.readLine());
		
		System.out.println("0=午前、1=午後、2=夜間");
		int t = Integer.parseInt(br.readLine());
		
		if(d == 0) {
			opening = "休診";
		} else if ((d == 2 || d == 5) && t == 0) {
			opening = "休診";
		} else if (d == 3 && t == 2) {
			opening = "休診";
		} else if (d == 6 && !(t == 0)) {
			opening = "休診";
		} else {
			opening = "開院";
		}
		
		System.out.println(opening);
	}

}
