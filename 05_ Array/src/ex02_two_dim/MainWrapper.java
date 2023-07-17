package ex02_two_dim;

public class MainWrapper {

  /*
   * 2���� �迭
   * 1. 1���� �迭�� 2�� �̻� ���� �ڷ� ����
   * 2. ��� ���� ������ ���̺� ������ �����ϸ� ����
   * 3. ����ϴ� �ε����� 2��
   * 4. 2���� �迭�� ��ȸ���� 2���� for�� �ʿ�
   */

  public static void ex01() {
    // 2���� �迭�� ����
    int[][] a;

    // 2���� �迭�� ����
    a = new int[3][2]; // ���̺� ������ ���� : 3�� 2��
                       // ���� ������ ���� : ���̰� 2�� 1���� �迭�� 3��

    // ���̺� ���·� 2���� �迭 ���
    System.out.println(a[0][0] + " " + a[0][1]); // ù ��° �� (ù ��° 1���� �迭)
    System.out.println(a[1][0] + " " + a[1][1]); // �� ��° �� (�� ��° 1���� �迭)
    System.out.println(a[2][0] + " " + a[2][1]); // �� ��° �� (�� ��° 1���� �迭)

  }

  public static void ex02() {
    // 2���� �迭�� ���� & ����
    int[][] a = new int[3][2];

    // �� ��Ҹ� 4�ڸ� ���� ������ ���
    System.out.print(String.format("%4d", a[0][0]));
    System.out.print(String.format("%4d", a[0][1]));
    System.out.println();
    System.out.print(String.format("%4d", a[1][0]));
    System.out.print(String.format("%4d", a[1][1]));
    System.out.println();
    System.out.print(String.format("%4d", a[2][0]));
    System.out.print(String.format("%4d", a[2][1]));
    System.out.println();
  }

  public static void ex03() {
    // 2���� �迭 ���� & ����
    int[][] a = new int[3][2];

    // �ε��� : i, j
    // i : �� or 1���� �迭�� ����
    // j : �� or �� 1���� �迭�� ����

    // 2���� �迭�� 2�� for��
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 2; j++) {
        System.out.print(String.format("%4d", a[i][j]));
      }
      System.out.println();
    } // ex02�� for������ �ٲ� ��
  }

  /*
   * 2���� �迭�� �ʱ�ȭ
   * 
   *  int[][] a = {
   *    {10,20},
   *    {30,40},
   *    {50,60}
   *  };
   *  
   */

  public static void ex04() {
    // 2���� �迭�� �ʱ�ȭ
    int[][] a = { { 10, 20 }, { 30, 40 }, { 50, 60 } };

    //2�� for��
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 2; j++) {
        System.out.print(String.format("%4d", a[i][j]));
      }
      System.out.println();
    }
  }

  /*
   * 2���� �迭�� ����
   * 
   * int[][] a = {
   *   {10, 20},
   *   {30, 40},
   *   {50, 60}
   * };
   * 
   *     ��--------------��
   *    a��  0x10000000  ��----��
   *     ��--------------��    �� a.length == 3
   *     ��     ...      ��    ��
   *     ��--------------��    ��
   *     ��              ��0x10000000
   * a[0]��  0xA0000000  ��----��
   *     ��              ��    ��    
   *     ��--------------��    ��a[0].length == 2
   *     ��              ��    ��
   * a[1]��  0xB0000000  ��----��------��
   *     ��              ��    ��      ��
   *     ��--------------��    ��      ��a[1].length == 2
   *     ��              ��    ��      ��
   * a[2]��  0xC0000000  ��----��------��------��
   *     ��              ��    ��      ��      ��
   *     ��--------------��    ��      ��      ��a[2].length == 2
   *     ��     ...      ��    ��      ��      ��
   *     ��--------------��    ��      ��      ��
   *     ��      10      ��0xA0000000  ��      ��
   *     ��--------------��            ��      ��
   *     ��      20      ��0xA0000004  ��      ��
   *     ��--------------��            ��      ��
   *     ��     ...      ��            ��      ��
   *     ��--------------��            ��      ��
   *     ��      30      ��0xB0000000����      ��
   *     ��--------------��                    ��
   *     ��      40      ��0xB0000004          ��
   *     ��--------------��                    ��
   *     ��     ...      ��                    ��
   *     ��--------------��                    ��
   *     ��      50      ��0xC0000000��--------��
   *     ��--------------��
   *     ��      60      ��0xC0000004
   *     ��--------------��
   *     ��     ...      ��
   *     ��              ��
   *     ��--------------��
   */

  public static void ex05() {
    //2���� �迭�� ���� & ����
    int[][] a = { { 10, 20 }, { 30, 40 }, { 50, 60 } };
    //2���� �迭�� 2�� for�� ���� ����
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        System.out.print(String.format("%4d", a[i][j]));
      }
      System.out.println();
    }
  }

  public static void ex06() {
    // java���� ��� ���� ������ ������ �ʿ� ���� (c�迭�� ���ƾ� ��)
    int[][] a = { { 10 }, { 20, 30 }, { 40, 50, 60 } };
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        System.out.print(String.format("%4d", a[i][j]));
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
    ex06();
  }

}
