package ex01_one_dim;

import java.util.Arrays;

public class MainWrapper {

  public static void ex01() {
    // ���� ���� ����    �� % 12
    // 3 ~ 5 : ��        3 ~ 5
    // 6 ~ 8 : ����      6 ~ 8
    // 9 ~ 11: ����      9 ~ 11
    // 12 ~ 2: �ܿ�      0 ~ 2
    int month = 12;
    String[] seasons = { "�ܿ�", "��", "����", "����" };
    // �ڵ� 1�ٷ� �ذ��� ��

  }

  public static void ex02() {
    // 10, 20, 30, 40, 50�� �迭 a�� �����ϰ� ����ϱ�
    // �迭 a: [10, 20, 30, 40, 50]
    int[] a = new int[5];
    // �迭�� �ε��� �� ���� ��� ����

    a[0] = 10;
    a[1] = 20;
    a[2] = 30;
    a[3] = 40;
    a[4] = 50;
  }

  public static void ex03() {
    // 'A', 'B', 'C', ...'Z'�� �迭 a�� �����ϰ� ����ϱ�
    // �迭 a: [A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z]
    char[] a = new char[26];
    char ch = 'A';

    for (int i = 0; i < a.length; i++) {
      a[i] = ch;
      ch++;
    }
    System.out.print(Arrays.toString(a));
  }

  public static void ex04() {
    // �迭 a�� ������ 3�� ��� 0�� �迭 b�� ��ҷ� �ٲٱ�
    // �迭 a: [10, 20, 30, 40, 50, 60]
    int[] a = { 10, 20, 30, 0, 0, 0 };
    int[] b = { 40, 50, 60 };

    for (int i = 0; i < b.length; i++) {
      a[i + 3] = b[i];
    }
    System.out.print(Arrays.toString(a));
  }

  public static void ex05() {
    // 10����(int number)�� 2����(int[] binary)�� ��ȯ�ϱ�
    // 10���� 35 = 2���� 0000100011
    int number = 35; //  35�� 2������ ��ȯ�ϸ� �Ʒ��� ����.
                     // ��------------------------------------------------��
    int[] binary = new int[10]; // �� 0 �� 0 �� 0 �� 0 �� 1 �� 0 �� 0 �� 0 �� 1 �� 1 ��
                                // ��------------------------------------------------��

    for (int i = 0; i < 10; i++) {
      binary[i] = number % 2;
      number = number / 2;
    }

  }

  public static void ex06() {
    // �迭�� ����� ������ ���, �ִ�, �ּڰ� ���ϱ�
    // ���: 84.8��
    // �ִ�: 100��
    // �ּ�: 70��
    int[] score = { 100, 70, 95, 83, 76 };
    int total = score[0]; // �հ�(����� ���� �� �ʿ��� ����)
    int max = score[0]; // �ִ�
    int min = score[0]; // �ּڰ�

    for (int i = 0; i < score.length; i++) {
      total += score[i];
    }
  }

  public static void main(String[] args) {
    //    ex01();
    //    ex02();
    //    ex03();
    //    ex04();
    ex05();
    //    ex06();
  }

}