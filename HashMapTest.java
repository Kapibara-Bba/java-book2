import java.util.*;

public class HashMapTest {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<String, Integer>();

    map.put("Alice", 100);
    map.put("Bob", 57);
    map.put("Chris", 85);
    map.put("Diana", 85);
    map.put("Elmo", 92);

    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " => " + entry.getValue());
    }
    System.out.println();

    for (String name : map.keySet()) {
      System.out.println(name);
    }
    System.out.println();

    for (int value : map.values()) {
      System.out.println(value);
    }


  }
}
