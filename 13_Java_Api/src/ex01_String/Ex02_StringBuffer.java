package ex01_String;

public class Ex02_StringBuffer {

  public static void main(String[] args) {
    /*
     * java.lang.StringBuffer 클래스
     * 1. JDK 1.0부터 사용 가능 (자바 만들어졌을 때부터)
     * 2. String을 연결하는 클래스 (문자열 연결 연산자 +를 대체하는 클래스, +는 메모리 소비가 심해서)
     * 3. synchronized(동기화) 처리되어 멀티스레드 환경에서 사용할 수 있음
     * 4. 동작 느림 (3번 이유로)
     * 5. String 클래스에 비해서 메모리 낭비가 적음
     */
    
    // StringBuffer 객체 선언
    StringBuffer sb;
    
    // StringBuffer 객체 생성
    sb = new StringBuffer();
    
    // append 메소드를 이용한 문자열 연결
    sb.append("ha");
    sb.append("va"); // +라면 hava같은 중간과정도 다 저장돼서 메모리 소비 심함
    sb.append("na"); // 반복적으로 연결되는 경우에는 빌더나 버퍼 사용
    
    // StringBuffer 객체에 저장된 문자열을 String으로 변환
    String str = sb.toString();
    System.out.println(str);
  }
}
