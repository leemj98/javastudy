package ex02_convert_type;

public class MainWrapper {
  public static void main(String[] args) {
    /*
     * �ڵ� ��ȯ(promotion) 1. ���� ũ�� -> ū ũ�� 2. ���� -> �Ǽ�
     */

    byte num1 = 127; // byte�� -128~127 ����
    int num2 = num1; // 1����Ʈ ũ�⸦ ���� num1�� 4����Ʈ ũ��� �ڵ� ��ȯ
    System.out.println(num2);

    double addResult = 1.5 + 5; // 5�� 5.0���� �ڵ� ��ȯ
    System.out.println(addResult);

    /*
     * ���� ��ȯ(casting) 1. ū ũ�� -> ���� ũ�� 2. �Ǽ� -> ����
     */

    int bigNum = 256;
    byte smallNum = (byte) bigNum; // 4����Ʈ bigNum�� ������ 1����Ʈ�� ��ȯ
    System.out.println(smallNum); // 256 2���� = 100000000 ĳ�����ϸ鼭 1�� �߸��� 0�� ����
    // ĳ������ �ϰԵǸ� ������ �ջ�� �� ����

    double pct = 0.5;
    int iPct = (int) pct; // �Ǽ��� ������ ������ ��ȯ -> �Ҽ��� �߷�����
    System.out.println(iPct);

    /*
     * ���� �м�(parsing) 1. ���ڿ� -> ����(int, long) 2. ���ڿ� -> �Ǽ�(double)
     */

    String strScore = "100";
    int score = Integer.parseInt(strScore);

    String strMoney = "1000000000";
    long money = Long.parseLong(strMoney);

    String strComm = "0.5";
    double comm = Double.parseDouble(strComm);

    System.out.println(score);
    System.out.println(money);
    System.out.println(comm);
  }
}
