package ex03_operator;

public class MainWrapper {

  // ex01 �޼ҵ� ����� (�޼ҵ� ����)
  // ���� �Ǽ� ����
  public static void ex01() {

    // ���� ����
    int a = 5;
    int b = 2;
    int add = a + b; // a�� b ���ؼ� add�� ����
    int sub = a - b;
    int mul = a * b;
    int mok = a / b; // ��(mok)
    int mod = a % b; // ������

    System.out.println(add);
    System.out.println(sub);
    System.out.println(mul);
    System.out.println(mok);
    System.out.println(mod);

    // �Ǽ� ����
    double x = 5;
    double y = 2;
    double addResult = x + y;
    double subResult = x - y;
    double mulResult = x * y;
    double divResult = x / y; // ������. �Ǽ��� ������ �� �� ���� �����⵵ �׳� ���ϸ� ��. ��� ������ �ʿ��ϸ� ������

    System.out.println(addResult);
    System.out.println(subResult);
    System.out.println(mulResult);
    System.out.println(divResult);

    // �������� ����ؼ� �Ǽ� ��� ����
    int i = 5;
    int j = 2;
    double result = (double) i / j; // ĳ���� ����� i, i�� �Ǽ� 5.0���� �ٲ㵵 j�� �ڹٿ��� �ڵ���ȯ
    System.out.println(result);
  }

  // ex02 ���� ������
  public static void ex02() {

    // ���� ����(++, --)

    // ���� ����(���� ����)
    int a = 10;
    System.out.println(++a); // a�� ������Ų �� ���
    System.out.println(a); // 11 11

    // ���� ����(���߿� ����)
    int b = 10;
    System.out.println(b++); // b�� ����� �� ������Ŵ
    System.out.println(b); // 10 11
  }

  // ex03 ���� ����
  public static void ex03() {
    // ���� ����
    int a = 10;
    int b = a;
    System.out.println(a);
    System.out.println(b);

    // ���� ����(���� ���� ����)
    int x = 10;
    int y = 1;
    y += x; // y=y+x
    System.out.println(x);
    System.out.println(y);
  }

  // ex04 ���� ����, �� ����
  public static void ex04() {
    // ���� ����(ũ�� ��)
    int a = 3;
    int b = 5;

    boolean result1 = a > b; // a�� b���� ũ�� T, �ƴϸ� F
    boolean result2 = a >= b; // a�� b���� ũ�ų� ������ T, �ƴϸ� F
    boolean result3 = a < b;
    boolean result4 = a <= b;
    boolean result5 = a == b; // a�� b�� ������ T, �ƴϸ� F
    boolean result6 = a != b; // a�� b�� �ٸ��� T, ������ F

    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);
    System.out.println(result4);
    System.out.println(result5);
    System.out.println(result6);

    // �� ����
    // 1. �� AND : &&, ��� ������ �����ϸ� T, �ƴϸ� F
    // 2. �� OR : ||, �ϳ��� �����̶� �����ϸ� T, �ƴϸ� F
    // 3. �� NOT : ! , ���� ����� T�̸� F, F�� T
    int x = 10;
    int y = 20;

    boolean andResult = (x == 10) && (y == 10);
    boolean orResult = (x == 10) || (y == 10);
    boolean notResult = !(x == 10);
    System.out.println(andResult);
    System.out.println(orResult);
    System.out.println(notResult);
  }

  public static void main(String[] args) {
//    ex01(); // ex01 �޼ҵ� ���� (�޼ҵ� ȣ��)
//    ex02();
//    ex03();
    ex04();
  }

}
