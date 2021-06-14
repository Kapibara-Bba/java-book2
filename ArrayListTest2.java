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

    for (int i = 0; i < list.size(); i++) {
      lists.add(list.get(i));
    }
    System.out.println(lists);
  }
}
