package ex04_Library;

import java.util.Objects;

public class Book {

  private String title;
  private int price;

  // new Book()
  public Book() {
    // TODO Auto-generated constructor stub
  }

  //new Book("좋은생각"), 무료책
  public Book(String title) {
    this(title, 0); //파라미터가 두개인 다른 생성자 호출(public Book(String title, int price)), 좋은 생각 제목이랑 가격 전달
  }

  //new Book("어린왕자", 10000)
  public Book(String title, int price) {
    super();
    this.title = title;
    this.price = price;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Book [title=" + title + ", price=" + price + "]";
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, title);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Book other = (Book) obj;
    return price == other.price && Objects.equals(title, other.title);
  }

}
