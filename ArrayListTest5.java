import java.util.*;

public class ArrayListTest5 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();

    list.add(12);
    list.add(34);
    list.add(18);
    list.add(77);
    list.add(54);
    list.add(66);
    list.add(99);

    for (int n : list) {
      System.out.println(n);
    }
  }
}
