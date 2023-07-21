package ex07_car;

public class MainWrapper {

  public static void main(String[] args) {

    Driver driver = new Driver();

    driver.setName("홍길동");
    driver.setCareer(20);

    Car myCar = new Car();
    myCar.setDriver(driver);
    myCar.setFuel(50);

    myCar.engineStart(); // 시동이 걸렸습니다. or 시동이 걸리지 않았습니다.

    myCar.drive(); // 자동차가 움직였습니다 or 자동차가 움직이지 않았습니다 

    myCar.accel(50); // 기존 속도에 50이 추가. 현재 속도는 50입니다.
    myCar.accel(60); // 기존 속도에 60이 추가 (최대 속도는 100, 100에 도달하면 추가x). 현재 속도는 100입니다

    myCar.brake(50); // 기존 속도가 50만큼 감속, 현재 속도는 50입니다.
    myCar.brake(60); // 기존 속도가 60만큼 감속, 현재 속도는 0입니다. (최저 속도 0, 0 도달하면 감속x)
  }
}
