import org.w3c.dom.css.Rect;

public class Rectangle {
  int width;
  int height;
  int x;
  int y;
  final int INITIAL_WIDTH;
  final int INITIAL_HEIGHT;

  Rectangle() {
    width = INITIAL_WIDTH;
    height = INITIAL_HEIGHT;
    x = 0;
    y = 0;
  }

  Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
    this.x = 0;
    this.y = 0;
  }

  Rectangle(int width, int height, int x, int y) {
    this.width = width;
    this.height = height;
    this.x = x;
    this.y = y;
  }

  public void setLocation(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public void setSize(int width, int height) {
    this.width = width;
    this.height = height;
  }

  @Override
  public String toString() {
    return "[" + x + ", " + y + ", " + width + ", " + height + "]";
  }

  Rectangle ntersect(Rectangle r) {

  }

  void setSize(int w, int h) {
    width = w;
    height = h;
  }

  int getArea() {
    return width * height;
  }
}
