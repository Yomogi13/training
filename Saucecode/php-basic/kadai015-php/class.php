<!DOCTYPE html>
<html lang="ja">

<head>
    <meta charset="utf-8">
    <title>kadai015</title>
</head>

<body>
    <p>
        <?php
        class Food {
            private $name;
            private $price;

             public function __construct($name, $price) {
                $this->name = $name;
                $this->price = $price;
             }
             public function show_price() {
                return $this->price;
             }
        }

        class Animal {
            private $name;
            private $height;
            private $weight;

            public function __construct($name, $height, $weight) {
                $this->name = $name;
                $this->height = $height;
                $this->weight = $weight;
            }
            public function show_height() {
                return $this->height;
            }
        }


        //インスタンス化
        $food_instance = new Food("potato", 250);
        $animal_instance = new Animal("dog",60,5000);

        //出力
        echo "Food Object:";
        print_r($food_instance);
        echo "Animal Object:";
        print_r($animal_instance);

        echo "<br>";
        echo $food_instance->show_price();
        echo "<br>";
        echo $animal_instance->show_height();
        ?>
    </p>
</bpdy>
</html>

<!--
課題の内容
クラスを2つ作ってそれぞれ呼び出してみましょう。作業手順は後述の各Stepを参考にしてください。

出力結果の参考イメージ

Food Object( [name:Food:private] => potato[price:Food:pruvate] => 250)
Animal Object( [name:Animeal:private] => dog[height:Animal:private] => 60[weight:Animal:private] => 5000)
250
60

 クラスを作成する
 「Food」と「Animal」クラスを作成します。
「Food」クラスには「name」「price」プロパティを
「Animal」クラスには「name」「height」「weight」プロパティを定義します。
「Food」クラスには「price」プロパティの値を出力する「show_price」メソッドを、「Animal」クラスには「height」 プロパティの値を出力する「show_height」メソッドをそれぞれ作成します。
 プロパティに値を代入するコンストラクタをそれぞれのクラスに作成します。

 インスタンスを作成し、出力する
それぞれのクラスを元に任意の引数を渡してインスタンスを作成します。
print_r関数を使いそれぞれのインスタンスを出力します。

メソッドへアクセスする
それぞれのクラスに作成したメソッドにアクセスしメソッドを実行します。

合格基準
1	クラスの作成ができている
2	インスタンスの作成と出力ができている
3	メソッドへのアクセスができている


 -->