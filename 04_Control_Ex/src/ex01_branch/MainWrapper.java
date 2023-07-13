package ex01_branch;

public class MainWrapper {

  public static void ex01() {
    // ������ ���� ����(if��)
    int score = 100;
    char grade; // 'A', 'B', 'C', 'D', 'F'

    if (score > 90 && score <= 100) {
      grade = 'A';
    } else if (score > 80) { // && score <= 90 ����� �� (������ üũ�����ϱ�)
      grade = 'B';
    } else if (score > 70) {
      grade = 'C';
    } else if (score > 60) {
      grade = 'D';
    } else {
      grade = 'F';
    }
    System.out.println(score + "���� " + grade + "�����Դϴ�");
  }

  public static void ex02() {
    // ������ ���� ����(switch��)
    int score = 100;
    char grade; // 'A', 'B', 'C', 'D', 'F'

    switch (score / 10) {
    case 10:
    case 9:
      grade = 'A'; // 10, 9�� ����� ���Ƽ� 10�� ���๮�̶� break �Ⱦ�
      break;
    case 8:
      grade = 'B';
      break;
    case 7:
      grade = 'C';
      break;
    case 6:
      grade = 'D';
      break;
    default:
      grade = 'F';
      break;
    }
    System.out.println(score + "���� " + grade + "�Դϴ�");
  }

  public static void ex03() {
    // ������ �г⿡ ���� ����
    // 1~3�г� : 60�� �̻� �հ�, �ƴϸ� ���հ�
    // 4~6�г� : 70�� �̻� �հ�, �ƴϸ� ���հ�
    int score = 60; // ����
    int scYear = 3; // �г�
    String pass = null; // "�հ�", "���հ�"

    for (int i = 0; i < 6; i++) {
      if (scYear < 4) {
        if (score >= 60) {
          pass = "�հ�";
        } else {
          pass = "���հ�";
        }
      } else {
        if (score >= 70) {
          pass = "�հ�";
        } else {
          pass = "���հ�";
        }
      }
    }

//    if (scYear >= 1 && scYear <= 3) {
//      if (score >= 60) {
//        pass = "�հ�";
//      } else {
//        pass = "���հ�";
//      }
//    } else if (scYear >= 4 && scYear <= 6) {
//      if (score >= 70) {
//        pass = "�հ�";
//      } else {
//        pass = "���հ�";
//      }
//    }
    System.out.println(scYear + "�г� " + score + "���� " + pass);
  }

  public static void ex04() {
    // �޴��� ���� ����
    // �Ƹ޸�ī�� : 2000
    // ī��� : 2500
    // ��ũƼ : 3000
    // ��Ÿ : 5000
    String order = "�Ƹ޸�ī��";
    int price = 0;

    switch (order) {
    case "�Ƹ޸�ī��":
      price = 2000;
      break;
    case "ī���":
      price = 2500;
      break;
    case "��ũƼ":
      price = 3000;
      break;
    case "��Ÿ":
      price = 5000;
      break;
    default:
      break;
    }

    System.out.println(order + "�� " + price + "�� �Դϴ�.");
  }

  public static void ex05() {
    // ���� ���� ����
    // 3 ~ 5 : ��
    // 6 ~ 8 : ����
    // 9 ~ 11: ����
    // 12 ~ 2: �ܿ�
    int month = 7;
    String season; // "��", "����", "����", "�ܿ�"

    if (month >= 3 && month <= 5) {
      season = "��";
    } else if (month >= 6 && month <= 8) {
      season = "����";
    } else if (month >= 9 && month <= 11) {
      season = "����";
    } else {
      season = "�ܿ�";
    }
    System.out.println(month + "���� " + season + "�Դϴ�");

    // ���ڿ��� ==�� ���� �� ���� ������ if�� �ۼ� x (equals()�� ���� �ȴ���)
  }

  public static void ex06() {
    // ���� ���� �б�
    // 1 ~ 3 : 1�б�
    // 4 ~ 6 : 2�б�
    // 7 ~ 9 : 3�б�
    // 10 ~ 12 : 4�б�
    int month = 7;
    int quarter = 0;

    if (month >= 1 && month <= 3) {
      quarter = 1;
    } else if (month >= 4 && month <= 6) {
      quarter = 2;
    } else if (month >= 7 && month <= 9) {
      quarter = 3;
    } else {
      quarter = 4;
    }
    System.out.println(month + "���� " + quarter + "�б� �Դϴ�");
  }

  public static void ex07() {
    // 10�� �� ������?
    int day = 13; // 13���� �����
    int nDay = 1; // 10��
    String weekname = null; // "��", "ȭ", "��", "��", "��", "��", "��"

    switch ((day + nDay) % 7) {
    case 1:
      weekname = "�����";
      break;
    case 2:
      weekname = "�Ͽ���";
      break;
    case 3:
      weekname = "������";
      break;
    case 4:
      weekname = "ȭ����";
      break;
    case 5:
      weekname = "������";
      break;
    case 6:
      weekname = "�����";
      break;
    case 0:
      weekname = "�ݿ���";
      break;
    }
    System.out.println(day + "�Ͽ��� " + nDay + "�� ���� ������ " + weekname + "�Դϴ�");

  }

  public static void ex08() {
    // ��ҹ��� ��ȯ (���۸����� �ƽ�Ű�ڵ� �˻� �� ����)
    char ch = 'A'; // ������ �빮�� �Ǵ� �ҹ���
    ch += 32; // 32 �����ָ� �ҹ���, ���ָ� �빮��
    System.out.println(ch);
  }

  public static void main(String[] args) {
//    ex01();
//    ex02();
//    ex03();
//    ex04();
//    ex05();
//    ex06();
    ex07();
//    ex08();
  }

}