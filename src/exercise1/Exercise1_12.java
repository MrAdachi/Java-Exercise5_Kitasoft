package exercise1;

public class Exercise1_12 {
	public static void main(String[] args) {
		int x = 1;
		System.out.println(x++); // 後置インクリメント → 代入後に1加算なので、代入値（出力値）は元のまま。
		System.out.println(++x); // 前置インクリメント → 1加算後に代入なので、代入値（出力値）は加算後の値。
		System.out.println(x--); // 後置デクリメント 　→ 代入後に1減算なので、代入値（出力値）は元のまま。
		System.out.println(--x); // 前置デクリメント　 → 1減算後に代入なので、代入値（出力値）は減算後の値。
	}
}
