package ex01_BankAccount;

public class MainWrapper {

  public static void main(String[] args) {

    BankAccount acc = new BankAccount(10000, "1234");
    long money = acc.withdrawal(-1);
    System.out.println("출금액 " + money); //-1원 출금 불가     출금액 0

    money = acc.withdrawal(50000);
    System.out.println("출금액 " + money); //잔액 부족   출금액 0

    money = acc.withdrawal(5000);
    System.out.println("출금액 " + money); //출금액 5000

    acc.deposit(-1); // "-1원 입금 불가" 출력됨

    System.out.println("--------------------------");
    BankAccount acc2 = new BankAccount(10000, "5678");
    acc.transfer(acc2, 5000);
    acc.inquiry();
    acc2.inquiry();
  }

}

