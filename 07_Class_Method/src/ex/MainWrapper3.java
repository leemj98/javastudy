package ex;

import java.util.Arrays;

public class MainWrapper3 {
  // ����Ÿ���� ������ �� (�� ���߿��� ��κ��� �μ��� �Ķ���Ͱ� ����Ÿ����)
  // �Ű��������� �����ص� �� ������

  public static void ex01(int[] a) {
    System.out.println(Arrays.toString(a)); // int[] a = 0x10000000
    a[0] = 100;
    System.out.println("ex01�� �迭 a = " + Arrays.toString(a));
  }

  public static void main(String[] args) {
    int[] a = { 10, 20, 30 };
    ex01(a); // a ������: 0x10000000
    System.out.println("main�� �迭 a = " + Arrays.toString(a));
  }
}
