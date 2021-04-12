public class Rectangle11_6 {
  
  // thisと引数のRectangleを比較して、等しかったらtrue,
  // 等しくなかったらfalseを返す

  @Override
  boolean equals(Rectangle a) {
    if (a == null) {
      return false;
    } else if (width == a.width && height == a.height) {
      return true;
    } else {
      return false;
    }
  }
}
