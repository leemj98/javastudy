package ex05_access_modifier;

public class MainWrapper {

  public static void main(String[] args) {

    // User ��ü(��ü�� u) ������
    User u = new User();

    // User ��ü�� ������ ����
    u.setId("admin");
    u.setAge(30); // 30�� User.java���� setAge �Ķ���� ���ļ� age �ʵ�� ����

    // User ��ü�� ������ Ȯ��
    System.out.println(u.getId());
    System.out.println(u.getAge());
  }

}
