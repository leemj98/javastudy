package ex04_catch;

public class MainWrapper {

  public static void ex01() {

    try {

      //      // 1. java가 처리한 예외
      //      int a = 5 / 0;
      //      System.out.println(a); //5/0은 불가능

      //2. 개발자가 처리한 예외
      throw new RuntimeException("개발자 예외"); // "개발자 예외"가 예외 메시지로 등록됨

    } catch (Exception e) {
      // 예외 클래스 확인하기
      System.out.println(e.getClass().getName()); //Object의 메소드 활용, java.lang.ArithmeticException 나옴

      // 예외 메시지 확인하기 (예외가 발생한 이유)
      System.out.println(e.getMessage()); // / by zero

    }
  }

  public static void ex02(String name) {

    try {
      System.out.println(name.substring(0, 1));
    } catch (Exception e) {
      e.printStackTrace(); //예외추적 메시지를 출력 (개발 중에는 예외를 추적하는 것이 중요하므로 이것만 사용)
    }
  }

  public static void main(String[] args) {
    ex02(null);
  }
}
