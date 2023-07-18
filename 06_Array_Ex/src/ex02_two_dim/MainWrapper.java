package ex02_two_dim;

public class MainWrapper {

  public static void ex01() {
    // 2~9�ܱ��� ��ü ������ ��� �����ϰ� ����ϱ�
    //  2   4   6   8  10  12  14  16  18
    //  3   6   9  12  15  18  21  24  27
    //  4   8  12  16  20  24  28  32  36
    //  5  10  15  20  25  30  35  40  45
    //  6  12  18  24  30  36  42  48  54
    //  7  14  21  28  35  42  49  56  63
    //  8  16  24  32  40  48  56  64  72
    //  9  18  27  36  45  54  63  72  81
    int[][] gugudan = new int[8][9];
    
    for (int i = 0; i < gugudan.length; i++) {
      for (int j = 0; j < gugudan[i].length; j++) {
        gugudan[i][j] = (i + 2) * (j + 1);

        System.out.print(String.format("%4d", gugudan[i][j]));
      }
      System.out.println();
    }
  }

  public static void ex02() {
    // ����Ʈ ����ϱ� - 1
    // 101ȣ: 3��
    // 102ȣ: 4��
    // 201ȣ: 2��
    // 202ȣ: 2��
    // 301ȣ: 4��
    // 302ȣ: 6��
    // 401ȣ: 3��
    // 402ȣ: 5��
    // 501ȣ: 4��
    // 502ȣ: 4��
    int[][] apt = { { 3, 4 }, // 101ȣ, 102ȣ
        { 2, 2 }, // 201ȣ, 202ȣ
        { 4, 6 }, // 301ȣ, 302ȣ
        { 3, 5 }, // 401ȣ, 402ȣ
        { 4, 4 } // 501ȣ, 502ȣ
    };

    for (int i = 0; i < apt.length; i++) {
      for (int j = 0; j < apt[i].length; j++) {
        System.out.println((i + 1) + "0" + (j + 1) + "ȣ: " + apt[i][j] + "��");
      }
    }
  }

  public static void ex03() {
    // ����Ʈ ����ϱ� - 2
    // 1��: 7��
    // 2��: 4��
    // 3��: 10��
    // 4��: 8��
    // 5��: 8��
    int[][] apt = { { 3, 4 }, // 1��
        { 2, 2 }, // 2��
        { 4, 6 }, // 3��
        { 3, 5 }, // 4��
        { 4, 4 } // 5��
    };

    for (int i = 0; i < apt.length; i++) {
      int sum = 0;
      for (int j = 0; j < apt[i].length; j++) {
        sum += apt[i][j];
      }
      System.out.println((i + 1) + "��: " + sum + "��");
    }

  }

  public static void ex04() {
    // �ð�ǥ ����ϱ�
    // ������: ���� ���� ���� ü��
    // ȭ����: �̼� ���� ����
    // ������: ��ȸ ���� ���� ���� ����
    // �����: ���� ���� ����
    // �ݿ���: ���� ���� ü�� ����
    String[] weekname = { "������", "ȭ����", "������", "�����", "�ݿ���" };
    String[][] timeTable = { { "����", "����", "����", "ü��" }, { "�̼�", "����", "����" }, { "��ȸ", "����", "����", "����", "����" },
        { "����", "����", "����" }, { "����", "����", "ü��", "����" } };


    for (int i = 0; i < weekname.length; i++) {
      System.out.print(weekname[i] + ": ");

      for (int j = 0; j < timeTable[i].length; j++) {
        System.out.print(timeTable[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void ex05() {
    // 2���� �迭 90�� ȸ���ϱ�(�迭 a�� 90�� ȸ���� ����� �迭 b�� ������ ��, �迭 a�� �迭 b�� �״�� ��������)
    //   1 1 1 1 1          0 0 0 0 1
    //   0 0 1 0 0          0 0 0 0 1
    //   0 0 1 0 0   --->   1 1 1 1 1
    //   0 0 1 0 0          0 0 0 0 1
    //   0 0 1 0 0          0 0 0 0 1
    // �迭 a�� ��°��
    //   00001
    //   00001
    //   11111
    //   00001
    //   00001
    int[][] a = { { 1, 1, 1, 1, 1 }, { 0, 0, 1, 0, 0 }, { 0, 0, 1, 0, 0 }, { 0, 0, 1, 0, 0 }, { 0, 0, 1, 0, 0 } };
    int[][] b = new int[5][5];

    for (int i = 0; i < b.length; i++) {
      for (int j = 0; j < b.length; j++) {
        b[j][i] = a[i][j + 1];
      }
      System.out.println(b);
    }
  }

  public static void main(String[] args) {
    ex01();
    //    ex02();
    //    ex03();
    //    ex04();
    //    ex05();
  }

}