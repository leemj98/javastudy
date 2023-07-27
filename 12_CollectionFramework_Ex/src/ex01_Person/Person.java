package ex01_Person;

public class Person {

  private String name;
  private int age;

  public Person() {
  }

  public Person(String name, int age) {
    super(); //object 호출하는 것 (필요없는데 자동완성으로 맡겨서 만들어진거임)
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person [name=" + name + ", age=" + age + "]";
  }

}
