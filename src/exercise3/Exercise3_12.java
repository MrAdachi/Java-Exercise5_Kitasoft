package exercise3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise3_12 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
		
		System.out.println("1：まぐろ　2：えび　3：サーモン　4：たい　5：ハマチ　6：いくら");
		int s = Integer.parseInt(br.readLine());
		
		switch(s) {
			case 1:
				System.out.println("マグロ！大当たり！");
				break;
			case 2:
				System.out.println("えび！中当たり！");
				break;
			case 3:
				System.out.println("サーモン！中当たり！");
				break;
			case 4:
				System.out.println("たい！小当たり！");
				break;
			case 5:
				System.out.println("ハマチ！小当たり！");
				break;
			case 6:
				System.out.println("いくら！小当たり！");
				break;
			default:
				System.out.println("残念！はずれ・・・");
		}
		
		
	}
}
