import java.io.*;

public class Heikin {
  public static void main(String[] args) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try {
      System.out.println("1人目の名前を入力してください。 ");
      String line = reader.readLine();
      String name1 = line;

      System.out.println("1人目の年齢を入力してください。");
      line = reader.readLine();
      int age1 = Integer.parseInt(line);

      System.out.println("2人目の名前を入力してください。");
      line = reader.readLine();
      String name2 = line;

      System.out.println("2人目の年齢を入力してください。");
      line = reader.readLine();
      int age2 = Integer.parseInt(line);

      System.out.print(name1 + "さんは、年齢が" + age1 + "で、");
      System.out.println(name2 + "さんは、年齢が" + age2 + "です。");
      System.out.println("2人の平均年齢は" + ((age1 + age2) / 2) + "です。");
    } catch (IOException e) {
      System.out.println(e);
    } catch (NumberFormatException e) {
      System.out.println("数値が正しくありません。");
    }
  }
}
