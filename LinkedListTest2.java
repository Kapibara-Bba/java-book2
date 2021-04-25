import java.util.*;

public class LinkedListTest2 {
  public static void main(String[] args) {
    Queue<String> Queue = new LinkedList<String>();

    Queue.offer("Alice");
    System.out.println(Queue);

    Queue.offer("Bob");
    System.out.println(Queue);

    Queue.offer("Chris");
    System.out.println(Queue);

    Queue.offer("Diana");
    System.out.println(Queue);

    while (Queue.peek() != null) {
      String name = Queue.poll();
      System.out.println(name);
      System.out.println(Queue);
    }
  }
}
