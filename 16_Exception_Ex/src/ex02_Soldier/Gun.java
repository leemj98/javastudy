package ex02_Soldier;

public class Gun {

  private int bullet;
  private final int MAX_BULLET = 50;

  public Gun(int bullet) {
    this.bullet = bullet > MAX_BULLET ? MAX_BULLET : bullet;
  } // 총알이 맥스값 이상으로 커지지 않도록

  public void reload(int bullet) throws RuntimeException { //총알 장전
    if (this.bullet + bullet > MAX_BULLET) { //장전한 총알이 맥스값보다 크면 장전 불가능
      throw new RuntimeException(bullet + "발은 장전이 불가능합니다.");
    }
    this.bullet += bullet; //아니면 입력한만큼 장전
    System.out.println(bullet + "발이 장전되었습니다. 현재 " + this.bullet + "발이 들어있습니다.");
  }

  public void shoot() throws RuntimeException { //총알 발사
    if (bullet == 0) { //총알 없으면 헛빵
      throw new RuntimeException("헛빵!");
    }
    bullet--; //아니면 총알 한발씩 사용
    System.out.println("빵! 현재 " + bullet + "발이 남았습니다.");
  }

}