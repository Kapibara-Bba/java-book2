public class Tadasii {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      System.out.println("");
      for (int j = 0; j < 9; j++) {
      if (i == 1 && j == 4) {
        System.out.print("|");
      } else if (i == 1 && j != 4) {
        System.out.print(" ");
      } else if (i == 2 && (j == 4 || j == 5 || j == 6)) {
        System.out.print("-");
      } else if (i == 2 && (j != 4 || j != 5 || j != 6)) {
        System.out.print(" ");
      } else if (i == 3 && (j == 1 || j == 4)) {
        System.out.print("|");
      } else if (i == 3 && (j != 1 || j != 4)) {
        System.out.print(" ");
      } else {
        System.out.print("-");
      }
      }
    }
  }
}
