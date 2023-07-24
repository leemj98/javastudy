package ex02_Computer;

public class Notebook extends Computer {

  private int battery;

  //Getter Setter
  public int getBattery() {
    return battery;
  }

  public void setBattery(int battery) {
    this.battery = battery;
  }

  // new Notebook("gram",70)에 의해서 호출되는 생성자
  public Notebook(String model, int battery) {
    super(model); //super는 항상 먼저 호출해야 함. 순서만 바꿔도 오류
    this.battery = battery;
  }
}
