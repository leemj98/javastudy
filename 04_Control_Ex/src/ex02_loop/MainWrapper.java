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
    final int GOAL = 100000; // ��ǥ ��ݾ�
    int money = 60; // 1ȸ�� ��ݾ�
    int total = 0; // ��ݾ� �հ�
    int nth = 0; // ȸ��

    while (total <= GOAL) {
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

    // ���� ���� �ٱ� LOOP�� ��ġ (���� 2�� ������Ű�� 1~9 ��ȸ)
  }

  public static void ex04() {
    // ��ü ������ ����ϱ� - 2
    // 2x1=2 3x1=3 4x1=4 ... 9x1=9
    // ...
    // 2x9=18 3x9=27 4x9=36 ... 9x9=81

    for (int i = 1; i <= 9; i++) {
      for (int j = 2; j <= 9; j++) {
        System.out.print(j + " x " + i + " = " + String.format("%-4d", j * i) + "\t");
      }
      System.out.println(" ");
    }

    // DAN * N �� ��, N ���� ������ => N�� �ٱ���
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
    //       star=12345
    // row=1      *****
    // row=2      ****
    // row=3      ***
    // row=4      **
    // row=5      *
    //
    // row=1, star=1~5
    // row=2, star=1~4
    // row=3, star=1~3
    // row=4, star=1~2
    // row=5, star=1~1
    for (int row = 1; row <= 5; row++) {
      for (int star = 1; star <= 6 - row; star++) {
        System.out.print("*");
      }
      System.out.println();
    }

    //    for (int i = 5; i > 0; i--) {
    //      for (int j = i; j > 0; j--) {
    //        System.out.print("*");
    //      }
    //      System.out.println();
    //    }
  }

  public static void ex07() {
    // �ﰢ�� ����ϱ� - 3 (2�� loop)
    //       space/star=123456789
    // row=1                *
    // row=2               ***
    // row=3              *****
    // row=4             *******
    // row=5            *********
    //
    // row=1, space=1~4, star=5~5
    // row=2, space=1~3, star=4~6
    // row=3, space=1~2, star=3~7
    // row=4, space=1~1, star=2~8
    // row=5, space=1~0, star=1~9
    for (int row = 1; row <= 5; row++) {
      for (int space = 1; space <= 5 - row; space++) {
        System.out.print(" ");
      }
      for (int star = 6 - row; star <= row + 4; star++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void ex08() {
    // �ﰢ�� ����ϱ� - 4 (2�� loop)
    // space/star = 123456789
    //              *********
    //               *******
    //                *****
    //                 ***
    //                  *

    for (int i = 5; i > 0; i--) {
      for (int j = 5 - i; j > 0; j--) {
        System.out.print(" ");
      }
      for (int k = i * 2 - 1; k > 0; k--) {
        System.out.print("*");
      }
      System.out.println();
    }

    for (int row = 0; row < 5; row++) {
      for (int space = 0; space < row; space++) {
        System.out.print(" ");
      }
      for (int star = row; star < 9 - row; star++) {
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