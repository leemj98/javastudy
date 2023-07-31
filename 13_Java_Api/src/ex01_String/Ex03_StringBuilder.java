package ex01_String;

public class Ex03_StringBuilder {

  public static void main(String[] args) {
    /*
     * java.lang.StringBuilder 클래스
     * 1. JDK 1.5부터 사용 가능
     * 2. String을 연결하는 클래스 (문자열 연결 연산자 +를 대체하는 클래스, +는 메모리 소비가 심해서)
     * 3. synchronized(동기화) 처리가 되지 않아서 싱글스레드 환경에서 사용할 수 있음
     * 4. StringBuffer에 비해 동작 빠름 (버퍼가 느려서 3번 동기화 없애고 싱글로 바꿔 나온거)
     * 5. String 클래스에 비해서 메모리 낭비가 적음
     */
    
    // StringBuilder 객체 선언
    StringBuilder sb;

    // StringBuilder 객체 생성
    sb = new StringBuilder();

    // append 메소드를 이용한 문자열 연결
    sb.append("ha");
    sb.append("va"); // +라면 hava같은 중간과정도 다 저장돼서 메모리 소비 심함
    sb.append("na"); // 반복적으로 연결되는 경우에는 빌더나 버퍼 사용
    
    // StringBuilder 객체에 저장된 문자열을 String으로 변환
    String str = sb.toString();
    System.out.println(str);
  }
}
