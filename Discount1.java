public class Discount1 {
  public static void main(String[] args) {
    int a = 1200;
    int b = halve(a);

    System.out.println(b);
  }
  public static int halve(int x) {
    return x / 2;
  }
}
