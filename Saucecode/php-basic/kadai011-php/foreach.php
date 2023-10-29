<!DOCTYPE html>
<html lang="ja">

<head>
    <meta charset="utf-8">
    <title>kadai005</title>
</head>

<body>
    <p>
        <?php

        //値とキーの出力
        $array = ["名前:" => "玉ねぎ", "値段:" => "200", "産地:" => "北海道"];
        
        //キーと値を１ずつ順番に出力
        foreach ($array as $key => $value) {
            echo $key . $value . "<br>";
        }
        ?>
    </p>
</body>
</html>






<!--
課題の内容
foreach文を使って連想配列の値とキーを出力してみましょう。作業手順は後述の各Stepを参考にしてください。

出力結果の参考イメージ

名前:玉ねぎ
値段:200
産地:北海道

連想配列を作成する
以下のキーと値を持つ連想配列を作成し、変数に代入します。

キー: 名前、値: 玉ねぎ
キー: 値段、値: 200
キー: 産地、値: 北海道

値を出力する
foreach文とecho文を使いブラウザに要素それぞれのキーと値を出力します。

以下のように連想配列のキーと値をコロン（:）で区切り、要素ごとに改行した形で画面に出力してください。

id:1
名前:侍太郎
年齢:30

合格基準
1	連想配列の作成ができている
2	foreach文の使用して連想配列の出力ができている

 -->