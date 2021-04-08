public class Foo {
  public static void main(String[] args) {
    System.out.println(number(-9));
  }
  public static int number(int x) {
    if (x > 0) {
      return x;
    } else {
      return -x;
    }
  }
}
