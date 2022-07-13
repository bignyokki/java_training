public class Training2_1_keisan {
  public static void main(String[] args) {


    // エスケープシーケンス
    // \記号を用いて表現
      System.out.println("-----エスケープシーケンスを用いた表現-----");
      System.out.println("二重引用符(\")");
      System.out.println("引用符(\')");
      System.out.println("バックスラッシュ(\\)");



    // 型変換
    // byte < short < int < long < float < double
    // 値より大きな方への変換はOK
    // 小さい方への変換はNG。例外はintはbyte, shortに変換できる
      System.out.println("-----型変換-----");
      float f = 3; // float型の変数にint型を代入
      double d = f; // double型の変数にfloat型を代入
      System.out.println(f);
      System.out.println(d);

    // 強制的な型変換
    // キャスト演算子
    // (変換先の型名) 式
      int age = (int) 3.2;
      System.out.println(age);

    // 演算時の自動型変換
    // より大きな型に変換されたから演算される
      double dd = 8.5 / 2; // 2(int)を2.0(double)に変換
      long l = 5 + 2L; // 5(int)を5L(long)に変換
      System.out.println(dd);
      System.out.println(l);

    // 文字列を含む演算時の型変換
    // 片方のオペランドがStringなら他方もStringに変換して連結する
      String msg = "私の年齢は" + 23; // 23(int)を"23"(String)に変換
      System.out.println(msg);



    // 命令実行の文
    System.out.println("-----命令実行の文-----");

      // 画面に文字を表示する
      System.out.println("画面に文字を表示します。");

      // 改行せずに画面に文字を表示
      String name = "たなか";
      System.out.print("私の名前は");
      System.out.print(name);
      System.out.println("です。");

      // 大きい方の数値を代入する命令
      int a = 5;
      int b = 3;
      int m = Math.max(a, b);
      System.out.println("比較実験:" + a + "と" + b + "とで大き方は" + m);

      // 文字列を数値に変換する命令
      String age2 = "31";
      int n = Integer.parseInt(age2);
      System.out.println("あなたは来年" + (n + 1) + "歳になります");

      // 乱数を生み出して代入する命令
      int r = new java.util.Random().nextInt(90);
      System.out.println("あなたは多分" + r + "歳です");

      // キーボードから入力を受け取る命令
      System.out.println("名前を入力してください");
      String name2 = new java.util.Scanner(System.in).nextLine(); // 文字列の入力
      System.out.println("年齢を入力してください");
      int age3 = new java.util.Scanner(System.in).nextInt(); // 整数の入力
      System.out.println("ようこそ、" + age3 + "歳の" + name2 + "さん");



  }
  
}
