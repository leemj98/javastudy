package ex;

public class MainWrapper4 {

  // void : ������ ����.
  public static void ex01() {
    System.out.println("������ ���� ex01");
  }

  // int : ������ int Ÿ��
  public static int ex02() {
    return 100;
  }

  // String : ������ string Ÿ��
  public static String ex03() {
    return "Hello World";
  }

  public static void main(String[] args) {
    ex01(); //��ȯ(return)�� ���� �� - �޾ƿ��°� ����, ȣ���ϸ� ��

    int n = ex02(); // ���� �Ŀ��� int n = 100;
    System.out.println(n);
    System.out.println(ex02()); // ���� �Ŀ��� System.out.println(100);
    if (ex02() > 0) {
      System.out.println("���");
    } else {
      System.out.println("����");
    }

    String str = ex03();
    System.out.println(str); //Hello World
  }
}
