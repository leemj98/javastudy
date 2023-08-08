package ex02_finally;

import java.util.Scanner;

// finally 블록
// 1. try-catch 문의 마지막 블록으로 추가할 수 있음 (생략 가능)
// 2. 예외 발생 여부와 상관없이 "항상 마지막"에 무조건 실행됨

public class MainWrapper {

  public static void main(String[] args) {

    // 나이를 입력 받아서 20살 이상 "주류 구매 가능", 20살 이하 "주류 구매 불가능" 출력하기
    
    //try 블록과 finally 블록에서 모두 사용할 수 있도록 scope 조정 (try에서 선언 초기화했다가 try 블록 밖으로 옮긴것)
    Scanner sc = null; // 선언

    try {
      sc = new Scanner(System.in); // 생성
      System.out.println("몇 살이세요?");
      int age = sc.nextInt();
      System.out.println(age >= 20 ? "주류 구매 가능" : "주류 구매 불가능");
    } catch (Exception e) {
      System.out.println("예외");
    } finally {
      sc.close(); //close가 catch 블록으로 넘어가더라도 항상 실행되도록
      // finally는 주로 자원 반납용으로 사용됨.
    }

  }
}
