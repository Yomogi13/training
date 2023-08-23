// 条件分岐させるプログラム

// 変数numに0=15までのランダムな整数を代入
let num = Math.floor(Math.random() * 16);

// 変数numの値を出力、確認用
console.log(num);

//変数numが3と5倍数の場合「３と５の倍数」と出力
if (num === 15) {
    console.log("3と5の倍数");
}

//変数numが３の倍数の場合「３の倍数」と出力
else if (num === 3 || num === 6　||　num === 9 || num === 12) {
    console.log("3の倍数");
}

// 変数numが5倍数の場合「５の倍数」と出力
else if (num === 5 || num === 10) {
    console.log("5の倍数");
}

//それ以外の場合: 変数numを出力
else {
    console.log("num");
}