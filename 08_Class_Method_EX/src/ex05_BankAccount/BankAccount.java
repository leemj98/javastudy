package ex05_BankAccount;

public class BankAccount {

	private Bank bank;
  private String accNo;
  private long balance;
	
  //생성자
  public BankAccount(Bank bank, String accNo, long balance) {
		this.bank = bank;
    this.accNo = accNo;
    this.balance = balance;
	}
	
  //info
	public void info() {
    System.out.println("계좌번호: " + accNo + ", 통장잔액: " + balance + "원");
		System.out.print("개설지점: ");
		bank.info();
	}
	
  //이체
  //입금
  public void deposit(long money) {
    if (money <= 0) {
      return;
    }
    balance += money;
  }
  //출금
  public long withdrawal(long money) {
    long retVal = 0;
    if (money > 0 && money <= balance) {
      balance -= money;
      retVal = money;
    }
    return retVal;
  }
  //이체 (뱅크멤버에 있으니 없어도 되는거 아닌가)
  public void transfer(BankAccount acc, long money) {
    acc.deposit(withdrawal(money));
  }
	
  //생성자
  public BankAccount() {
  }

  //Setter
  public void setBank(Bank bank) {
    this.bank = bank;
  }

  public void setAccNo(String accNo) {
    this.accNo = accNo;
  }

  public void setBalance(long balance) {
    this.balance = balance;
  }

  //Getter
  public Bank getBank() {
    return bank;
  }

  public String getAccNo() {
    return accNo;
  }

  public long getBalance() {
    return balance;
  }
}
