package ex06_GameUnit;

public class Firebat extends GameUnit {

  //new Marine("파이어뱃")
  public Firebat(String name) {
    super(name); //new GameUnit(String name) {} 생성자를 호출
  }

  private final int POWER = 10;

  @Override
  public void attack(GameUnit other) { //unit2.attack(unit1)
    if (POWER >= other.getHp()) {
      other.setHp(0);//other의 체력이 power보다 작으면 그냥 죽은걸로 처리
    } else {
      other.setHp(other.getHp() - POWER);
    }
  }

}
