package text.section10;

public class WhileSyntax03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int dice = 1;
		int sum = 0;
		
//		出た目の合計が１０に達するまでサイコロを振る
		while( sum < 10 ) {
			
//			サイコロを振る（１～６をランダム）
			dice = (int)( Math.ceil( Math.random() * 6 ));
			System.out.println("サイコロの目は" + dice);
			
//			出た目が４の場合は加算せず次のループへ
			if( dice == 4) {
				System.out.println("4は加算しません");
				continue;
				
			}
			
//			出た目を変数sumに加算
			sum += dice;
			System.out.println(dice + "を加算:現在の合計は" + sum);
		}

		System.out.println("最終合計は" + sum);
	}

}
