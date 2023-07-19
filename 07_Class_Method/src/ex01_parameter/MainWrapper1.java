package ex01_parameter;

import java.util.Arrays;

public class MainWrapper1 {

  /*
   * 1. �μ�(Argument)
   *  1) �޼ҵ忡�� �����ϴ� ��
   *  2) �޼ҵ带 ȣ���� �� ������ �� ����
   * 2. �Ķ����(Parameter)
   *  1) �μ��� �޾Ƽ� �����ϴ� ����
   *  2) �Ű�������� ��
   */

  public static void main(String[] args) {
    ex01(); // �μ��� ���� ���
    ex02(10); // �μ��� ���� 1���� ���
    ex03(1.5, 1.2); // �μ��� �Ǽ� 2���� ���
    ex04("ȫ�浿", 30); // �μ��� ���ڿ� 1���� ���� 1���� ���
    int[] a = { 10, 20, 30 };
    ex05(a); // �μ��� �迭 1���� ��� 
  }

  public static void ex05(int[] arr) { // �μ��� �迭 1���̸� �Ķ���� int[] arr ������. ���⼭ �迭�̸��� �ƹ��ų� ����ص� ����
    System.out.println("ex05: " + Arrays.toString(arr));

  }

  public static void ex04(String name, int age) { // ���ڿ� �μ��� �Ķ���� String name����, ���� �μ��� int age�� ���� 
    System.out.println("ex04: " + name);
    System.out.println("ex04: " + age);

  }

  public static void ex03(double a, double b) { //�μ��� �Ǽ� 2���̸� �Ķ���� double a, double b�� ������
    System.out.println("ex03: " + a);
    System.out.println("ex03: " + b);
  }

  public static void ex02(int a) { // �μ��� ���� 1���̸� �Ķ���� int a�� ������
    System.out.println("ex02: " + a);
  }

  public static void ex01() { // �μ��� ������ �Ķ���͵� ����

  }

}
