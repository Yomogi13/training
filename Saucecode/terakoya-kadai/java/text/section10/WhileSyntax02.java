package text.section10;

public class WhileSyntax02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int dice = 1;
		int cnt  = 0;
		
//		6が出るまでサイコロを振り続ける
		while( dice != 6) {
			
//			繰り返し回数が５回以上になったら強制終了
			if( 5 <= cnt ) {
				System.out.println("5回に達したため強制終了します");
				break;
			}
			
//			サイコロを振る（１～６の目をランダムで生成）
			dice = (int)( Math.ceil( Math.random() * 6 ) );
			System.out.println("サイコロの目は" + dice);
			
//			1回サイコロを振ったので、繰り返し回数を１プラス
			cnt++;
			
		}
	}

}
