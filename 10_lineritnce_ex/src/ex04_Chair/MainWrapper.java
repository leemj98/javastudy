package ex04_Chair;

public class MainWrapper {
  public static void main(String[] args) {
    Chair chair1 = new Chair();
    chair1.setPerson(new Student("홍길동", "가산대학교")); //의자에 첫번째 사람 앉히기
    chair1.getPerson().info();

    Chair chair2 = new Chair();
    chair2.setPerson(new Alba("고길동", "가산대학교", "투썸")); //의자에 두번째 사람 앉히기
    chair2.getPerson().info();
  }
}

// 서로 다른 타입을 하나의 타입으로 저장하는 방법은 상속밖에없음
// 업캐스팅 = 상속에서 제일 중요