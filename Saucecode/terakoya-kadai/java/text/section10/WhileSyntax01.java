package text.section10;

public class WhileSyntax01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int dice = 1; //サイコロの目
		
		//６が出るまでサイコロを振り続ける
		while( dice != 6 ) {
			//サイコロを振る（１～６の目をランダムで生成）
			dice = (int)( Math.ceil( Math.random() * 6 ) );
			System.out.println("サイコロの目は" + dice);
			
		}

	}

}
