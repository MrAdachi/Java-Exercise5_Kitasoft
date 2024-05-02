package exercise2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise2_6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("現在の年齢は？");
		int age = Integer.parseInt(br.readLine());
		
		int day = age * 365;
		System.out.println("生まれてから現在までの日数 : " + day + "日です。");
	}
}
