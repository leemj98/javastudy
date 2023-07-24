package ex02_has_a;

public class Remocon {

  private int ch; // 0~MAX_CH
  private int vol; // 0~MAX_VOL
  private final int MAX_CH = 99;
  private final int MAX_VOL = 10;

  public void upCh() {
    if (ch == MAX_CH) {
      ch = 0; //99번 도달하면 다시 0으로
      return;
    }
    ch++;
  }

  public void downCh() {
    if (ch == 0) {
      ch = MAX_CH;
      return;
    }
    ch--;
  }

  public void upVol() {
    if (vol == MAX_VOL) { //최대 볼륨 도달하면 더이상 못올림
      return;
    }
    vol++;
  }

  public void downVol() {
    if (vol == MAX_VOL) {
      return;
    }
    vol--;
  }

  public int getCh() {
    return ch;
  }

  public void setCh(int ch) {
    this.ch = ch;
  }

  public int getVol() {
    return vol;
  }

  public void setVol(int vol) {
    this.vol = vol;
  }

}
