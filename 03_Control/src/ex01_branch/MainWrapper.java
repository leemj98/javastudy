package ex01_branch;

public class MainWrapper {

  /*
   * if�� 
   * 1. ������ �����ϴ� ��쿡�� ������ �� ���� 
   * 3. ���� 
   *  if (���ǽ�) { 
   *    ���๮ 
   *  }
   */

  public static void ex01() {

    int score = 100;
    if (score >= 60) {
      System.out.println("�հ�");
    }

    // �߰�ȣ�� ���๮�� �ϳ��� ��쿡 ������ �� �ִ�.
    if (score < 60)
      System.out.println("���հ�");

  }

  /*
   * else if��
   * 1. if�� ���Ŀ� ���ǽ��� �ʿ��� ��� ����� �� �ִ�.
   * 2. ���ϴ¸�ŭ �ݺ��ؼ� ����� �� �ִ�.
   * 3. ����
   *    if(���ǽ�){
   *      ���๮
   *    }
   *    else if(���ǽ�){
   *      ���๮
   *    }
   *    else if(���ǽ�){
   *      ���๮
   *    }
   */

  public static void ex02() {
    int score = -5;
    if (score < 0 || score > 100) {
      System.out.println("�߸��� ����");
    } else if (score >= 60) {
      System.out.println("�հ�");
    } else if (score < 60) {
      System.out.println("���հ�");
    }
  }

  /*
   * else��
   * 1. if���� �������� �߰��� �� ����
   * 2. ���ǽ��� �ۼ����� ����
   * 3. ����
   *    if(���ǽ�) {
   *      ���๮
   *    } else if(���ǽ�) {
   *      ���๮
   *    } else {
   *      ���๮
   *    }
   */

  public static void ex03() {
    int score = 100;
    if (score < 0 || score > 100) {
      System.out.println("�߸��� ����");
    } else if (score >= 60) {
      System.out.println("�հ�");
    } else {
      System.out.println("���հ�");
    }
  }

  /*
   * switch��
   * 1. ������ ǥ������ ����� ���� �б� ó��(T/F�� ���� �б�ó���� �ƴ�)
   * 2. �Ϲ������� if���� ���� ������ ����
   * 3. �� �б⸦ �����ϴ� case�� default�� ����
   * 4. break�� ���ؼ� switch���� ������ �� ����
   * 5. ����
   *  switch(ǥ����) { //ǥ������ ����� String, char, int�� ���� (boolean, double, long �Ұ�)
   *  case ���1:
   *    ���๮
   *    break;
   *  case ���2:
   *    ���๮
   *    break;
   *  default: //if�� ġ�� else�� ����, break �ʿ����
   *    ���๮
   */

  public static void ex04() {
    int button = 1;

    switch (button) {
    case 1:
      System.out.println("��Ϻ���");
      break;
    case 2:
      System.out.println("�󼼺���");
      break;
    case 3:
      System.out.println("�����ϱ�");
      break;
    case 4:
      System.out.println("�����ϱ�");
      break;
    case 5:
      System.out.println("�����ϱ�");
      break;
    default:
      System.out.println("�߸��� ����");
    }
  }

  public static void main(String[] args) {

//    ex01();
//    ex02();
//    ex03();
    ex04();
  }

}
