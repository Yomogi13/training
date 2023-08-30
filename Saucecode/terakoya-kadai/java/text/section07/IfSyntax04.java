package text.section07;

public class IfSyntax04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
//		０～４のいずれかをランダムに生成
		int randNum = (int)(Math.random() * 5);
		
//		乱数randNumの値を出力
		System.out.println(randNum);
		
//		randNumが１より大きいかつ３より小さい
		if( (1 < randNum) && (randNum < 3 ) ) {
			System.out.println("randNumは１より大きい、かつ３より小さい値です");
			
		} else {
			System.out.println("and条件が成り立ちません");
		}

//		randNumが１に等しいまたは３に等しい
		if((randNum == 1 ) || (randNum == 3)) {
			System.out.println("randNumは１、または３です");
		} else {
			System.out.println("or条件が成り立ちません");
		}
	}

}
