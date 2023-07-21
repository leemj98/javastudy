package ex05_BankAccount;

public class Bank {

  private String name;
  private String tel;

  //생성자
  public Bank(String name, String tel) {
    this.name = name;
    this.tel = tel;
  }

  //info
  public void info() {
    System.out.println(name + "(" + tel + ")");
  }

  //생성자
  public Bank() {
  }

  //Setter 
  public void setName(String name) {
    this.name = name;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  //Getter
  public String getName() {
    return name;
  }

  public String getTel() {
    return tel;
  }

}