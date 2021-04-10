public class PCCals {
  public static void main(String[] args) {
    String[][] orders = {
      { "0001", "HP", "デスクトップ", "185000" },
      { "0002", "IBM", "ノート", "78900" },
      { "0003", "DELL", "デスクトップ", "153000" },
    };

    for (int i = 0; i < orders.length; i++) {
      for (int j = 0; j < orders[i].length; j++) {
        if (j == 0) {
          System.out.print("注文番号:" + orders[0] + ", ");
        } else if (j == 1) {
          System.out.print("名称:" + orders[1] + ", ");
        } else if (j == 2) {
          System.out.print("種類:" + orders[2] + ", ");
        } else {
          System.out.println("価格:" + orders[3] + "円");
        }
      }
    }
  }  
}

