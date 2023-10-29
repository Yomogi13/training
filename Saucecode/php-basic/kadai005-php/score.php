<!DOCTYPE html>
<html lang="ja">

<head>
    <meta charset="utf-8">
    <title>kadai005</title>
</head>

<body>
    <p>
        <?php
        //変数
        $score_1 = 80;
        $score_2 = 60;
        $score_3 = 55;
        $score_4 = 40;
        $score_5 = 100;
        $score_6 = 25;
        $score_7 = 80;
        $score_8 = 95;
        $score_9 = 30;
        $score_10 = 60;

        //合計点
        echo "合計点は";
        echo $score_1 + $score_2 + $score_3 + $score_4 + $score_5 + $score_6 + $score_7 + $score_8 + $score_9 + $score_10;
        echo "<br>";
        //平均点
        echo "平均点は";
        echo ($score_1 + $score_2 + $score_3 + $score_4 + $score_5 + $score_6 + $score_7 + $score_8 + $score_9 + $score_10) / 10;
        ?>
    </p>
</body>
</html>






<!--  
課題説明

生徒のテストの平均点をブラウザに出力するプログラムを作成しましょう。作業手順は後述の各Stepを参考にしてください。

出力結果の参考イメージ

62.5


 変数を作成し、値を代入する


生徒10人分の点数を入れる変数score1〜score10を作成し、それぞれの変数に以下の点数を代入します。

80, 60, 55, 40, 100, 25, 80, 95, 30, 60


合計点と平均点を算出する
それぞれの変数を四則演算を使って、合計点と平均点を算出します。echo文を使いブラウザに平均点を出力します。


本課題の目標は、課題を通して以下の項目が身についているかどうか確認することです。

PHPファイルが作成できること
変数の作成、値の代入ができること
簡単な四則演算ができること
そのため、以下の項目がすべて満たされていれば合格です。

番号	合格基準
1	変数を使い四則演算で計算ができている 
 -->