package ex03_Bakery;

public class MainWrapper {

  public static void main(String[] args) {

    try {

      Bakery bakery = new Bakery(100, 10000); //빵이 100개, 빵집에 10000원 있음 (빵 가격은 2000원)

      Customer customer = new Customer(10000); // 빵 0개, 10000원을 가진 고객

      customer.buy(bakery, 1000, 10000); //bakery에서 빵 1000개 구매를 위해서 10000 냈다 (오류)

      System.out.println("빵집 money: " + bakery.getMoney() + "원");
      System.out.println("빵집 빵:" + bakery.getCount() + "개");

      System.out.println("고객 money: " + customer.getMoney() + "원");
      System.out.println("고객 빵: " + customer.getCount() + "개");

    } catch (RuntimeException e) {
      System.out.println(e.getMessage());
    }
  }
}
