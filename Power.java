public class Power {
  public static void main(String[] args) {
    System.out.println(getPower(8, 2));
  }
  public static int getPower(int x, int n) {
    int y = 1;
    for (int i = 0; i < n; i++) {
      y = y * x;
    }
    return y;
  }
}
