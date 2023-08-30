package terakoya_kadai.kadai008;

public class Price_Chapter08 {

    public static void main(String[] args) {

        int userAge = 30; // 年代
        int serviceCost = 0; // 年代ごと料金

        // 年代に応じた料金を取得
        serviceCost = switch(userAge) {
            case 10  -> 1000;
            case 20  -> 2000;
            case 30  -> 3000;
            case 40  -> 3000;
            case 50  -> 4000;
            case 60  -> 4000;
            case 70  -> 4000;
            case 80  -> 5000;
            default -> 500;
        };

        // 対応する年代と料金を表示
        System.out.println(userAge + "代は" + serviceCost + "円");
        
    }
}