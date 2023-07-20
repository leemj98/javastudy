package ex05_BankAccount;

public class Bank {

  private String name;
  private String phone;

  public Bank(String name, String phone) {
    this.name = name;
    this.phone = phone;
  }

  public void info() {
    System.out.println(name + "(" + phone + ")");
  }
}