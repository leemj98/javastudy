package ex02_loop;

public class MainWrapper {

  public static void ex01() {
    // ������ ����ϱ�
    // 2 x 1 = 2
    // 2 x 2 = 4
    // ...
    // 2 x 9 = 17
    int dan = 2; // �� ���� ���ϴ� �������� ������ �ȴ�.

    for (int i = 1; i <= 9; i++) {
      System.out.println(dan + " x " + i + " = " + dan * i);
    }
  }

  public static void ex02() {
    // 100000 ���� ������ 60���� ����ϸ鼭 ���� ����ϱ�
    // 1ȸ ��ݾ� 60��, ���� ��ݾ� 60��
    // 2ȸ ��ݾ� 60��, ���� ��ݾ� 120��
    // 3ȸ ��ݾ� 60��, ���� ��ݾ� 180��
    // ...
    // 1667ȸ ��ݾ� 60��, ���� ��ݾ� 100020��
    int goal = 100000; // ��ǥ ��ݾ�
    int money = 60; // 1ȸ�� ��ݾ�
    int total = 0; // ��ݾ� �հ�
    int nth = 0; // ȸ��

    while (total <= goal) {
      total += money;
      nth++;
      System.out.println(nth + "ȸ ��ݾ� " + money + "��, ���� ��ݾ� " + total + "��");
    }

  }

  public static void ex03() {
    // ��ü ������ ����ϱ� - 1
    // 2 x 1 = 2
    // ...
    // 9 x 9 = 81

    for (int i = 2; i <= 9; i++) {
      for (int j = 1; j <= 9; j++) {
        System.out.println(i + " x " + j + " = " + i * j);
      }
    }
  }

  public static void ex04() {
    // ��ü ������ ����ϱ� - 2
    // 2x1=2 3x1=3 4x1=4 ... 9x1=9
    // ...
    // 2x9=18 3x9=27 4x9=36 ... 9x9=81

    for (int i = 1; i <= 9; i++) {
      for (int j = 2; j <= 9; j++) {
        System.out.print(j + " x " + i + " = " + i * j + " ");
      }
      System.out.println(" ");
    }
  }

  public static void ex05() {
    // �ﰢ�� ����ϱ� - 1 (2�� loop)
    // *
    // **
    // ***
    // ****
    // *****

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void ex06() {
    // �ﰢ�� ����ϱ� - 2 (2�� loop)
    // *****
    // ****
    // ***
    // **
    // *

    for (int i = 5; i > 0; i--) {
      for (int j = i; j > 0; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void ex07() {
    // �ﰢ�� ����ϱ� - 3 (2�� loop)
    // b=123456789
    // a=1     *
    // a=2    ***
    // a=3   *****
    // a=4  *******
    // a=5 *********

    for (int i = 0; i < 5; i++) {
      for (int j = 1; j < 5 - i; j++) {
        System.out.print(" ");
      }

      for (int k = 0; k < (i * 2) + 1; k++) {
        System.out.print("*");
      }
      System.out.println(" ");
    }

  }

  public static void ex08() {
    // �ﰢ�� ����ϱ� - 4 (2�� loop)
    // *********
    //  *******
    //   *****
    //    ***
    //     *

    for (int i = 5; i > 0; i--) {
      for (int j = 5 - i; j > 0; j--) {
        System.out.print(" ");
      }
      for (int k = i * 2 - 1; k > 0; k--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    //    ex01();
    //    ex02();
    //    ex03();
    //    ex04();
    //    ex05();
    //    ex06();
    //    ex07();
    ex08();
  }

}