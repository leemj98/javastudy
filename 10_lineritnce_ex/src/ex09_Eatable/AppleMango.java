package ex09_Eatable;

public class AppleMango extends Food implements Eatable {

  public AppleMango(String name) {
    super(name); //슈퍼 클래스의 생성자 호출 public Food{String name){ }, name 받아와서 name을 슈퍼클래스에 전달
  } //상속관계에 있는 자식은 부모가 태어나야 태어날 수 있으니 반드시 부모 호출을 해줘야함

}
