package ex04_override;

/*
 * 메소드 오버라이드(method override)
 * 1. 슈퍼 클래스의 메소드를 서브 클래스가 다시 만드는 것 (메소드 덮어쓰기)
 * 2. 오버라이드하는 메소드는 @Override Annotation을 추가하는 것이 좋음 (권장이지만 필수로 하자)
 * 3. 반드시 동일한 모습으로 오버라이드해야 함
 */

public class CafeLatte extends Espresso {
  @Override //오버라이드한 메소드 (덮어쓰기하는 메소드), @Override를 붙여주면 문법 체크를 해주고 슈퍼 클래스랑 다르면 오류 표시
  public void taste() {
    System.out.println("라떼 맛");
  }
}
