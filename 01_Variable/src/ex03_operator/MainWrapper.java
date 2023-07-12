package ex03_operator;

public class MainWrapper {

  // ex01 메소드 만들기 (메소드 정의)
  // 정수 실수 연산
  public static void ex01() {

    // 정수 연산
    int a = 5;
    int b = 2;
    int add = a + b; // a랑 b 더해서 add로 보냄
    int sub = a - b;
    int mul = a * b;
    int mok = a / b; // 몫(mok)
    int mod = a % b; // 나머지

    System.out.println(add);
    System.out.println(sub);
    System.out.println(mul);
    System.out.println(mok);
    System.out.println(mod);

    // 실수 연산
    double x = 5;
    double y = 2;
    double addResult = x + y;
    double subResult = x - y;
    double mulResult = x * y;
    double divResult = x / y; // 나누기. 실수는 나머지 쓸 일 없고 나누기도 그냥 구하면 됨. 몫과 나머지 필요하면 정수로

    System.out.println(addResult);
    System.out.println(subResult);
    System.out.println(mulResult);
    System.out.println(divResult);

    // 정수끼리 계산해서 실수 결과 도출
    int i = 5;
    int j = 2;
    double result = (double) i / j; // 캐스팅 대상은 i, i만 실수 5.0으로 바꿔도 j는 자바에서 자동변환
    System.out.println(result);
  }

  // ex02 증감 연산자
  public static void ex02() {

    // 증감 연산(++, --)

    // 전위 연산(먼저 증감)
    int a = 10;
    System.out.println(++a); // a를 증가시킨 뒤 출력
    System.out.println(a); // 11 11

    // 후위 연산(나중에 증감)
    int b = 10;
    System.out.println(b++); // b를 출력한 뒤 증가시킴
    System.out.println(b); // 10 11
  }

  // ex03 대입 연산
  public static void ex03() {
    // 대입 연산
    int a = 10;
    int b = a;
    System.out.println(a);
    System.out.println(b);

    // 복합 연산(복합 대입 연산)
    int x = 10;
    int y = 1;
    y += x; // y=y+x
    System.out.println(x);
    System.out.println(y);
  }

  // ex04 관계 연산, 논리 연산
  public static void ex04() {
    // 관계 연산(크기 비교)
    int a = 3;
    int b = 5;

    boolean result1 = a > b; // a가 b보다 크면 T, 아니면 F
    boolean result2 = a >= b; // a가 b보다 크거나 같으면 T, 아니면 F
    boolean result3 = a < b;
    boolean result4 = a <= b;
    boolean result5 = a == b; // a와 b가 같으면 T, 아니면 F
    boolean result6 = a != b; // a와 b가 다르면 T, 같으면 F

    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);
    System.out.println(result4);
    System.out.println(result5);
    System.out.println(result6);

    // 논리 연산
    // 1. 논리 AND : &&, 모든 조건이 만족하면 T, 아니면 F
    // 2. 논리 OR : ||, 하나의 조건이라도 만족하면 T, 아니면 F
    // 3. 논리 NOT : ! , 조건 결과가 T이면 F, F면 T
    int x = 10;
    int y = 20;

    boolean andResult = (x == 10) && (y == 10);
    boolean orResult = (x == 10) || (y == 10);
    boolean notResult = !(x == 10);
    System.out.println(andResult);
    System.out.println(orResult);
    System.out.println(notResult);
  }

  public static void main(String[] args) {
//    ex01(); // ex01 메소드 실행 (메소드 호출)
//    ex02();
//    ex03();
    ex04();
  }

}
