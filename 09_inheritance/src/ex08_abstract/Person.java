package ex08_abstract;

/*
 * 추상 클래스
 * 1. 추상 메소드를 1개 이상 가지고 있는 클래스
 * 2. (public 앞뒤 상관없지만 일반적으로 뒤에) abstract 키워드를 추가한다
 * 3. 추상 클래스는 객체를 생성할 수 없음 (미완성된 클래스이기 때문)
 * 4. 추상 클래스의 서브 클래스는 "반드시" 추상 메소드를 오버라이드해야 함
 */
public abstract class Person {

  public void eat() {
    System.out.println("냠냠");
  }

  public void sleep() {
    System.out.println("쿨쿨");
  }

  // 호출을 위해서 생성한 study
  // 본문이 필요없기 때문에 본문이 없는 메소드로 만들 수 있음
  // 본문이 없는 메소드를 "추상 메소드"라고 함
  // abstract 키워드를 추가하고 본문({ }) 제거
  public abstract void study();

}
