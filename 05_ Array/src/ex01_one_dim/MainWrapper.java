package ex01_one_dim;

import java.util.Arrays;

public class MainWrapper {

  /*
   * 배열
   * 1. 여러 변수를 하나의 이름으로 관리하는 자료구조
   * 2. 배열에 저장된 모든 변수는 이름은 같지만, 인덱스가 다름 (인덱스로 구분)
   * 3. 인덱스란 배열의 모든 변수를 구분하기 위한 위치 정보. 0부터 1씩 증가하는 값
   * 4. 기본 용어
   *    1) 배열명 : 모든 변수의 대표 이름
   *    2) 인덱스 : 첨자, 모든 변수를 구분하는 숫자
   *    3) 배열요소 : 배열에 속한 각 변수를 의미
   */

  /*
   * 배열의 선언 & 생성
   * 1. 배열 선언
   *    1) int[] 배열명 -- 추천
   *    2) int 배열명[] -- c계열에서 나온 것 자바에서도 함께 쓰임
   * 2. 배열 생성 (=변수의 갯수 결정하는 것)
   *    배열명 = new int[생성할 변수의 갯수]
   */

  /*
   * 배열요소
   * 1. 배열에 저장된 각 변수를 의미
   * 2. 일반 변수와 다르게 자동으로 초기화
   *    0(정수), 0.0(실수), false(boolean), null(참조) 값으로 초기화
   * 3. 배열 요소 호출방법
   *    배열명[인덱스]
   */

  public static void ex01() {
    // 배열의 선언
    int[] a;

    // 배열의 생성
    a = new int[5];

    // 배열요소 확인
    System.out.println(a[0]);
    System.out.println(a[1]);
    System.out.println(a[2]);
    System.out.println(a[3]);
    System.out.println(a[4]);
    //    System.out.println(a[5]); // 인덱스의 범위를 벗어난 배열요소 : 예외발생
  }

  public static void ex02() {
    // 배열에 저장할 변수의 갯수를 앞으로 '배열의 길이'라고 표현
    int length = 5;

    // 배열의 선언 & 생성
    int[] a = new int[length];

    // 배열요소를 하나씩 순차적으로 for문으로 접근해보기
    for (int i = 0; i < length; i++) {
      System.out.println(a[i]); // a[0], a[1], a[2], a[3], a[4] 순서대로 호출
    }
  }

  public static void ex03() {
    // 배열의 선언 & 생성
    int[] a = new int[5];

    // 배열의 순회(배열 요소 for문으로 하나씩 접근)
    // 배열의 길이는 '배열명.length'로 알아낼 수 있음
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
  }

  /*
   * 배열의 초기화
   * 1. 배열은 생성하면 자동으로 초기화됨(0(정수), 0.0(실수), false(boolean), null(참조) 값으로 타입에 맞게 초기화)
   * 2. 중괄호({})를 이용해서 초기화 하고자 하는 값을 지정할 수 있음
   * 3. 배열의 초기화는 배열을 선언할 때만 사용 가능
   * 4. 형식
   *    int[] a = {10, 20, 30}; 
   */

  public static void ex04() {
    // 배열의 초기화
    int[] a = { 10, 20, 30 };

    // 배열의 순회
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
  }

  public static void ex05() {
    int day = 14;
    int nDay = 10;
    day += nDay; // 14일로부터 10일 후

    String[] weeknames = { "금", "토", "일", "월", "화", "수", "목" };
    System.out.println(day + "일은 " + weeknames[day % 7] + "요일입니다.");
  }

  /*
   * 배열의 구조
   * 1. 배열의 타입은 참조 타입(reference type)
   * 2. 배열의 모든 요소는 순서대로 메모리의 연속된 공간을 할당받음
   * 
   *    int[] a = {10, 20, 30};
   * 
   *    ┌--------------┐
   *   a│  0x10000000  │
   *    │--------------│
   *    │     ...      │
   *    │--------------│
   *    │      10      │0x10000000
   *    │--------------│
   *    │      20      │0x10000004 //int = 4바이트라서 공간 크기 4바이트 차이
   *    │--------------│
   *    │      30      │0x10000008
   *    └--------------┘
   */

  public static void ex06() {
    // 배열의 선언 & 생성
    int a[] = new int[5];

    // 배열명 확인
    System.out.println(a); // [I@1c4af82c @뒷부분이 배열의 참조값(주소값)

  }

  public static void ex07() {
    // 배열의 초기화
    int[] a = { 10, 20, 30 };
    // 배열의 선언
    int[] b;

    // b에 10, 20, 30을 넣어주려면?
    // 배열 a의 참조 값을 배열 b로 전달하면, 배열 a와 b는 동일한 메모리 공간을 참조할 수 있음
    b = a;

    // 배열 순회
    for (int i = 0; i < b.length; i++) {
      System.out.println(b[i]);
    }

    /*
     *    ┌--------------┐
     *   a│  0x10000000  │---------------
     *    │--------------│              │
     *    │     ...      │              │
     *    │--------------│              │
     *    │      10      │0x10000000    │
     *    │--------------│              │
     *    │      20      │0x10000004    │ b = a;
     *    │--------------│              │
     *    │      30      │0x10000008    │
     *    │--------------│              │
     *    │     ...      │              │
     *    │--------------│              │
     *   b│  0x10000000  │◀-------------
     *    └--------------┘              
     */

  }

  public static void ex08() {
    // 배열이 생성되면 배열의 길이 변경은 불가능
    // 길이를 변경(대부분 늘리는 것)하려면 새로 배열을 만들어서 기존 배열 데이터 가져오면 됨

    // 기존 배열
    int[] a = { 10, 20, 30 };

    // 신규 배열
    int[] b = new int[5];

    // 신규 배열 <- 기존 배열

    //    for (int i = 0; i < a.length; i++) {
    //      b[i] = a[i];
    //    }

    // 더 간단하게 처리하는 법
    System.arraycopy(a, 0, b, 0, a.length); // (기존 배열, 기존배열 시작 인덱스, 목적지 배열, 목적지 배열의 시작 인덱스, 보낼 인덱스 갯수)

    System.out.println("배열 a");
    System.out.println(a);
    System.out.println(Arrays.toString(a));// 배열 a 확인
    System.out.println("배열 b");
    System.out.println(b);
    System.out.println(Arrays.toString(b));// 배열 b 확인

    // 여기까지는 구조적으로 변경 안됨. 기존 배열이 길어지는 게 아니라 걍 내용만 옮겨주는 거니까
    // 완전 해결법 = 기존 배열 a의 참조 값을 새로운 배열 b의 참조 값으로 변경하기
    a = b;

    // 이제 더 이상 배열 a가 참조하던 0x10000000 영역을 참조하는 변수가 없고 a라는 배열 자체가 변경됨
    // 0x10000000 영역(0x10000000, 0x10000004, 0x10000008)은 참조하는 배열이 사라짐 -> 메모리 누수 발생
    // 이런 영역을 c++같은 언어에서는 delete 명령으로 개발자가 직접 메모리를 해제해야 하지만 java는 스스로 메모리를 해제함
    // (garbage collector가 담당 : System.gc())

    System.out.println("배열 a");
    System.out.println(a);
    System.out.println(Arrays.toString(b));// 배열 a 확인

  }

  public static void main(String[] args) {
    //    ex01();
    //    ex02();
    //    ex03();
    //    ex04();
    //    ex05();
    //    ex06();
    ex07();
    //    ex08();
  }

}
