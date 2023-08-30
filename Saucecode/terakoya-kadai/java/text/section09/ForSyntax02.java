package text.section09;

public class ForSyntax02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
//		変数i = 1 ～ 10の範囲で繰り返す
		for( int i = 1; i < 11; i++ ) {
			System.out.println(i);
//			ループカウンタが５のときに繰り返し処理を強制終了
			if(i == 5 ) {
				System.out.println("繰り返し処理を強制終了します。");
				break;
			}
		}

	}

}
