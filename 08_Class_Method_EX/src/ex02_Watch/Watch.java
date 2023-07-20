package ex02_Watch;

/**
 * 시, 분, 초 정보를 가지고 있는 시계 클래스
 * addHour, addMinute, addSecond 메소드를 이용해서 시, 분, 초를 조작할 수 있음
 * @author 홍길동
 * @since 2023.07.20
 * @version 1.0
 * 
 */
public class Watch {

  /**
   * 시간 정보를 필드로 0~23 사이 값을 가짐
   */
  private int hour;

  /**
   * 분 정보를 저장하는 필드로 0 ~ 59 사이 값을 가짐
   */
  private int minute;

  /**
   * 초 정보를 저장하는 필드로 0 ~59 사이 값을 가짐
   */
  private int second;

  //Setter
  public void setHour(int hour) {
    this.hour = hour;
  }

  public void setMinute(int minute) {
    this.minute = minute;
  }

  public void setSecond(int second) {
    this.second = second;
  }

  //Getter
  public int getHour() {
    return hour;
  }

  public int getMinute() {
    return minute;
  }

  public int getSecond() {
    return second;
  }

  /**
   * 필드 hour에 파라미터 param을 더하는 메소드<br>
   * 필드 hour값은 0 ~ 23 사이의 값을 가질 수 있도록 유지해야 함<br>
   * 파라미터 값이 0보다 작거나 같으면 처리하지 않음
   * @param param 증가시킬 시간 정보
   */
  public void addHour(int hour) {
    if (hour <= 0) {
      return;
    }
    this.hour += hour;
    this.hour %= 24;
  }

  /**
   * 필드 minute에 파라미터 param을 더하는 메소드<br>
   * 필드 minute값은 0 ~ 59 사이의 값을 가질 수 있도록 유지해야 함<br>
   * 필드 minute값이 60보다 크거나 같으면 필드 hour값도 증가시켜야 함 <br>
   * 파라미터 값이 0보다 작거나 같으면 처리하지 않음
   * @param param 증가시킬 분 정보
   */
  public void addMinute(int minute) {
    if (minute <= 0) {
      return;
    }
    this.minute += minute;
    addHour(this.minute / 60); // 60넘어가면 그 몫(시간)을 hour로
    this.minute %= 60;
  }

  /**
   * 필드 second에 파라미터 param을 더하는 메소드<br>
   * 필드 second값은 0 ~ 59 사이의 값을 가질 수 있도록 유지해야 함<br>
   * 필드 second값이 60보다 크거나 같으면 필드 minute값도 증가시켜야 함 <br>
   * 파라미터 값이 0보다 작거나 같으면 처리하지 않음
   * @param param 증가시킬 초 정보
   */
  public void addSecond(int second) {
    if (second <= 0) {
      return;
    }
    this.second += second;
    addMinute(this.second / 60);
    this.second %= 60;
  }

}
