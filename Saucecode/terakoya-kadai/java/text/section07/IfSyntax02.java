package text.section07;

public class IfSyntax02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
//		０～９のいずれかをランダムに生成
		int randNum = (int)(Math.random() * 10);
		
//		乱数randNumの値を出力
		System.out.println(randNum);
		
//		当たりはずれの判定
		if( randNum == 9 ) {
			System.out.println("大当たりです");
			
		} else {
			System.out.println("はずれです");
		}

	}

}
