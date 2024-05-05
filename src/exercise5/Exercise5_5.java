package exercise5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise5_5 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
		
		System.out.print("値を入力してください。");
		int value = Integer.parseInt( br.readLine() );
		
		int binary[] = new int[16];
		
		//配列 binaryに0か1を代入する
		for( int i = 15 ; i >= 0; i-- ) {
			
			binary[i] = value % 2;
			
			value /= 2;
			
			if(value == 0) {
				break;
			}
			
		}
		
		for( int i = 0 ; i < 16 ; i++ ) {
			System.out.print( binary[i] );
		}
	}
}
