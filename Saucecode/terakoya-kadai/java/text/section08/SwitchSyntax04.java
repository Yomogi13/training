package text.section08;

public class SwitchSyntax04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int ranking = 1; //順位
		String award = ""; //商品名
		
		//順位に応じた商品名を取得
		award = switch(ranking) {
		case 1 -> "金メダル";
		case 2 -> "銀メダル";
		case 3 -> "銅メダル";
		default -> "参加証";
		
		};
		
		//賞品名を表示
		System.out.println(award);

	}

}
