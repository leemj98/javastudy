package ex;

public class MainWrapper {

  public static void ex01() {
    System.out.println("�Ķ���Ͱ� ���� ex01");
  }

  public static void ex01(String str) { //�Ķ���� String str : �μ��� �޾Ƽ� �����ϴ� ���� (�Ű�����)
    System.out.println("�Ķ���� String str = " + str);
  }

  public static void ex01(int a, int b) { // �Ķ���� int a, �Ķ���� int b
    System.out.println("�Ķ���� int a = " + a);
    System.out.println("�Ķ���� int b = " + b);
  }

  public static void main(String[] args) {
    ex01(); // ex01() �޼ҵ忡 �����ϴ� �μ��� ����
    ex01("hello world"); // ex01() �޼ҵ忡 �μ� "hello world"�� ����
    ex01(10, 20); //ex01() �޼ҵ忡 �μ� 10, 20�� ����
  }
}
