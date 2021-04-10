public class PrintArray {
  public static void main(String[] args) {
    int[][] arr = {
      { 3, 1 , 4, 1 },
      { 5, 9, 2 },
      { 6, 5 },
      { 3,},
    };
    printArray(arr);
  }

  public static void printArray(int[][] a) {
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println("");
    }
  }
}
