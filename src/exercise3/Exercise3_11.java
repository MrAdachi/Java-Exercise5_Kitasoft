package exercise3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise3_11 {
	public static void main(String[] args) throws IOException {
		String holiday = "";
		
		BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
		
		System.out.print("月: ");
		int m = Integer.parseInt(br.readLine());
		
		switch(m) {
			case 1:
				holiday = "１月：元日、成人の日";
				break;
			case 2:
				holiday = "２月：建国記念の日";
				break;
			case 3:
				holiday = "３月：春分の日";
				break;
			case 4:
				holiday = "４月：昭和の日";
				break;
			case 5:
				holiday = "５月：憲法記念日、みどりの日、こどもの日";
				break;
			case 7:
				holiday = "７月：海の日";
				break;
			case 9:
				holiday = "９月：敬老の日、秋分の日";
				break;
			case 10:
				holiday = "１０月：体育の日";
				break;
			case 11:
				holiday = "１１月：文化の日、勤労感謝の日";
				break;
			case 12:
				holiday = "１２月：天皇誕生日";
				break;
		}
		
		System.out.println(holiday);
	}
}
