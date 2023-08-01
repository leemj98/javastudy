package ex01_try_catch;

import java.net.URL;
import java.util.Scanner;

public class MainWrapper {

  public static void ex01() {
    try {
      String name = "tom";
      Integer.parseInt(name); //'tom'을 정수로 바꿔달라 -> NumberFormatException 발생
    } catch (NumberFormatException e) { //Exception = 모든 예외처리, RuntimeException = unchecked Exception 예외처리. 이것들로 적어도 됨
      System.out.println("예외발생");
    }
    // RuntimeException으로 예외처리 가능하면 언체크드, 언체크드 = try catch 없어도 동작가능한 것들

  }

  public static void ex02() {
    
    try {
      Scanner sc = new Scanner(System.in);
      System.out.println("덧셈식을 입력하세요(예 : 1+2)");
      String expr = sc.next();
      String[] numbers = expr.split("[+]");  // numbers = {"1", "2"}
      int number1 = Integer.parseInt(numbers[0]);
      int number2 = Integer.parseInt(numbers[1]);
      System.out.println(number1 + number2);
      sc.close();
    } catch(NumberFormatException e) {
      System.out.println("정수 연산만 가능합니다.");
    } catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("덧셈식에 +를 포함해서 입력하세요.");
    } catch(Exception e) {  // NumberFormatException과 ArrayIndexOutOfBoundsException으로 처리 못하는 예외를 담당한다.
      System.out.println("알 수 없는 예외가 발생했습니다.");
    }
    
  }

  public static void ex03() {

    // 반드시 try - catch가 필요한 예외를 Checked Exception이라고 한다.

    try {
      URL url = new URL("https://www.naver.com");
    } catch (Exception e) {
      System.out.println("예외 발생");
    }

  }

  public static void main(String[] args) {
    ex01();
    ex02();
    ex03();
  }

}
