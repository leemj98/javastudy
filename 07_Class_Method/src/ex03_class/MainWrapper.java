package ex03_class;

public class MainWrapper {

  public static void main(String[] args) {

    // Calculator °´Ã¼ ¼±¾ð
    Calculator myCalc;

    // Calculator °´Ã¼ »ý¼º
    myCalc = new Calculator();

    // °è»êÇÏ°íÀÚ ÇÏ´Â ½Ç¼ö 2°³ ÁØºñ
    double a = 1.5;
    double b = 1.2;

    // µ¡¼À, »¬¼À, °ö¼À, ³ª´°¼À ¸Þ¼Òµå È£Ãâ
    System.out.println(myCalc.additon(a, b));
    System.out.println(myCalc.subtraction(a, b));
    System.out.println(myCalc.multiplication(a, b));
    System.out.println(myCalc.division(a, b));
  }

}
