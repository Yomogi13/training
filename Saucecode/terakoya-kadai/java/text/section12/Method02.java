package text.section12;

public class Method02 {

	public static void main(String[] args) {
		
		int greeting = 123;
		
//		greeting呼び出し 1回目
		greeting();
		
//		greetingの変数を表示
		System.out.println(greeting);

//		greeting呼び出し２回目
		greeting();
		
	}
	
//	あいさつを表示するメソッド
	public static void greeting() {
		System.out.println("おはよう");
		System.out.println("おはよう");
		System.out.println("おはよう");
		System.out.println("おはよう");
		System.out.println("おはよう");
		System.out.println("おはよう");
	}

}
