package text.section09;

public class ForSyntax03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
//		変数i = 1～10の範囲で繰り返す
		for(int i = 1; i < 11; i++ ) {
			
//			ループカウンタが３のときに繰り返し処理をスキップ
			if( i == 3) {
				System.out.println("次の繰り返し処理に進みます");
				continue;
			}
			
			System.out.println(i);
		}

	}

}
