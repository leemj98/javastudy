package ex09_interface;

public class Circle implements Shape {

  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double getArea() {
    // TODO Auto-generated method stub
    return PI * radius * radius;
  }

}
