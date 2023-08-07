package ex06_GameUnit;

public class Marine extends GameUnit {
  
  private final int POWER = 5; // 공격력

  //new Marine("마린")
  public Marine(String name) {
    super(name); //new GameUnit(String name) {} 생성자를 호출
  }

  @Override
  public void attack(GameUnit other) { //unit1.attack(unit2)
    if (POWER >= other.getHp()) {
      other.setHp(0);//other의 체력이 power보다 작으면 그냥 죽은걸로 처리
    } else {
      other.setHp(other.getHp() - POWER);
  }
  }
  
}
