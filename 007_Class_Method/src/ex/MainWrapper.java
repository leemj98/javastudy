package ex;

public class MainWrapper {
  
  public static void ex01() {
    System.out.println("�Ķ���Ͱ� ���� ex01");
  }
  
  public static void ex01(String str) {
    System.out.println("�Ķ���Ͱ� ���� ex01");
  }
  
  public static void main(String[] args) {
    ex01(); // ex01() �޼ҵ忡 �����ϴ� �μ��� ����
    ex01("hello world"); // ex01() �޼ҵ忡 �μ� "hello world"�� ����
  }
}
