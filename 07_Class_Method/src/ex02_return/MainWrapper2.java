package ex02_return;

public class MainWrapper2 {

  /*
   * void �޼ҵ��� return
   * 1. ��ȯ���� ���� �޼ҵ�� void Ű���� ���
   * 2. �̷� ��� return; Ű���带 �̿��� �޼ҵ� ������ ������ �� ����
   * 3. return Ű���常 �ۼ��ؾ� �Ѵ� (�� �ۼ����� ���ƾ� ��)
   * 4. return Ű����� �����ϴ� �� void �޼ҵ忡���� ����� �� ����
   */

  public static void main(String[] args) {
    positivePrint(10);
    positivePrint(-10);
  }

  // ���޵� �μ��� ����� ����ϰ� �ƴϸ� ������� �ʴ� positivePrint �޼ҵ�
  public static void positivePrint(int a) {
    if (a < 10) {
      return;
    }
    System.out.println(a);

    //    if(a>=0) {
    //      System.out.println(a);    
    //    } //��� ��� ������ ������ �ڵ���. return ���� ���ǵ� ���� if�� ���� ���̶�

  }

}
