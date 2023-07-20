package ex01_branch;

public class MainWrapper {

  public static void ex01() {
    // 점수에 따른 학점(if문)
    int score = 100;
    char grade; // 'A', 'B', 'C', 'D', 'F'

    if (score > 90 && score <= 100) {
      grade = 'A';
    } else if (score > 80) { // && score <= 90 안적어도 됨 (위에서 체크했으니까)
      grade = 'B';
    } else if (score > 70) {
      grade = 'C';
    } else if (score > 60) {
      grade = 'D';
    } else {
      grade = 'F';
    }
    System.out.println(score + "점은 " + grade + "학점입니다");
  }

  public static void ex02() {
    // 점수에 따른 학점(switch문)
    int score = 100;
    char grade; // 'A', 'B', 'C', 'D', 'F'

    switch (score / 10) {
    case 10:
    case 9:
      grade = 'A'; // 10, 9는 결과가 같아서 10에 실행문이랑 break 안씀
      break;
    case 8:
      grade = 'B';
      break;
    case 7:
      grade = 'C';
      break;
    case 6:
      grade = 'D';
      break;
    default:
      grade = 'F';
      break;
    }
    System.out.println(score + "점은 " + grade + "입니다");
  }

  public static void ex03() {
    // 점수와 학년에 따른 학점
    // 1~3학년 : 60점 이상 합격, 아니면 불합격
    // 4~6학년 : 70점 이상 합격, 아니면 불합격
    int score = 60; // 점수
    int scYear = 3; // 학년
    String pass = null; // "합격", "불합격"

    for (int i = 0; i < 6; i++) {
      if (scYear < 4) {
        if (score >= 60) {
          pass = "합격";
        } else {
          pass = "불합격";
        }
      } else {
        if (score >= 70) {
          pass = "합격";
        } else {
          pass = "불합격";
        }
      }
    }

//    if (scYear >= 1 && scYear <= 3) {
//      if (score >= 60) {
//        pass = "합격";
//      } else {
//        pass = "불합격";
//      }
//    } else if (scYear >= 4 && scYear <= 6) {
//      if (score >= 70) {
//        pass = "합격";
//      } else {
//        pass = "불합격";
//      }
//    }
System.out.println(scYear + "학년 " + score + "점은 " + pass);
  }

  public static void ex04() {
    // 메뉴에 따른 가격
    // 아메리카노 : 2000
    // 카페라떼 : 2500
    // 밀크티 : 3000
    // 기타 : 5000
    String order = "아메리카노";
    int price = 0;

    switch (order) {
    case "아메리카노":
      price = 2000;
      break;
    case "카페라떼":
      price = 2500;
      break;
    case "밀크티":
      price = 3000;
      break;
    case "기타":
      price = 5000;
      break;
    default:
      break;
    }

    System.out.println(order + "는 " + price + "원 입니다.");
  }

  public static void ex05() {
    // 월에 따른 계절
    // 3 ~ 5 : 봄
    // 6 ~ 8 : 여름
    // 9 ~ 11: 가을
    // 12 ~ 2: 겨울
    int month = 7;
    String season; // "봄", "여름", "가을", "겨울"

    if (month >= 3 && month <= 5) {
      season = "봄";
    } else if (month >= 6 && month <= 8) {
      season = "여름";
    } else if (month >= 9 && month <= 11) {
      season = "가을";
    } else {
      season = "겨울";
    }
    System.out.println(month + "월은 " + season + "입니다");

    // 문자열은 ==로 비교할 수 없기 때문에 if로 작성 x (equals()를 쓰면 된다함)
  }

  public static void ex05_2() {
    // 월에 따른 계절 월%12
    // 3 ~ 5 : 봄 3~5
    // 6 ~ 8 : 여름 6~8
    // 9 ~ 11: 가을 9~11
    // 12 ~ 2: 겨울 0~2
    int month = 7;
    int mod = month % 12;
    String season; // "봄", "여름", "가을", "겨울"

    if (mod <= 2) {
      season = "겨울";
    } else if (mod <= 5) {
      season = "봄";
    } else if (mod <= 8) {
      season = "여름";
    } else {
      season = "가을";
    }
    System.out.println(month + "월은 " + season + "입니다");

    // 문자열은 ==로 비교할 수 없기 때문에 if로 작성 x (equals()를 쓰면 된다함)
  }

  public static void ex06() {
    // 월에 따른 분기
    // 1 ~ 3 : 1분기
    // 4 ~ 6 : 2분기
    // 7 ~ 9 : 3분기
    // 10 ~ 12 : 4분기
    int month = 7;
    int quarter = 0;

    if (month <= 3) {
      quarter = 1;
    } else if (month <= 6) {
      quarter = 2;
    } else if (month <= 9) {
      quarter = 3;
    } else {
      quarter = 4;
    }
    System.out.println(month + "월은 " + quarter + "분기 입니다");
  }

  public static void ex06_2() {
    // 월에 따른 분기 분기 계산
    // 1 ~ 3 : 1분기 (month -1) /3 + 1 = 1
    // 4 ~ 6 : 2분기 (month -1) /3 + 1 = 2
    // 7 ~ 9 : 3분기 (month -1) /3 + 1 = 3
    // 10 ~ 12 : 4분기 (month -1) /3 + 1 = 4
    int month = 7;

    System.out.println((month - 1) / 3 + 1 + "분기 입니다");
  }

  public static void ex07() {
    // 10일 후 요일은?
    int day = 13; // 13일은 목요일
    int nDay = 1; // 10일
    String weekname = null; // "월", "화", "수", "목", "금", "토", "일"

    switch ((day + nDay) % 7) {
    case 1:
      weekname = "토요일";
      break;
    case 2:
      weekname = "일요일";
      break;
    case 3:
      weekname = "월요일";
      break;
    case 4:
      weekname = "화요일";
      break;
    case 5:
      weekname = "수요일";
      break;
    case 6:
      weekname = "목요일";
      break;
    case 0:
      weekname = "금요일";
      break;
    }
    System.out.println(day + "일에서 " + nDay + "일 후는 " + weekname + "입니다");
    // 배열로 스위치없이 풀수도 있음 (05_Array ex01 - ex05)
  }

  public static void ex08() {
    // 대소문자 변환 (구글링으로 아스키코드 검색 후 참고)
    char ch = 'A'; // 임의의 대문자 또는 소문자
//    if (ch>=65 && ch <90) {
    //      //대문자 범위에 속하는지 검사
//      ch+=32;
//    } else if (ch>=97 && ch <122) {
//      // 소문자 범위에 속하는지 검사
//      ch-=32;
//    }

    if (ch >= 'A' && ch < 'Z') {
      // 대문자 범위에 속하는지 검사
      ch += 32;
    } else if (ch >= 'a' && ch < 'z') {
      // 소문자 범위에 속하는지 검사
      ch -= 32;
    }
    System.out.println(ch);
  }

  public static void main(String[] args) {
//    ex01();
//    ex02();
//    ex03();
//    ex04();
//    ex05();
//    ex05_2();
//    ex06();
//    ex06_2();
    ex07();
//    ex08();
  }

}