package ex01_parameter;

public class MainWrapper2 {

  /*
   * �޼ҵ� �����ε�(Overloading)
   * 1. ���� �̸��� ������ �ִ� �޼ҵ带 ���� �� ���� �� ����
   * 2, �޼ҵ� �����ε��� ����
   *   1) �޼ҵ� �̸��� ���ƾ� ��
   *   2) �Ķ����(����, Ÿ��)�� �ݵ�� �޶�� �Ѵ�.
   */

  public static void main(String[] args) {
    print(10); // ������ 1�� ����ϰ� ���� print �޼ҵ�
    print(1.5); // �Ǽ��� 1�� ����ϰ� ���� print �޼ҵ�
    print(10, 20); // ������ 2�� ����ϰ� ���� print �޼ҵ�
    print(1.5, 1.2); // �Ǽ��� 2�� ����ϰ� ���� print �޼ҵ�
  }

  public static void print(double a, double b) {
    print(a);
    print(b);
  }
  public static void print(int a, int b) {
    System.out.println(a + ", " + b);
  }

  public static void print(double a) {
    System.out.println(a);
  }

  public static void print(int a) {
    System.out.println(a);

  }
}
