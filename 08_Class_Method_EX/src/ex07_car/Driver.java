package ex07_car;

public class Driver {

  private String name;
  private int career;
  private boolean bestDriver; // 기준 career가 10년 이상이면 true

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getCareer() {
    return career;
  }

  public void setCareer(int career) {
    this.career = career;
    setBestDriver(career >= 10);
  }

  public boolean isBestDriver() {
    return bestDriver; //boolean은 get이 아니라 is로 시작 (get으로 적으면 프레임워크가 못 읽음)
  }

  private void setBestDriver(boolean bestDriver) { //다른 클래스(main등)호출해서 값 저장하는 거 막으려고 private 메소드 해준것
    this.bestDriver = bestDriver;
  }
}


