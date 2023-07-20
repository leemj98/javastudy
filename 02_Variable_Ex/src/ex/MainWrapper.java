package ex;

public class MainWrapper {

  public static void main(String[] args) {

    // 초 -> 분/초
    int second = 90;
    int m = second / 60; // 1
    int s = second % 60; // 30
    System.out.println(second + "초는" + m + "분 " + s + "초입니다");

    // x와 y값을 교환
    int x = 10;
    int y = 20;
    int temp = x;
    x = y;
    y = temp;
    System.out.println(x);
    System.out.println(y);

    // 5% 이자 받으면 통장잔액 얼마?(소수 이하는 버림)
    long balance = 123456L; // 통장잔액
    double pct = 0.05; // 5%
    // balance = balance * 1 + balance * pct; //타입 안맞아서 오류 '='기준 왼쪽은 long, 오른쪽은 double
    // balance = balance * (1+pct); //타입 안맞아서 오류 이유는 같음 (long)(balance)*(1+pct))
    balance *= (1 + pct); // 위의 식 줄인것, 위는 실수가 먼저 나온 상태로 정수 파트로 넘기는 구조라 오류고 이건 자동 변환될 수 있게 항이 두개인거라서 오류 안남
    System.out.println(balance);

    // 90점대 점수이면 true, 아니면 false
    int score1 = 95;
    boolean result1 = (score1 >= 90) && (score1 < 100); // true
    int score2 = 75;
    boolean result2 = (score2 / 10) == 9; // false
    System.out.println(result1);
    System.out.println(result2);

    // n의 "짝수", "홀수" 여부 출력
    int n = 3;
    String res1 = (n % 2) == 0 ? "짝수" : "홀수"; // "홀수"
    System.out.println(res1);

    // num의 "짝수", "홀수", "3의배수" 여부 출력
    int num = 3;
    String res2 = (num != 0) && (num % 3 == 0) ? "3의 배수" : (num % 2) == 0 ? "짝수" : "홀수"; // "3의배수"
    System.out.println(res2); // 0도 3으로 나누면 나머지 0으로 계산됨, 3을 0으로 나누면 오류

  }

}