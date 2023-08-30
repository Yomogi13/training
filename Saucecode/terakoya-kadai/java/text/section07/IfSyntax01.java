package text.section07;

public class IfSyntax01 {
	
		public static void main(String[] args) {
			
//		０～９のいずれかをランダムに生成（乱数を１０倍して小数部分を切り捨て
			int randNum = (int)(Math.random() * 10);
			
//			乱数randNumの値を出力
			System.out.println(randNum);
			
//			当たりはずれの判定
			if( randNum == 9 ) {
				System.out.println("大当たりです");
			}
		}

	}

