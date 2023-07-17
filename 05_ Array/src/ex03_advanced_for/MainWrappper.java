package ex03_advanced_for;

import java.util.Arrays;

public class MainWrappper {

  // 1���� �迭�� advanced-for��
  public static void ex01() {
    // 1���� �迭�� �ʱ�ȭ
    int[] a = { 10, 20, 30 };
    // advanced-for
    for (int number : a) { //    for(�迭��Ҹ� ������ ����: �迭��)
      System.out.println(number);
    } // �迭 a�� ��� ��Ҹ� ���������� number�� �ѱ� (�ε����� ���� ����) 
  }

  // advanced-for���� ������� ���ϴ� ��ǥ���� ��� : �迭����� ���� ���ϴ� ���
  public static void ex02() {
    // 1���� �迭�� �ʱ�ȭ
    int[] a = { 10, 20, 30 };

    // ��� �迭��Ҹ� 1�� ������Ű�� -1 : advanced-for(�Ұ���)
    for (int number : a) {
      number++;
    }

    // �迭 ��� Ȯ��
    System.out.println(Arrays.toString(a)); // 11,21,31�� ���;� �����ε� 10,20,30 �״�� 
    // ��� for���� �迭 ��Ҹ� �״�� ���� �ʰ� �����ؼ� ���� ���̱� ����. number�� ���� �����Ѱ��� �迭������ ���������� ����

    // ��� �迭��Ҹ� 1�� ������Ű�� -2 : �Ϲ� for�� (����)
    for (int i = 0; i < a.length; i++) {
      a[i]++;
    }
    System.out.println(Arrays.toString(a)); // 11,21,31�� ����
  }

  // 2���� �迭�� advanced-for��
  public static void ex03() {
    int[][] a = { { 10, 20 }, { 30, 40 }, { 50, 60 } };

    //advanced-for
    for (int[] b : a) {
      for (int number : b) {
        System.out.print(String.format("%4d", number));
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    //    ex01();
    ex02();
    //    ex03();

  }

}
