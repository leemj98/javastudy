package ex;

public class MainWrapper {

  public static void main(String[] args) {

    // �� -> ��/��
    int second = 90;
    int m = second / 60; // 1
    int s = second % 60; // 30
    System.out.println(second + "�ʴ�" + m + "�� " + s + "���Դϴ�");

    // x�� y���� ��ȯ
    int x = 10;
    int y = 20;
    int temp = x;
    x = y;
    y = temp;
    System.out.println(x);
    System.out.println(y);

    // 5% ���� ������ �����ܾ� ��?(�Ҽ� ���ϴ� ����)
    long balance = 123456L; // �����ܾ�
    double pct = 0.05; // 5%
    // balance = balance * 1 + balance * pct; //Ÿ�� �ȸ¾Ƽ� ���� '='���� ������ long, ��������
    // double
    // balance = balance * (1+pct); //Ÿ�� �ȸ¾Ƽ� ���� ������ ���� (long)(balance)*(1+pct))
    balance *= (1 + pct); // ���� �� ���ΰ�, ���� �Ǽ��� ���� ���� ���·� ���� ��Ʈ�� �ѱ�� ������ ������ �̰� �ڵ� ��ȯ�� �� �ְ� ���� �ΰ��ΰŶ� ���� �ȳ�
    System.out.println(balance);

    // 90���� �����̸� true, �ƴϸ� false
    int score1 = 95;
    boolean result1 = (score1 >= 90) && (score1 < 100); // true
    int score2 = 75;
    boolean result2 = (score2 / 10) == 9; // false
    System.out.println(result1);
    System.out.println(result2);

    // n�� "¦��", "Ȧ��" ���� ���
    int n = 3;
    String res1 = (n % 2) == 0 ? "¦��" : "Ȧ��"; // "Ȧ��"
    System.out.println(res1);

    // num�� "¦��", "Ȧ��", "3�ǹ��" ���� ���
    int num = 3;
    String res2 = (num != 0) && (num % 3 == 0) ? "3�� ���" : (num % 2) == 0 ? "¦��" : "Ȧ��"; // "3�ǹ��"
    System.out.println(res2); // 0�� 3���� ������ ������ 0���� ����, 3�� 0���� ������ ����

  }

}