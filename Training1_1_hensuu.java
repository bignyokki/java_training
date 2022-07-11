// 変数宣言について

// クラスブロック
public class Training1_1_hensuu {
  // メソッドブロック
  public static void main(String[] args) {

    // 変数の初期化
    // 型 変数名 = 代入するデータ;

    // 整数
      byte glasses = 2; // とても小さな整数。±128
      System.out.println("メガネの数" + glasses + "個");

      short age = 18; // 小さな整数。±約3.2万
      System.out.println("年齢は" + age + "歳");

      // 通常整数を宣言する場合はintでOK
      int salary = 152000; // 普通の整数。±約21億
      System.out.println("給料は" + salary + "円");

      long worldPeople = 6900000000L; // 大きな整数。±900京
      System.out.println("世界の人口は" + worldPeople + "人");

    // 小数。 真に厳密な計算ができないので金額の計算などには使用不可
      float weight = 67.5F; // 少し曖昧でもいい小数
      System.out.println("体重は" + weight + "kg");

      // 通常小数を宣言する場合はdoubleでOK
      double height = 171.2; // 通常の小数
      System.out.println("身長は" + height + "cm");

    // 真偽値
      boolean result = false; // true or false
      System.out.println("結果は" + result + "です");
    
    // 文字。１文字のみ
      char initial = 'A'; // 全角・半角問わず１文字だけ。(")不可。(')のみ
      System.out.println("イニシャルは" + initial);

    //文字列
      String name = "田中"; // Stringの頭文字は大文字注意。(')不可。(")のみ
      System.out.println("名前は" + name + "です");



    // 変数の再代入
      System.out.println("-----変数の再代入-----");
      salary = 130000;
      System.out.println("本当の給料は" + salary + "円です");



    // 定数の宣言
    // final 型 定数名(全て大文字) = 初期値;
      System.out.println("-----定数の宣言-----");
      final double PI = 3.14;
      System.out.println("円周率は" + PI + "です。これは定数のため上書きできません");
  }
}