package ex03_Rectangle;

public class MainWrapper {

  public static void main(String[] args) {

    //정사각형 만들기
    Square s1 = new Square();
    s1.setWidth(5);
    s1.setHeight(5); //입력을 다르게 하면 직사각형될 수 있는 안좋은 형태
    s1.info();

    //정사각형 만들기 (너비 높이 둘다 주지 않고 하나만 주기)
    Square s2 = new Square(6); //너비 6 높이 6 정사각형
    s2.info();
  }
}
