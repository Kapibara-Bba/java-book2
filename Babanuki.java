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
	  
	  List<String> play = Arrays.asList(player);
	  List<String> playerCard = new ArrayList<>(play);
	  List<String> comp = Arrays.asList(Com);
	  List<String> comCard = new ArrayList<>(comp);
	  
	  for (String p : playerCard) {
		  String c = p.substring(p.length() - 1);
		  
	  }
  }
}
