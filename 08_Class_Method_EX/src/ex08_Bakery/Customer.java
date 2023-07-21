package ex08_Bakery;

public class Customer {

  private int count; // 빵을 몇 개 샀는가?
  private int money; // 돈을 얼마 가지고 있는가?
  private Bakery bakery;

  public Customer(int money) {
    this.money = money;
  }

  public int getCount() {
    return count;
  }

  public int getMoney() {
    return money;
  }

  /**
   * 구매 메소드<br>
   * Bakery에서 빵을 구매하는 메소드<br>
   * 어떤 Bakery에서 살 것인지, 몇 개의 빵을 살 것인지, 얼마를 낼 것인지
   * Bakery 클래스의 판매 메소드(sell)를 이용해서 구현
   * @param bakery 빵을 구매할 Bakery
   * @param count 구매할 빵의 갯수
   * @param money 구매할 때 낸 돈
   */
  public void buy(Bakery bakery, int count, int money) {
    //bakery에 count와 money를 전달하고 빵과 잔돈을 받는다.
    BreadChange bc = bakery.sell(count, money);

    //구매 처리
    if (bc != null) { //널 처리안해주면 널인데도 구매 처리하려고 하기 때문에 오류남
    this.count += bc.getBread(); //구매자가 가지고 있는 빵에 산 빵 추가
    this.money -= money; //돈을 낸 만큼 줄어들음
    this.money += bc.getChange(); //거스름돈
  }
}
}

