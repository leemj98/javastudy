package ex;

public class MainWrapper {
  
  public static void ex01() {
    System.out.println("파라미터가 없는 ex01");
  }
  
  public static void ex01(String str) {
    System.out.println("파라미터가 없는 ex01");
  }
  
  public static void main(String[] args) {
    ex01(); // ex01() 메소드에 전달하는 인수가 없다
    ex01("hello world"); // ex01() 메소드에 인수 "hello world"를 전달
  }
}
