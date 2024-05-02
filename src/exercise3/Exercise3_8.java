package exercise3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise3_8 {

	public static void main(String[] args) throws IOException {
		String result = "";
		
		BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
		
		System.out.print("中間試験の点数: ");
		int middle_score = Integer.parseInt(br.readLine());
		
		System.out.print("期末試験の点数: ");
		int end_score = Integer.parseInt(br.readLine());
		
		if (middle_score >= 60 && end_score >= 60) {
			result = "合格";
		} else if (middle_score + end_score >= 130) {
			result = "合格";
		} else if ((middle_score + end_score >= 100) && (middle_score >= 90 || end_score >= 90)) {
			result = "合格";
		} else {
			result = "不合格";
		}
		
		System.out.println(result);
	}

}
