package ex01_BankAccount;

public class MainWrapper {


  public static void main(String[] args) {

    // BankAccount my ��ü ����
    BankAccount my = new BankAccount();

    // my ��ü�� ���¹�ȣ ���
    my.setAccNo("032-21-9874-321");

    // my ��ü�� �Ա��ϱ�
    my.deposit(50000);

    // my ��ü ����ϱ�
    my.withdrawal(1);

    // my ��ü ��ȸ�ϱ�
    my.inquiry();

    // BankAccount you ��ü ����
    BankAccount you = new BankAccount();

    // you ��ü�� ���¹�ȣ ���
    you.setAccNo("02-578-6321");

    // my���� you�� 300000�� ��ü�ϱ�
    my.transfer(you, 30000);

    // my, you ��ü ��ȸ�ϱ�
    my.inquiry(); // �����ܾ� 19999��
    you.inquiry(); // �����ܾ� 30000��
  }

}
