public class Aisatu {
  public static void main(String[] args) {
    String[] message = {
      "おはよう！",
      "こんにちは！",
      "こんばんは"
    };
    int num = Integer.parseInt(args[0]);
    if (0 <= num && num < message.length) {
      System.out.println(message[num]);
    } else {
      System.out.println("番号は０〜" + 2 + "の範囲で指定してください。");
    }
  }
}
