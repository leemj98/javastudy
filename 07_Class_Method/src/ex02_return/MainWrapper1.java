package ex02_return;

import java.util.Arrays;

public class MainWrapper1 {

  /*
   * ��ȯ(return)
   * 1. �޼ҵ��� ���� ��� ���� �ǹ�
   * 2. ��ȯ���� ���� ��쿡�� void Ű���� �ۼ��ϰ� ��ȯ���� �ִ� ��쿡�� ��ȯ���� Ÿ���� �ۼ�
   */

  public static void main(String[] args) {
    System.out.println(getName());
    System.out.println(getAge());
    System.out.println(isAlive());
    System.out.println(Arrays.toString(getHobbies()));
  }

  public static String[] getHobbies() {
    String[] hobbies = { "����", "����", "��ȭ" };
    return hobbies;
  }

  public static boolean isAlive() {
    boolean isAlive = getAge() <= 100;
    return isAlive;
  }

  public static int getAge() {
    int age = 500;
    return age;
  }
  public static String getName() {
    String name = "ȫ�浿";
    return name; //�޼ҵ带 ȣ���� ������ ��ȯ
  }
}
