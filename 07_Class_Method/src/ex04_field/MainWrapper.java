package ex04_field;

public class MainWrapper {
  public static void main(String[] args) {
    //AccCalculator ��ü�� ���� & ����
    AccCalculator myAcc = new AccCalculator();

    //value Ȯ��
    myAcc.showValue();

    //��Ģ����
    myAcc.addition(3);
    myAcc.substraction(2);
    myAcc.multipication(3);
    myAcc.division(2);

    //value Ȯ��
    myAcc.showValue();
  }
}
