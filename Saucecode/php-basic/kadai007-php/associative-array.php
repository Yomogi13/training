<!DOCTYPE html>
<html lang="ja">

<head>
    <meta charset="utf-8">
    <title>kadai007</title>
</head>

<body>
    <p>
        <?php
        //連想配列を作成
        $array = ["name" => "onion", "price" => 200, "weight" => 160];
        //出力
        echo "Array(";
        echo "[name] => ";
        echo $array["name"];
        echo "[price] => ";
        echo $array["price"];
        echo "[weight] =>";
        echo $array["weight"];
        echo ")";
        ?>
    </p>
</body>
</html>









<!--  

課題の内容
連想配列の値とキーを出力してみましょう。作業手順は後述の各Stepを参考にしてください。

出力結果の参考イメージ
Array( [name] => onion[price] => 200[weight] => 160)

連想配列を作成する
以下のキーと値を持つ連想配列を作成し、変数に代入します。

キー: name、値: onion
キー: price、値: 200
キー: weight、値: 160

合格基準
1	連想配列の作成ができている
2	連想配列の出力ができている
 -->
