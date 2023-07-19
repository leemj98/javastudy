package ex04_field;

/**
 * 
 * ��Ģ���� ����� ������ �� �ִ� ���� 
 * 
 * @author GDJ
 * @since 2023.07.19
 * @version 1.0.0
 *
 */
public class AccCalculator {

  /*
   * �ʵ�(field)
   * 1. ��ü�� ���� �� �ִ� ���� ������ ����
   * 2. Ŭ�������� ����
   * 3. �ʵ�� �ڵ����� �ʱ�ȭ�� (0, 0.0, false, null)
   * 4. ���� ������ ���ؼ� private ó��
   */

  /**
   * �� �ʵ�� AccCalculator�� ��Ģ���� ����� <br> ������ �� �ִ� �ʵ�
   */
  private double value;

  /**
   * 
   * �ʵ� value�� �Ķ���� a�� �����ִ� �޼ҵ� 
   * @param a �Ǽ�
   */
  public void addition(double a) {
    value += a;
    System.out.println("+" + a + "=" + value);
  }

  /**
   * �ʵ� value���� �Ķ���� a�� ���ִ� �޼ҵ�
   * @param a
   */
  public void substraction(double a) {
    value -= a;
    System.out.println("-" + a + "=" + value);

  }

  /**
   * �ʵ� value�� �Ķ���� a�� �����ִ� �޼ҵ�
   * @param a
   */
  public void multipication(double a) {
    value *= a;
    System.out.println("*" + a + "=" + value);
  }

  /**
   * �ʵ� value�� �Ķ���� a�� �����ִ� �޼ҵ�
   * @param a
   */
  public void division(double a) {
    value /= a;
    System.out.println("/" + a + "=" + value);
  }

  /**
   * �ʵ� value�� ����ϴ� �޼ҵ�
   */
  public void showValue() {
    System.out.println(value);
}
}