package exercise3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise3_7 {

	public static void main(String[] args) throws IOException {
		
		String comment1 = ""; String comment2 = ""; String comment3 = "";
		
		BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
		
		System.out.print("試験点数: ");
		int score = Integer.parseInt(br.readLine());
		
		// ケース1
		if(score >= 60) {
			comment1 = "合格";
		} else {
			comment1 = "不合格";
		}
		
		// ケース2
		if(score >= 80) {
			comment2 = "たいへんよくできました。";
		} else if (score >= 60) {
			comment2 = "よくできました。";
		} else {
			comment2 = "ざんねんでした。";
		}
		
		// ケース3
		if(score >= 80) {
			comment3 = "優";
		} else if (score >= 70) {
			comment3 = "良";
		} else if (score >= 60) {
			comment3 = "可";
		} else {
			comment3 = "不可";
		}
		
		System.out.println("ケース1: " + comment1);
		System.out.println("ケース2: " + comment2);
		System.out.println("ケース3: " + comment3);
	}
}
