package ex;

import java.util.Arrays;

public class MainWrapper3 {
  // 참조타입을 전달할 때 (웹 개발에서 대부분의 인수와 파라미터가 참조타입임)
  // 매개변수에서 수정해도 다 수정됨

  public static void ex01(int[] a) {
    System.out.println(Arrays.toString(a)); // int[] a = 0x10000000
    a[0] = 100;
    System.out.println("ex01의 배열 a = " + Arrays.toString(a));
  }

  public static void main(String[] args) {
    int[] a = { 10, 20, 30 };
    ex01(a); // a 참조값: 0x10000000
    System.out.println("main의 배열 a = " + Arrays.toString(a));
  }
}
