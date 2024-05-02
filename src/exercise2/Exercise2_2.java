package exercise2;

// java.ioパッケージ → io(Input, Output@入出力)に関係したパッケージが纏められている。
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise2_2 {
	public static void main(String[] args) throws IOException{ // 例外処理（重複発生の可能性あり）
		
		/* InputStreamReader isr = new InputStreamReader(System.in);
		 * System.in → Systemクラスのメンバ変数in。入力される生のバイト列
		 * InputStreamReader → 文字コードの変換をするクラス
		 * この時点におけるisr ※下記コードの "new InputStreamReader(System.in)" はバイト列
		 * 
		 * BufferedReader br = new BufferdReader(new InputStreamReader(System.in));
		 * BufferedReaderクラスのオブジェクトに繋ぐ必要がある。
		 * このオブジェクトはバッファ機能を持っているので、１行単位に読み込み可能。
		 */
		System.out.println("xの値は？");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/* BufferedReaderクラスのreadLineメソッド
		 * 指定したテキストファイルを1行ずつ読み込み、String型の戻り値として返す。
		 */
		int x = Integer.parseInt(br.readLine());
		
		System.out.println("入力値は、" + x + "です。");
	}
}
