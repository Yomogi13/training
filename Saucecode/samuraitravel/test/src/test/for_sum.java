package test;

public class for_sum {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 10; i++) {
			sum += i;
		}
		System.out.println("1から10までの整数合計は" + sum);
	}

}

/* 問題:
ユーザーから整数を入力し、その整数が偶数か奇数かを判定し
結果を表示するJavaプログラムを書いてください。

条件:

ユーザーから整数を受け取るためにScannerを使用してください。
入力された整数が偶数の場合、"入力された整数は偶数です"と表示してください。
入力された整数が奇数の場合、"入力された整数は奇数です"と表示してください。

*/