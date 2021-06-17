import java.util.*;

public class ArrayListTest2 {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();

    list.add("Alice");
    list.add("Bob");
    list.add("Chris");

    list.add("Diana");
    list.add("Elmo");

    List<String> lists = new ArrayList<String>();
    List<String> lists2 = new ArrayList<String>();
    List<String> lists3 = new ArrayList<String>();

    for (int j = 0; j < 1; j++) {
      for (int i = 0; i < 3; i++) {
        lists.add(list.get(i));
        lists2.add(list.get(i + 3));
        lists3.add(list.get(i + 6));
      }
    }

    System.out.println(lists);
  }
}
