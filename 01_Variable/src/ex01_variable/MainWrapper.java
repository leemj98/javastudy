package ex01_variable;

public class MainWrapper {

  public static void main(String[] args) {
    // single comment (�� �� �ּ�)
    /*
     * multiple comment (���� �� �ּ�)
     */

    /*
     * '/*' ���� ���� ������ �ڵ����� �������
     */

    /*
     * Ű���� ��Ģ 1. ������Ʈ : ����� 2. ��Ű�� : ��� �ҹ��ڷ� �ۼ�(�ǹ��� ȸ�� ������ �Ųٷ� �ۼ�: com.samsung.xxx)
     * 3. Ŭ���� : UpperCamelCase (ù ���� �빮�� ī�� ���̽�) 4. �޼ҵ� : lowerCamelCase (ù ���� �ҹ���
     * ī�� ���̽�) 5. ���� : lowerCamelCase 6. ��� : SANLE_CASE (�빮�ڸ� ���ٷ� ����)
     */

    // �鿩����� �ʼ�. �ڵ尡 �������� ��

    // ���� ����
    // primitive type -1 : ��Ÿ��
    boolean isGood = true;
    boolean isAlive = false;
    System.out.println(isGood);
    System.out.println(isAlive);

    // primitive type -2 : ����Ÿ��
    char ch1 = 'A';
    char ch2 = '��';
    System.out.println(ch1);
    System.out.println(ch2);

    // primitive type -3 : ����Ÿ��
    int score = 100;
    long money = 1000000000L; // L(l) �Ⱥٿ��ָ� ���� ��Ż
    System.out.println(score);
    System.out.println(money);

    // primitive type -4 : �Ǽ�Ÿ��
    double commission = 0.5;
    System.out.println(commission);

    // ���
    final double PI = 3.141592;
    System.out.println(PI);

    // reference type : ����Ÿ��

    // ��--------------��
    // name�� 0x12345678 ��
    // ��--------------��
    // �� ... ��
    // ��--------------��
    // �� tom ��0x12345678
    // ��--------------��
    // �� ... ��
    // ��--------------��

    String name = "tom";
    System.out.println(name);

  }

}
