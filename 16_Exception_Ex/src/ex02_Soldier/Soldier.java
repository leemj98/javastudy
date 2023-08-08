package ex02_Soldier;

public class Soldier {

  private Gun gun;
  
  public Soldier(Gun gun) {
    this.gun = gun;
  }
  
  public Soldier(int bullet) {
    gun = new Gun(bullet);
  }
  
  public void reload(int bullet) throws RuntimeException {
    gun.reload(bullet); //gun에서 던져진걸 다시 main으로 던짐
  }
  
  public void shoot() {
    gun.shoot();
  }
  
}
