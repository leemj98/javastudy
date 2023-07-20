package ex02_loop;

public class MainWrapper {

  public static void ex01() {
    // 구구단 출력하기
    // 2 x 1 = 2
    // 2 x 2 = 4
    // ...
    // 2 x 9 = 17
    int dan = 2; // 이 곳에 원하는 구구단을 넣으면 된다.

    for (int i = 1; i <= 9; i++) {
      System.out.println(dan + " x " + i + " = " + dan * i);
    }
  }

  public static void ex02() {
    // 100000 넘을 때까지 60원씩 모금하면서 과정 출력하기
    // 1회 모금액 60원, 현재 모금액 60원
    // 2회 모금액 60원, 현재 모금액 120원
    // 3회 모금액 60원, 현재 모금액 180원
    // ...
    // 1667회 모금액 60원, 현재 모금액 100020원
    final int GOAL = 100000; // 목표 모금액
    int money = 60; // 1회당 모금액
    int total = 0; // 모금액 합계
    int nth = 0; // 회차

    while (total <= GOAL) {
      total += money;
      nth++;
      System.out.println(nth + "회 모금액 " + money + "원, 현재 모금액 " + total + "원");
    }

  }

  public static void ex03() {
    // 전체 구구단 출력하기 - 1
    // 2 x 1 = 2
    // ...
    // 9 x 9 = 81

    for (int i = 2; i <= 9; i++) {
      for (int j = 1; j <= 9; j++) {
        System.out.println(i + " x " + j + " = " + i * j);
      }
    }

    // 고정 값을 바깥 LOOP에 배치 (단을 2로 고정시키고 1~9 순회)
  }

  public static void ex04() {
    // 전체 구구단 출력하기 - 2
    // 2x1=2 3x1=3 4x1=4 ... 9x1=9
    // ...
    // 2x9=18 3x9=27 4x9=36 ... 9x9=81

    for (int i = 1; i <= 9; i++) {
      for (int j = 2; j <= 9; j++) {
        System.out.print(j + " x " + i + " = " + String.format("%-4d", j * i) + "\t");
      }
      System.out.println(" ");
    }

    // DAN * N 일 때, N 값이 고정값 => N이 바깥쪽
  }

  public static void ex05() {
    // 삼각별 출력하기 - 1 (2중 loop)
    // *
    // **
    // ***
    // ****
    // *****

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void ex06() {
    // 삼각별 출력하기 - 2 (2중 loop)
    //       star=12345
    // row=1      *****
    // row=2      ****
    // row=3      ***
    // row=4      **
    // row=5      *
    //
    // row=1, star=1~5
    // row=2, star=1~4
    // row=3, star=1~3
    // row=4, star=1~2
    // row=5, star=1~1
    for (int row = 1; row <= 5; row++) {
      for (int star = 1; star <= 6 - row; star++) {
        System.out.print("*");
      }
      System.out.println();
    }

    //    for (int i = 5; i > 0; i--) {
    //      for (int j = i; j > 0; j--) {
    //        System.out.print("*");
    //      }
    //      System.out.println();
    //    }
  }

  public static void ex07() {
    // 삼각별 출력하기 - 3 (2중 loop)
    //       space/star=123456789
    // row=1                *
    // row=2               ***
    // row=3              *****
    // row=4             *******
    // row=5            *********
    //
    // row=1, space=1~4, star=5~5
    // row=2, space=1~3, star=4~6
    // row=3, space=1~2, star=3~7
    // row=4, space=1~1, star=2~8
    // row=5, space=1~0, star=1~9
    for (int row = 1; row <= 5; row++) {
      for (int space = 1; space <= 5 - row; space++) {
        System.out.print(" ");
      }
      for (int star = 6 - row; star <= row + 4; star++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void ex08() {
    // 삼각별 출력하기 - 4 (2중 loop)
    // space/star = 123456789
    //              *********
    //               *******
    //                *****
    //                 ***
    //                  *

    for (int i = 5; i > 0; i--) {
      for (int j = 5 - i; j > 0; j--) {
        System.out.print(" ");
      }
      for (int k = i * 2 - 1; k > 0; k--) {
        System.out.print("*");
      }
      System.out.println();
    }

    for (int row = 0; row < 5; row++) {
      for (int space = 0; space < row; space++) {
        System.out.print(" ");
      }
      for (int star = row; star < 9 - row; star++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    //    ex01();
    //    ex02();
    //    ex03();
    //    ex04();
    //    ex05();
    //    ex06();
    //    ex07();
    ex08();

  }

}