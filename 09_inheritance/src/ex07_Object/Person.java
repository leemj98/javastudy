package ex07_Object;

import java.util.Objects;

/*
 * java.lang.Object 클래스
 * 1. 모든 클래스의 최상위 슈퍼 클래스
 * 2. 별도의 슈퍼 클래스를 명시하지 않은 클래스들은 (extends가 없는 클래스) 모두 Object 클래스의 서브 클래스
 * 3. 모든 것을 저장할 수 있는 java의 만능 타입 (업캐스트)
 * 4. Object 타입으로 저장하면 Object 클래스의 메소드만 호출할 수 있음 (업캐스팅 단점이랑 똑같)
 * 5. 이를 해결하기 위해서 반드시 (다운)캐스팅 (오버라이딩은 슈퍼 클래스인 object에 직접 코드 추가해야해서 못씀. 주로 다운캐스팅은 오브젝트. 나머지는 오버라이딩 사용)
 */


/*
 *  ┌--------------┐
 *  │  Object      │ 슈퍼 클래스
 *  │--------------│
 *  │  equals()    │ 두 객체의 참조값을 비교해서 같으면 true, 아니면 false 반환
 *  │  getClass()  │ 어떤 클래스인지 반환
 *  │  hashCode()  │ int 타입의 해시코드값, Object 클래스는 객체의 참조값을 해시코드값으로 사용함
 *  │  toString()  │ "클래스이름@참조값" 형식의 문자열을 반환
 *  │  notify()    │ 스레드(thread) 관련 메소드
 *  │  wait()      │ 스레드(thread) 관련 메소드
 *  └--------------┘
 *          ▲
 *          │
 *          │
 *  ┌--------------┐
 *  │  Person      │ 서브 클래스
 *  │--------------│
 *  │  @Override   │
 *  │  equals()    │ 이름과 나이가 같으면 true, 아니면 false 반환 (하드코딩하지 않고, 자동완성한다.) 원래 목적 자체가 이퀄스랑 투스트링은 오버라이드하라고 존재하는것
 *  │  @Override   │
 *  │  toString()  │ 이름과 나이를 확인할 수 있는 문자열 반환 (하드코딩하지 않고, 자동완성한다.)
 *  └--------------┘
 */

public class Person {

  private String name;
  private int age;
  
  // new Person()
  public Person() {
    
  }
  // new Person("홍길동", 20)
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, name);
  }

  @Override
  public boolean equals(Object obj) {
    //예외사항 처리
    if (this == obj) //p1.equals(p1)은 무조건 같다
      return true;
    if (obj == null) //p1.equals(null)은 무조건 다르다
      return false;
    if (getClass() != obj.getClass()) //p1.equals(s1) person과 student, 즉 다른 클래스를 비교하면 무조건 다르다
      return false;
    //
    Person other = (Person) obj; //person 타입으로 obj 캐스팅(다운캐스팅)
    return age == other.age && Objects.equals(name, other.name);
    //age =p1의 age, p.age=p2의 age (나이 비교)
    //스트링의 비교는 스트링이 갖고 있는 메소드 equals 사용 (오브젝트 이퀄스랑 이름 똑같은 다른 메소드) (이름 비교)
  }
  
  
  @Override
  public String toString() {
    return "Person [name=" + name + ", age=" + age + "]";
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