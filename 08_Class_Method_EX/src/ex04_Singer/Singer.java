package ex04_Singer;


public class Singer {

  private String name;
  private Song titleSong;

  //Setter
  public void setName(String name) {
    this.name = name;
  }

  public void setTitleSong(Song titleSong) {
    this.titleSong = titleSong;
  }

  //info
  public void info() {
    System.out.println("이름: " + name);
    titleSong.info(); //private Song titleSong;이니까 song.info 불러온 거랑 똑같
  }
}
