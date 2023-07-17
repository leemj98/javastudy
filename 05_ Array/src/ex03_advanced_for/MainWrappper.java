package ex03_advanced_for;

import java.util.Arrays;

public class MainWrappper {

  // 1차원 배열의 advanced-for문
  public static void ex01() {
    // 1차원 배열의 초기화
    int[] a = { 10, 20, 30 };
    // advanced-for
    for (int number : a) { //    for(배열요소를 저장할 변수: 배열명)
      System.out.println(number);
    } // 배열 a의 모든 요소를 순차적으로 number로 넘김 (인덱스를 적지 않음) 
  }

  // advanced-for문을 사용하지 못하는 대표적인 경우 : 배열요소의 값이 변하는 경우
  public static void ex02() {
    // 1차원 배열의 초기화
    int[] a = { 10, 20, 30 };

    // 모든 배열요소를 1씩 증가시키기 -1 : advanced-for(불가능)
    for (int number : a) {
      number++;
    }

    // 배열 요소 확인
    System.out.println(Arrays.toString(a)); // 11,21,31이 나와야 정상인데 10,20,30 그대로 
    // 향상 for문은 배열 요소를 그대로 쓰지 않고 복사해서 쓰는 것이기 때문. number의 값이 증가한거지 배열원본이 증가하지는 않음

    // 모든 배열요소를 1씩 증가시키기 -2 : 일반 for문 (가능)
    for (int i = 0; i < a.length; i++) {
      a[i]++;
    }
    System.out.println(Arrays.toString(a)); // 11,21,31이 나옴
  }

  // 2차원 배열의 advanced-for문
  public static void ex03() {
    int[][] a = { { 10, 20 }, { 30, 40 }, { 50, 60 } };

    //advanced-for
    for (int[] b : a) {
      for (int number : b) {
        System.out.print(String.format("%4d", number));
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    //    ex01();
    ex02();
    //    ex03();

  }

}
