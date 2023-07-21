package ex08_Bakery;

//1가지 빵만 파는 빵집

public class Bakery {

  private int count; // 빵이 몇 개 있는가?
  public final int PRICE = 2000; // 빵이 얼마인가? (final값은 외부요인에 의해 잘못된 우려없어서 public으로 공개)
  private int money; // 빵집에 돈이 얼마 있는가?

  public Bakery(int count, int money) {
    this.count = count;
    this.money = money;
  }

  public int getMoney() {
    return money;
  }

  public int getCount() {
    return count;
  }

  /**
   * 판매 메소드<br>
   * 고객으로부터 구매할 빵의 갯수와 돈을 전달받아서 판매
   * @param count 구매할 빵의 갯수
   * @param money 빵을 사려고 내는 돈
   * @return 빵과 잔돈
   */
  public BreadChange sell(int count, int money) {

    //빵이 부족하다
    if (this.count < count) {
      System.out.println("판매불가합니다 (빵 부족)");
      return null;
    }

    // 고객이 돈을 안 냈다.
    if (money <= 0) {
      System.out.println("판매불가합니다. (돈 안냄)");
      return null;
    }

    // 고객이 낸 돈이 모자르다
    if (PRICE * count > money) {
      System.out.println("판매불가합니다. (돈이 모자름)");
      return null;
    }

    // 판매 처리
    this.count -= count;
    this.money += count * PRICE;

    // 고객에게 반환할 BreadChange 객체 생성
    BreadChange bc = new BreadChange(count, money - count * PRICE);

    // 고객에게 빵과 잔돈 반환
    return bc;
  }

}
