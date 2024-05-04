package exercise4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise4_21 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("サイズを入力してください。");
		
		int size = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= size; i++) {
			for(int j = 1; j <= size; j++) {
				
		        if( i == j || ( size - i + 1 ) == j ) {
		            System.out.print( "X" );
		        } else {
		            System.out.print( " " );
		        }
			}
			System.out.println();
		}
	}
}
