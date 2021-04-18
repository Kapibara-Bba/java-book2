import java.util.*;

public class Babanuki {
  public static void main(String[] args) {
	  System.out.println("ゲームを始めます");
	  String[][] trump_card = {
			  { "🖤A", "🖤2", "🖤3", "🖤4", "🖤5", "🖤6", "🖤7", "🖤8", "🖤9", "🖤10", "🖤J", "🖤Q", "🖤K" },
			  { "🔷A", "🔷2", "🔷3", "🔷4", "🔷5", "🔷6", "🔷7", "🔷8", "🔷9", "🔷10", "🔷J", "🔷Q", "🔷K" },
			  { "♣️A", "♣️2", "♣️3", "♣️4", "♣️5", "♣️6", "♣️7", "♣️8", "♣️️9", "♣️10", "♣️J", "♣️Q", "♣️K" },
			  { "♠️A", "♠️2", "♠️3", "♠️4", "♠️5", "♠️6", "♠️7", "♠️8", "♠️9", "♠️10", "♠️J", "♠️Q", "♠️K" },
	  };
	  
	  String[] card = new String[52];
	  
	  int k = 0;
	  for (String[] i : trump_card) {
		  for (String j : i) {
			  card[k] = j;
			  k++;
		  }
	  }
	  
	  String[] player = new String[27];
	  String[] Com = new String[27];
	  int a = 2;
	  int b = 0;
	  int x = 0;
	  while (true) {
		  int randomInt = (int)(Math.random() * 52);
		  if (card[randomInt] == null) {
			  continue;
		  } else if (a % 2 == 0) {
			  player[b] = card[randomInt];
			  System.out.print(player[b]);
			  
			  card[randomInt] = null;
			  a++;
			  b++;
		  } else if (a % 2 == 1) {
			  Com[x] = card[randomInt];
			  card[randomInt] = null;
			  a++;
			  x++;
		  }
		  if (a == 54) {
			  break;
		  }
	  }
	  System.out.println();
	  
	  List<String> play = Arrays.asList(player);
	  List<String> playerCard = new ArrayList<>(play);
	  List<String> comp = Arrays.asList(Com);
	  List<String> comCard = new ArrayList<>(comp);
	  
	  int y = 0;
	  int z = 1;
	  String q = "0";
	  String r = "0";
	  String c = "0";
	  String d = "0";
	  
	  for (Iterator<String> it = playerCard.iterator(); it.hasNext(); ) {
		  r = playerCard.get(y);
		  if (r == null) {
			  break;
		  }
		  c = r.substring(r.length() - 1);
		  for (Iterator<String> it2 = playerCard.iterator(); it2.hasNext(); ) {
			  if (y == z) {
				  z++;
			  }
			  q = playerCard.get(z);
			  if (q == null) {
				  break;
			  } else {
				  d = q.substring(q.length() - 1);
			  }
			  
			  if (c.equals(d)) {
				  break;
			  }
			  z++;
		  }
		  if (c.equals(d)) {
			  List<String> remove = new ArrayList<>();
			  Collections.addAll(remove, playerCard.get(y), playerCard.get(z));
			  playerCard.removeAll(remove);
			  //playerCard.remove(y);
			  //playerCard.remove(z); 
			  z = 1;
		  } else {
			  System.out.print(playerCard.get(y));
			  y++;
			  z = 1;
		  }
	  }
	  
  }
}
