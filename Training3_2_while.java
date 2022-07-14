public class Training3_2_while {
  public static void main(String[] args) {

    // 2種類のwhile分
      // while構文
      // 条件を評価してから実行される
      // 条件を満たさない場合一度も処理は実行されない
      int temp = 30;
      while (temp > 25) {
        temp --;
        System.out.println("温度を1度下げました");
        System.out.println("現在の温度は" + temp + "度です");
      }

      // do-while構文
      // 実行してから条件を評価する
      // 最低一度は処理が実行される
      int temp2 = 30;
      do {
        temp2 --;
        System.out.println("温度を1度下げました");
        System.out.println("現在の温度は" + temp2 + "度です");
      } while(temp2 > 25);


  }
  
}
