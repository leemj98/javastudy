package ex01_parameter;

public class MainWrapper3 {

  /* �� ����ǥ(ellipsis)
   * 1. �޼ҵ带 �����ϴ� �μ��� Ÿ���� ����������, ������ ���� ���� ��쿡 ���
   * 2. �� ����ǥ(...)�� Ȱ��
   * 3. �� ����ǥ�� ����� ������ �迭�� ó�� 
   */

  public static void main(String[] args) {
    print(10);          // �μ��� ���� 1���̴�.
    print(10, 20);      // �μ��� ���� 2���̴�.
    print(10, 20, 30);  // �μ��� ���� 3���̴�.
  }

  public static void print(int... a) { // �� ����ǥ�� ����� �Ķ���ʹ� ��� �迭
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
  
  }
}
  

