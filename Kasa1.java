import java.io.*;

public class Kasa1 {
  public static void main(String[] args) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try {
      System.out.println("降水確率を入力してください。");
      String line = reader.readLine();
      int n = Integer.parseInt(line);
      System.out.println("降水確率は" + n + "です");
      if (n >= 50) {
        System.out.println("傘は必須です。");
      } else {
        System.out.println("傘は不要です。");
      }
      System.out.println("いってらっしゃい。");
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}
