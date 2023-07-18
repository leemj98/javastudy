package ex;

public class MainWrapper2 {
  // 데이터를 전달할 때
  // 매개변수에서 수정하면 거기서만 수정됨

  public static void ex01(int a, int b) {
    System.out.println(a + ", " + b);
    a++;
    b++;
    System.out.println("ex01의 a = " + a);
    System.out.println("ex01의 b = " + b);
  }

  public static void main(String[] args) {

    int a = 10;
    int b = 20;
    ex01(a, b); // 10, 20 출력
    System.out.println("main의 a = " + a);
    System.out.println("main의 b = " + b);
  }

}
