package ex03_Rectangle;

// 정사각형은 사각형이다

public class Square extends Rectangle {


  //정사각형
  public Square() {

  }


  public Square(int width) {
    super(width, width); //new Rectangle(6,6)
  }
}
