package ex03_class;

public class MainWrapper {

  public static void main(String[] args) {

    // Calculator ��ü ����
    Calculator myCalc;

    // Calculator ��ü ����
    myCalc = new Calculator();

    // ����ϰ��� �ϴ� �Ǽ� 2�� �غ�
    double a = 1.5;
    double b = 1.2;

    // ����, ����, ����, ������ �޼ҵ� ȣ��
    System.out.println(myCalc.additon(a, b));
    System.out.println(myCalc.subtraction(a, b));
    System.out.println(myCalc.multiplication(a, b));
    System.out.println(myCalc.division(a, b));
  }

}
