package ex07_car;

public class Car {
  private Driver driver;
  private int speed;
  private int fuel;
  private boolean isEmpty;
  private final int MAX_SPEED = 100;
  private final int MIN_SPEED = 0;

  public Driver getDriver() {
    return driver;
  }

  public void setDriver(Driver driver) {
    this.driver = driver;
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public int getFuel() {
    return fuel;
  }

  public void setFuel(int fuel) {
    this.fuel = fuel;
    setEmpty(fuel <= 0);
  }

  public boolean isEmpty() {
    return isEmpty; //이름에 is 들어가면 그냥 isEmpty라고 이름지음
  }

  private void setEmpty(boolean isEmpty) {
    this.isEmpty = isEmpty; //이름에 is 들어가면 그냥 setEmpty라고 이름 지음
  }

  public void engineStart() {
    if (isEmpty == true) {
      System.out.println("시동이 걸리지 않았습니다.");
    } else {
      System.out.println("시동이 걸렸습니다.");
    }
  }
  
  public void drive() {
    if (fuel == 0 || driver ==null) {
      System.out.println("자동차가 움직이지 않았습니다.");
    } else {
      System.out.println("자동차가 움직였습니다.");
    }
  }

  public void accel(int speed) {
    fuel--; //악셀 밟으면 기름 줄어들음
    this.speed += speed;

    if (this.speed >= MAX_SPEED) {
      this.speed = MAX_SPEED;
    }
    System.out.println("현재 속도는 " + this.speed + "입니다.");
  }

  public void brake(int speed) {
    this.speed -= speed;
    
    if(this.speed<=MIN_SPEED) {
      this.speed=0;
    }
    System.out.println("현재 속도는 " + this.speed + "입니다.");
    
  }
}
