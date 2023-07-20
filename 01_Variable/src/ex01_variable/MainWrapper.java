package ex01_variable;

public class MainWrapper {

  public static void main(String[] args) {
    // single comment (한 줄 주석)
    /*
     * multiple comment (여러 줄 주석)
     */

    /*
     * '/*' 적고 엔터 누르면 자동으로 만들어짐
     */

    /*
     * 키워드 규칙 1. 프로젝트 : 맘대로 2. 패키지 : 모두 소문자로 작성(실무는 회사 도메인 거꾸로 작성: com.samsung.xxx)
     * 3. 클래스 : UpperCamelCase (첫 글자 대문자 카멜 케이스) 4. 메소드 : lowerCamelCase (첫 글자 소문자
     * 카멜 케이스) 5. 변수 : lowerCamelCase 6. 상수 : SANLE_CASE (대문자를 밑줄로 연결)
     */

    // 들여쓰기는 필수. 코드가 개발자의 얼굴

    // 변수 선언
    // primitive type -1 : 논리타입
    boolean isGood = true;
    boolean isAlive = false;
    System.out.println(isGood);
    System.out.println(isAlive);

    // primitive type -2 : 문자타입
    char ch1 = 'A';
    char ch2 = '가';
    System.out.println(ch1);
    System.out.println(ch2);

    // primitive type -3 : 정수타입
    int score = 100;
    long money = 1000000000L; // L(l) 안붙여주면 범위 이탈
    System.out.println(score);
    System.out.println(money);

    // primitive type -4 : 실수타입
    double commission = 0.5;
    System.out.println(commission);

    // 상수
    final double PI = 3.141592;
    System.out.println(PI);

    // reference type : 참조타입

    // ┌--------------┐
    // name│ 0x12345678 │
    // │--------------│
    // │ ... │
    // │--------------│
    // │ tom │0x12345678
    // │--------------│
    // │ ... │
    // └--------------┘

    String name = "tom";
    System.out.println(name);

  }

}
