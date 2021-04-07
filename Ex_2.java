import java.io.*;

public class Ex_2 {
  public static void main(String[] args) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try {
      String line;
      while ((line = reader.readLine()) != null) {
        int n = line.indexOf("abc");
        if (n >= 0) {
          System.out.println(line);
        }
      }
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}
