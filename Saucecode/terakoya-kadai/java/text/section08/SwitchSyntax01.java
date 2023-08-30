package text.section08;

public class SwitchSyntax01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
//		０～９のいずれかをランダムに生成
		int randNum = (int)(Math.random() * 10);
		
//		乱数randNumの値を出力
		System.out.println(randNum);
		
//		当たりはずれの判定
		switch(randNum)	{
		case 9 -> System.out.println("大当たりです");
		case 8 -> System.out.println("当たりです");
		default -> System.out.println("はずれです");
		}

	}

}


