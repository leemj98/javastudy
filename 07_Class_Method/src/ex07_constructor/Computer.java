package ex07_constructor;

/*
 * 생성자(constructor)
 * 1. 객체를 생성할 때 사용하는 메소드
 * 2. new 키워드 이후에 호출됨
 * 3. 특징
 *  1) 생성자도 메소드임
 *  2) 생성자의 이름은 클래스 이름과 같음. 바꿀 수 없다.
 *  3) 반환(return)이 존재하지 않음. 반환이 없다는 의미의 void가 아니라 반환이라는 개념 자체가 없음.
 *  4) 파라미터는 일반 메소드와 동일하게 사용 가능. 메소드 오버로딩(overloading)이 가능 (생성자를 여러 개 만들 수 있음)
 * 4. 생성자를 안 만들면 java가 "디폴트 생성자" 만듦
 */

/*
 * 디폴트 생성자
 * 1. 개발자가 생성자를 하나도 만들지 않는다면 java가 자동으로 만드는 생성자
 * 2. 파라미터가 없고, 본문이 비어있음
 * 3. 기본 필드값(0, 0.0, false, null)을 가진 객체를 생성할 때 사용 
 */

public class Computer {
  private String model;

  public Computer() {
    System.out.println("Computer() 생성자가 호출되었다.");
  }

  public Computer(String model) {
    System.out.println("Computer(String modle) 생성자가 호출되었다.");
    this.model = model;
  }

  //Setter
  public void setModel(String model) {
    this.model = model;
  }

  //Getter
  public String getModel() {
    return model;
  }

}
