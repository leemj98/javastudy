package ex02_return;

public class MainWrapper2 {

  /*
   * void 메소드의 return
   * 1. 반환값이 없는 메소드는 void 키워드 사용
   * 2. 이런 경우 return; 키워드를 이용해 메소드 실행을 종료할 수 있음
   * 3. return 키워드만 작성해야 한다 (값 작성하지 말아야 함)
   * 4. return 키워드로 종료하는 건 void 메소드에서만 사용할 수 있음
   */

  public static void main(String[] args) {
    positivePrint(10);
    positivePrint(-10);
  }

  // 전달된 인수가 양수면 출력하고 아니면 출력하지 않는 positivePrint 메소드
  public static void positivePrint(int a) {
    if (a < 10) {
      return;
    }
    System.out.println(a);

    //    if(a>=0) {
    //      System.out.println(a);    
    //    } //라고 적어도 되지만 안좋은 코드임. return 종료 조건도 없고 if만 들어가고 끝이라

  }

}
