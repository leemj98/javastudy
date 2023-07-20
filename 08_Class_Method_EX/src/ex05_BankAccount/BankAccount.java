package ex05_BankAccount;

public class BankAccount {

	private Bank bank;
	private String acc;
	private long money;
	
	public BankAccount(Bank bank, String acc, long money) {
		this.bank = bank;
		this.acc = acc;
		this.money = money;
	}
	
	public void info() {
		System.out.println("계좌번호: "+ acc + "통장잔액: "+ money);
		System.out.print("개설지점: ");
		bank.info();
	}
	
	
}
