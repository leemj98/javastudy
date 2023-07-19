package ex05_access_modifier;

/*
 * ���� ���� ������(Access Modifier)
 * 1. private   : ���� Ŭ���� ���ο����� ���� ����
 * 2. default   : ������ ��Ű�������� ���� ���� (access modifier�� �ۼ����� ���� ���)
 * 3. protected : ������ ��Ű�� or �ٸ� ��Ű���� �ִ� ��� ������ Ŭ������ ���� ����
 * 4. public    : ��𼭵� ���� ����
 */

/*
 * ���� ����(Information Hiding)
 * 1. ��ü�� ���� ���� ����(�ʵ�)�� �ܺο� ���� �������� �ʴ� ��
 * 2. �ܺηκ��� ���� ����(�ʵ�)�� �������ν� ������ �����ϰ� ������ �� ����
 * 3. java������ ���� ������ ���� �ʵ�� private ó���ϰ� �޼ҵ�� public ó��
 * 4. java������ �޼ҵ带 ���ؼ� �ʵ忡 ���� (�ʵ忡 ���� ������ �� ����) 
 */

/*
 * Getter�� Setter(���Ϳ� ����)
 * 1. Getter
 *  1) �ʵ尪�� �ܺη� ��ȯ(return)�ϴ� �޼ҵ�
 *  2) "get + �ʵ��" ������ �̸��� ������ �޼ҵ�
 *  3) �޼ҵ� �̸� ������� �ٲٸ� �� ��
 * 2. Setter
 *  1) �ܺηκ��� �޾� �� ��(�Ķ����)�� �ʵ忡 �����ϴ� �޼ҵ�
 *  2)"set + �ʵ��" ������ �̸��� ������ �޼ҵ�
 *  3) �޼ҵ� �̸� ������� �ٲٸ� �� ��
 * 3. ����. boolean Ÿ���� �ʵ�� Getter/Setter�� �̸� ������ �ٸ���
 */

public class User {

  //field
  private String id;
  private int age;

  //method

  //getter : �ʵ尪�� �ܺη� ��ȯ(return)�ϴ� �޼ҵ�
  public String getId() {
    return id;
  }

  public int getAge() {
    return age;
  }

  //setter : �ܺηκ��� ���޵� ��(�Ķ����)�� �ʵ忡 �����ϴ� �޼ҵ�
  public void setId(String param) {
    id = param;
  }

  public void setAge(int param) {
    age = param;
  }

}
