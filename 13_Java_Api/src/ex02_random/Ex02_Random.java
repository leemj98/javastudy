package ex02_random;

import java.util.Random;

public class Ex02_Random {

  public static void main(String[] args) {

    /*
     * java.util.Random 클래스
     * 1. 전달된 시드(seed)에 따라서 서로 다른 난수를 발생함
     * 2. 전달된 시드(seed)가 없는 경우에는 현재 시간을 시드(seed)로 사용
     * 3. 동일한 시드(seed)를 사용하면 동일한 난수 발생
     */

    //Random 객체 선언 & 생성
    Random random = new Random();

    //실수
    double randomNumber1 = random.nextDouble(); // 0.0<=n<1.0

    //정수
    int randomNumber2 = random.nextInt(); //Integer.Min_VALUE <= n <=Integer.MAX_VALUE
    int randomNumber3 = random.nextInt(5); // 0 ~ 4 (5개 난수)

    System.out.println(randomNumber1);
    System.out.println(randomNumber2);
    System.out.println(randomNumber3);
  }
}
