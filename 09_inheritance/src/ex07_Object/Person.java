package ex07_Object;

/*
 * Object 클래스
 * 1. 모든 클래스의 최상위 슈퍼 클래스
 * 2. 별도의 슈퍼 클래스를 명시하지 않은 클래스들은 (extends가 없는 클래스) 모두 Object 클래스의 서브 클래스
 * 3. 모든 것을 저장할 수 있는 java의 만능 타입 (업캐스트)
 * 4. Object 타입으로 저장하면 Object 클래스의 메소드만 호출할 수 있음 (업캐스팅 단점이랑 똑같)
 * 5. 이를 해결하기 위해서 반드시 (다운)캐스팅 (오버라이딩은 슈퍼 클래스인 object에 직접 코드 추가해야해서 못씀. 주로 다운캐스팅은 오브젝트. 나머지는 오버라이딩 사용)
 */

public class Person {

  private String name;
  private int age;

  //new Person() 
  public Person() {

  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
}

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

}