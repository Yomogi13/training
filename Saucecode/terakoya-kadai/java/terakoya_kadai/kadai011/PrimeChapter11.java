package terakoya_kadai.kadai011;

public class PrimeChapter11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
//		boolean型の配列を作成
		int n = 100;
		boolean[] isPrime = new boolean [n + 1];
		
//		trueで初期化
		for (int i = 2; i <= n; i++) {
			isPrime[i] = true;
			
		}
//		素数処理判定
		for(int number = 2; number <= n; number++) {
			if(isPrime[number]) {
				for(int multiple = number * 2; multiple <= n; multiple += number) {
					isPrime[multiple] = false;
				}
			}
		}

//		素数の表示
		for (int i = 2; i <= n; i++) {
			if(isPrime[i]) {
				System.out.println(i + "");
			}
		}
		
	}

}
