import java.util.*;

public class Babanuki {
  public static void main(String[] args) {
	  System.out.println("ゲームを始めます");
	  String[][] trump_card = {
			  { "🖤A", "🖤2", "🖤3", "🖤4", "🖤5", "🖤6", "🖤7", "🖤8", "🖤9", "🖤10", "🖤J", "🖤Q", "🖤K" },
			  { "🔷A", "🔷2", "🔷3", "🔷4", "🔷5", "🔷6", "🔷7", "🔷8", "🔷9", "🔷10", "🔷J", "🔷Q", "🔷K" },
			  //{ "♣️A", "♣️2", "♣️3", "♣️4", "♣️5", "♣️6", "♣️7", "♣️8", "♣️️9", "♣️10", "♣️J", "♣️Q", "♣️K" },
			  //{ "♠️A", "♠️2", "♠️3", "♠️4", "♠️5", "♠️6", "♠️7", "♠️8", "♠️9", "♠️10", "♠️J", "♠️Q", "♠️K" },
	  };
	  
	  String[] card = new String[26];
	  
	  int k = 0;
	  for (String[] i : trump_card) {
		  for (String j : i) {
			  card[k] = j;
			  k++;
		  }
	  }
	  
	  String[] player = new String[14];
	  String[] Com = new String[14];
	  int a = 2;
	  int b = 0;
	  int x = 0;
	  while (true) {
		  int randomInt = (int)(Math.random() * 26);
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
		  if (a == 28) {
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
			  playerCard.remove(y);
			  playerCard.remove(z); 
			  z = 1;
		  } else {
			  System.out.print(playerCard.get(y));
			  y++;
			  z = 1;
		  }
	  }
	  
	  /*
	  for (int p = 0; p < playerCard.size(); p++) {
		  r = playerCard.get(y); 
		  if (r == null ) {
		    y++;
		  } else {
		    c = r.substring(r.length() - 1);
		  }
		  for (int t = 0; t < playerCard.size(); t++) {
		      q = playerCard.get(z);
			  if (q == null) {
			    z++;
			  } else {
			    //System.out.println(playerCard.get(z));
				d = q.substring(q.length() - 1); 
			  }
			  if (c.equals(d)) {
				  playerCard.remove(y);
				  playerCard.remove(t);
				  break;
			  } 
			  z++;
		  }
		  y++;
	  }
	  System.out.print(playerCard.get(y));
	  */
	  /*
	  for (String p : playerCard) {
		  String c = p.substring(p.length() - 1);
		  for (String t : playerCard) {
			  String d = t.substring(t.length() - 1);
			  if (c == d) {
				  playerCard.remove(c);
				  playerCard.remove(d);
			  }
		  }
	  }*/
  }
}
