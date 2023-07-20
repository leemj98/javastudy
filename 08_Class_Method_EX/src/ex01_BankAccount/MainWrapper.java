package ex01_BankAccount;

public class MainWrapper {


  public static void main(String[] args) {

    // BankAccount my 객체 생성
    BankAccount my = new BankAccount();

    // my 객체에 계좌번호 등록
    my.setAccNo("032-21-9874-321");

    // my 객체에 입금하기
    my.deposit(50000);

    // my 객체 출금하기
    my.withdrawal(1);

    // my 객체 조회하기
    my.inquiry();

    // BankAccount you 객체 생성
    BankAccount you = new BankAccount();

    // you 객체에 계좌번호 등록
    you.setAccNo("02-578-6321");

    // my에서 you로 300000원 이체하기
    my.transfer(you, 30000);

    // my, you 객체 조회하기
    my.inquiry(); // 통장잔액 19999원
    you.inquiry(); // 통장잔액 30000원
  }

}
