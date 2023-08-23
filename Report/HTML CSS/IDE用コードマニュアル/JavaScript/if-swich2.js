// 変数numに0~4までのランダムな整数を代入する
let num = Math.floor(Math.random() * 5);

// 変数numの値を出力する（確認用）
console.log(num);

// 変数numの値が４であれば大当たりですという文字列を出力
if (num === 4) {
    console.log("大当たり");
}

//変数numの値が3であれば「あたり」と出力
else if (num === 3) {
    console.log("あたり");
}

// それ以外のときは「はずれ」と出力
else {
    console.log("はずれ");
}

