package ex01_one_dim;

import java.util.Arrays;

public class MainWrapper {

  /*
   * �迭
   * 1. ���� ������ �ϳ��� �̸����� �����ϴ� �ڷᱸ��
   * 2. �迭�� ����� ��� ������ �̸��� ������, �ε����� �ٸ� (�ε����� ����)
   * 3. �ε����� �迭�� ��� ������ �����ϱ� ���� ��ġ ����. 0���� 1�� �����ϴ� ��
   * 4. �⺻ ���
   *    1) �迭�� : ��� ������ ��ǥ �̸�
   *    2) �ε��� : ÷��, ��� ������ �����ϴ� ����
   *    3) �迭��� : �迭�� ���� �� ������ �ǹ�
   */

  /*
   * �迭�� ���� & ����
   * 1. �迭 ����
   *    1) int[] �迭�� -- ��õ
   *    2) int �迭��[] -- c�迭���� ���� �� �ڹٿ����� �Բ� ����
   * 2. �迭 ���� (=������ ���� �����ϴ� ��)
   *    �迭�� = new int[������ ������ ����]
   */

  /*
   * �迭���
   * 1. �迭�� ����� �� ������ �ǹ�
   * 2. �Ϲ� ������ �ٸ��� �ڵ����� �ʱ�ȭ
   *    0(����), 0.0(�Ǽ�), false(boolean), null(����) ������ �ʱ�ȭ
   * 3. �迭 ��� ȣ����
   *    �迭��[�ε���]
   */

  public static void ex01() {
    // �迭�� ����
    int[] a;

    // �迭�� ����
    a = new int[5];

    // �迭��� Ȯ��
    System.out.println(a[0]);
    System.out.println(a[1]);
    System.out.println(a[2]);
    System.out.println(a[3]);
    System.out.println(a[4]);
    //    System.out.println(a[5]); // �ε����� ������ ��� �迭��� : ���ܹ߻�
  }

  public static void ex02() {
    // �迭�� ������ ������ ������ ������ '�迭�� ����'��� ǥ��
    int length = 5;

    // �迭�� ���� & ����
    int[] a = new int[length];

    // �迭��Ҹ� �ϳ��� ���������� for������ �����غ���
    for (int i = 0; i < length; i++) {
      System.out.println(a[i]); // a[0], a[1], a[2], a[3], a[4] ������� ȣ��
    }
  }

  public static void ex03() {
    // �迭�� ���� & ����
    int[] a = new int[5];

    // �迭�� ��ȸ(�迭 ��� for������ �ϳ��� ����)
    // �迭�� ���̴� '�迭��.length'�� �˾Ƴ� �� ����
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
  }

  /*
   * �迭�� �ʱ�ȭ
   * 1. �迭�� �����ϸ� �ڵ����� �ʱ�ȭ��(0(����), 0.0(�Ǽ�), false(boolean), null(����) ������ Ÿ�Կ� �°� �ʱ�ȭ)
   * 2. �߰�ȣ({})�� �̿��ؼ� �ʱ�ȭ �ϰ��� �ϴ� ���� ������ �� ����
   * 3. �迭�� �ʱ�ȭ�� �迭�� ������ ���� ��� ����
   * 4. ����
   *    int[] a = {10, 20, 30}; 
   */

  public static void ex04() {
    // �迭�� �ʱ�ȭ
    int[] a = { 10, 20, 30 };

    // �迭�� ��ȸ
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
  }

  public static void ex05() {
    int day = 14;
    int nDay = 10;
    day += nDay; // 14�Ϸκ��� 10�� ��

    String[] weeknames = { "��", "��", "��", "��", "ȭ", "��", "��" };
    System.out.println(day + "���� " + weeknames[day % 7] + "�����Դϴ�.");
  }

  /*
   * �迭�� ����
   * 1. �迭�� Ÿ���� ���� Ÿ��(reference type)
   * 2. �迭�� ��� ��Ҵ� ������� �޸��� ���ӵ� ������ �Ҵ����
   * 
   *    int[] a = {10, 20, 30};
   * 
   *    ��--------------��
   *   a��  0x10000000  ��
   *    ��--------------��
   *    ��     ...      ��
   *    ��--------------��
   *    ��      10      ��0x10000000
   *    ��--------------��
   *    ��      20      ��0x10000004 //int = 4����Ʈ�� ���� ũ�� 4����Ʈ ����
   *    ��--------------��
   *    ��      30      ��0x10000008
   *    ��--------------��
   */

  public static void ex06() {
    // �迭�� ���� & ����
    int a[] = new int[5];

    // �迭�� Ȯ��
    System.out.println(a); // [I@1c4af82c @�޺κ��� �迭�� ������(�ּҰ�)

  }

  public static void ex07() {
    // �迭�� �ʱ�ȭ
    int[] a = { 10, 20, 30 };
    // �迭�� ����
    int[] b;

    // b�� 10, 20, 30�� �־��ַ���?
    // �迭 a�� ���� ���� �迭 b�� �����ϸ�, �迭 a�� b�� ������ �޸� ������ ������ �� ����
    b = a;

    // �迭 ��ȸ
    for (int i = 0; i < b.length; i++) {
      System.out.println(b[i]);
    }

    /*
     *    ��--------------��
     *   a��  0x10000000  ��---------------
     *    ��--------------��              ��
     *    ��     ...      ��              ��
     *    ��--------------��              ��
     *    ��      10      ��0x10000000    ��
     *    ��--------------��              ��
     *    ��      20      ��0x10000004    �� b = a;
     *    ��--------------��              ��
     *    ��      30      ��0x10000008    ��
     *    ��--------------��              ��
     *    ��     ...      ��              ��
     *    ��--------------��              ��
     *   b��  0x10000000  ����-------------
     *    ��--------------��              
     */

  }

  public static void ex08() {
    // �迭�� �����Ǹ� �迭�� ���� ������ �Ұ���
    // ���̸� ����(��κ� �ø��� ��)�Ϸ��� ���� �迭�� ���� ���� �迭 ������ �������� ��

    // ���� �迭
    int[] a = { 10, 20, 30 };

    // �ű� �迭
    int[] b = new int[5];

    // �ű� �迭 <- ���� �迭

    //    for (int i = 0; i < a.length; i++) {
    //      b[i] = a[i];
    //    }

    // �� �����ϰ� ó���ϴ� ��
    System.arraycopy(a, 0, b, 0, a.length); // (���� �迭, �����迭 ���� �ε���, ������ �迭, ������ �迭�� ���� �ε���, ���� �ε��� ����)

    System.out.println("�迭 a");
    System.out.println(a);
    System.out.println(Arrays.toString(a));// �迭 a Ȯ��
    System.out.println("�迭 b");
    System.out.println(b);
    System.out.println(Arrays.toString(b));// �迭 b Ȯ��

    // ��������� ���������� ���� �ȵ�. ���� �迭�� ������� �� �ƴ϶� �� ���븸 �Ű��ִ� �Ŵϱ�
    // ���� �ذ�� = ���� �迭 a�� ���� ���� ���ο� �迭 b�� ���� ������ �����ϱ�
    a = b;

    // ���� �� �̻� �迭 a�� �����ϴ� 0x10000000 ������ �����ϴ� ������ ���� a��� �迭 ��ü�� �����
    // 0x10000000 ����(0x10000000, 0x10000004, 0x10000008)�� �����ϴ� �迭�� ����� -> �޸� ���� �߻�
    // �̷� ������ c++���� ������ delete �������� �����ڰ� ���� �޸𸮸� �����ؾ� ������ java�� ������ �޸𸮸� ������
    // (garbage collector�� ��� : System.gc())

    System.out.println("�迭 a");
    System.out.println(a);
    System.out.println(Arrays.toString(b));// �迭 a Ȯ��

  }

  public static void main(String[] args) {
    //    ex01();
    //    ex02();
    //    ex03();
    //    ex04();
    //    ex05();
    //    ex06();
    ex07();
    //    ex08();
  }

}