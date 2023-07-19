package ex01_BankAccount;

/**
 * �Ա�, ���, ������ȸ, ��ü ����� �����ϴ� Ŭ����
 * @author ȫ�浿
 * @since 2023.07.19
 * @version 1.0
 */
public class BankAccount {

  /**
   * long balance �� �ʵ�� ���� �ܾ��̴�. <br>
   * �ʱ갪���� 0�� ����ȴ�.
   */
  private long balance;

  /**
   * String accNo �� �ʵ�� ���� ��ȣ�̴�. <br>
   * �ʱ갪���� null�� ����ȴ�.
   */
  private String accNo;

  /**
   * ���¹�ȣ�� �����ܾ��� ��ȸ�ϴ� �޼ҵ�
   */
  public void inquiry() {
    System.out.println("���¹�ȣ: " + accNo);
    System.out.println("�����ܾ�: " + balance + "��");
  }

  /**
   * �Ա� �޼ҵ�<br>
   * �Ķ���Ͱ� 0���� �۰ų� ������ �������� �ʴ´�.
   * @param money �Ա��� �ݾ�
   */
  public void deposit(long money) {
    if (money <= 0) {
      return; // �޼ҵ� ����
    }
    balance += money;
  }

  /**
   * ��� �޼ҵ�<br>
   * �Ķ���Ͱ� 0���� �۰ų� ������ ��ݵ� �ݾ��� �����Ƿ� 0 ��ȯ
   * �Ķ���Ͱ� �����ܾ�(balance)���� ũ�� ��ݵ� �ݾ��� �����Ƿ� 0 ��ȯ 
   * @param money ����� �ݾ�
   * @return ������ ��ݵ� �ݾ�
   */
  //  public long withdrawal(long money) {
  //    if(money<=0 || money>balance) {
  //      return 0;
  //    }
  //    balance -= money;
  //    return money;
  //  } //return�� 2���� �ͺ��� �ϳ��ΰ� ����  
  public long withdrawal(long money) {
    long retVal = 0;
    if (money <= 0 || money > balance) {
      retVal = 0;
    } else {
      balance -= money;
      retVal = money;
    }
    return retVal;
  }

  // Getter
  public long getBalance() {
    return balance;
  }

  public String getAccNo() {
    return accNo;
  }

  // Setter  
  public void setBalance(long param) {
    balance = param;
  }

  public void setAccNo(String param) {
    accNo = param;
  }

  // Transfer
  public void transfer(BankAccount name, long money) {
    
    System.out.println(name.withdrawal(money));
    if (money <= 0 || money > balance) {
      return;
    } else {
      balance -= money;
      System.out.println(name.withdrawal(money));
    }
  }
}
