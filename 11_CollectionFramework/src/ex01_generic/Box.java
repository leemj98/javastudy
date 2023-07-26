package ex01_generic;

public class Box<T> { //T = type (어떤 타입이든 온다는 뜻으로 지어준 변수) 

  private T item;

  public T getItem() {
    return item;
  }

  public void setItem(T item) {
    this.item = item;
  }


}
