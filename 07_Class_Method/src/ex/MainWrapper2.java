package ex;

public class MainWrapper2 {
  // �����͸� ������ ��
  // �Ű��������� �����ϸ� �ű⼭�� ������

  public static void ex01(int a, int b) {
    System.out.println(a + ", " + b);
    a++;
    b++;
    System.out.println("ex01�� a = " + a);
    System.out.println("ex01�� b = " + b);
  }

  public static void main(String[] args) {

    int a = 10;
    int b = 20;
    ex01(a, b); // 10, 20 ���
    System.out.println("main�� a = " + a);
    System.out.println("main�� b = " + b);
  }

}
