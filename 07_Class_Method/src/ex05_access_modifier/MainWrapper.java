package ex05_access_modifier;

public class MainWrapper {

  public static void main(String[] args) {

    // User 객체(객체명 u) 새엇ㅇ
    User u = new User();

    // User 객체에 데이터 저장
    u.setId("admin");
    u.setAge(30); // 30이 User.java에서 setAge 파라미터 거쳐서 age 필드로 전달

    // User 객체의 데이터 확인
    System.out.println(u.getId());
    System.out.println(u.getAge());
  }

}
