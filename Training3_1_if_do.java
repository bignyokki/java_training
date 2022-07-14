public class Training3_1_if_do {
  public static void main(String[] args) {

    // 条件式の注意点
    // 文字列を比較するとき
      String str = "夕日";
      if (str.equals("夕日")) {
        // str == "夕日" ではNG
        System.out.println("文字列を比較");
      }
    

    // ifとswitch
      // if文での記述
      System.out.println("あなたの運勢を占います(if)");
      int fortune = new java.util.Random().nextInt(4) + 1;
      if (fortune == 1) {
        System.out.println("大吉");
      } else if (fortune == 2) {
        System.out.println("中吉");
      } else if (fortune == 3) {
        System.out.println("吉");
      } else {
        System.out.println("凶");
      }

      // switch文に書き換え
      // 全ての条件が左辺と右辺の一致するかの条件式(==)のみで利用可。> < != 等では不可
      // 比較する値は整数のみ。小数や真偽値不可
      System.out.println("あなたの運勢を占います(switch)");
      int fortune2 = new java.util.Random().nextInt(4) + 1;
      switch (fortune2) { // switchの後ろに書くのは条件式ではなく対象の変数名
        case 1: // {}ではなくセミコロン(:)で記述
          System.out.println("大吉");
          break; // breakを記述しないとその下の記述も続けて実行されてしまう。
        case 2:
          System.out.println("中吉");
          break;
        case 3:
          System.out.println("吉");
          break;
        default:
          System.out.println("凶");
        }


      
  }
  
}
