package ex09_interface;


/*
 * 클래스 상속 vs 인터페이스 구현
 * 1. 클래스를 상속받는다. 
 *    public class Person { }
 *    public class Student extends Person { }
 * 2. 인터페이스를 구현한다
 *    public interface Shape { }
 *    public class Rectangle implements Shape { }
 */

public class Rectangle implements Shape {

  private int width;
  private int height;

  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  // 인터페이스를 구현한 클래스는 "반드시" 추상 메소드를 오버라이드해야 한다
  // 추상 클래스의 서브 클래스는 "반드시" 추상 메소드를 오버라이드해야 하니까
  @Override
  public double getArea() {
    return width * height;
  }

}
