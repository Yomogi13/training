package text.section11;

public class Array02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] scoreArray = { 70, 85, 80, 95, 90 }; // 点数

        // scoreArray[0]～[4]の値を順番に表示
        for( int i = 0; i < scoreArray.length ; i++ ) {
            System.out.println( (i + 1) + "番目は" + scoreArray[i] );
        }

        System.out.println("要素数は" + scoreArray.length);
    }
}