package ex02_LOOP;

public class MainWrapper {
  /*
   * for��
   * 1. ���ӵ� ����(����)�� �����ϴ� ������ �ݺ���
   * 2. ����
   *    for(�ʱ갪; ���ǹ�; ������) {
   *      ���๮
   *    }
   * 3. �������
   *    �ʱ갪 -> ���ǹ� -> ���๮ -> ������ -> ���ǹ� -> ���๮ -> ������ -> ���ǹ� -> ...
   */

  public static void ex01() {

    // 1~10 ����ϱ�
    for (int n = 1; n <= 10; n++) {
      System.out.print(n + " "); // 1 2 3 ... 10
    }
    System.out.print("\n");

    // 10~1 ����ϱ�
    for (int i = 10; i >= 1; i--) {
      System.out.print(i + " "); // 10 9 8 ... 1
    }

  }

  public static void ex02() {

    // Ư�� Ƚ����ŭ �ݺ���Ű�� for��
    int count = 5; // 5��
    for (int n = 0; n < count; n++) {
      System.out.println(n + "��");
    }

  }

  /*
   * while��
   * 1. Ư�� ������ �����ϸ� ����Ǵ� �ݺ����̴�.
   * 2. ����
   *    while(���ǹ�){
   *      ���๮
   *    }
   */

  public static void ex03() {

    int n = 0;
    while (n < 10) {
      System.out.println(n);
      n++;
    }
  }

  /*
   * do while��
   * 1. �ݵ�� �� ���� ����Ǵ� while��
   * 2. ����
   *    do {
   *      ���๮
   *    } while(���ǹ�);
   */
  public static void ex04() {
    int n = 100;
    do {
      System.out.println(n);
      n++;
    } while (n < 10);
  }

  /*
   * break��
   * 1. switch���� ����
   * 2. �ݺ���(for, while, do while)�� ����
   */

  public static void ex05() {
    // ���ѷ���(������ �ݺ�) ����� 2���� ���
    // ������ ���� �� ������ ���α׷��� ��κ� ���ѷ��� �����
    // 1. while(true) { } -- ��õ
    // 2. for(;;) { }

    // ���ѷ����� break�� �̿��� 1~10 ���
    int n = 1;
    while (true) {
      if (n > 10) { // n==11�� ��
        break;
      } // ������ ���� �ʹݿ� ����ϴ°� ����
      System.out.println(n);
      n++;
    }
  }

  /*
   * continue��
   * 1. �ݺ����� ���� ���� �������� �ٽ� ����
   * 2. continue�� ������ �ڵ带 ���࿡�� �����ϰ��� �� �� ���
   */

  public static void ex06() {
    // 1~50 ���� ���� �� 7�� ����� �����ϰ� ���
    for (int i = 1; i <= 50; i++) {
      if (i % 7 == 0) {
        continue; // for���� ������(n++)���� ���ư��ÿ�
      }
      System.out.println(i);
    }
  }

  public static void ex07() {

    // ��ø(nested) for��
    for (int day = 1; day <= 5; day++) {
      System.out.println("===" + day + "�����Դϴ�.===");
      for (int hour = 1; hour <= 8; hour++) {
        System.out.println("  " + day + "���� " + hour + "�����Դϴ�.");
      }
    }
  }

  public static void main(String[] args) {
//    ex01();
//    ex02();
//    ex03();
//    ex04();
//    ex05();
//    ex06();
    ex07();
  }
}
