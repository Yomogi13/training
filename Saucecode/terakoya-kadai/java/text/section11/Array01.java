package text.section11;

public class Array01 {
	public static void main(String[] args) {

		
		String[] nameArray = new String[5];          // 氏名
        int[]   scoreArray = { 70, 85, 80, 95, 90 }; // 点数

        // 氏名を代入
        nameArray[0] = "侍太郎";
        nameArray[1] = "侍一郎";
        nameArray[2] = "侍二郎";
        nameArray[3] = "侍三郎";
        nameArray[4] = "侍四郎";

        // 氏名を出力
        System.out.println(nameArray[0]);
        System.out.println(nameArray[1]);
        System.out.println(nameArray[2]);
        System.out.println(nameArray[3]);
        System.out.println(nameArray[4]);

        // 点数を出力
        System.out.println(scoreArray[0]);
        System.out.println(scoreArray[1]);
        System.out.println(scoreArray[2]);
        System.out.println(scoreArray[3]);
        System.out.println(scoreArray[4]);
    }
}
