package ex03_functional_interface;

/*
 * @FunctinalInterface
 * 1. 함수형 인터페이스에 작성하는 Annotation
 * 2. 추상 메소드를 하나만 가진 인터페이스에 작성할 수 있음 (두 개 이상&없음 -> 오류)
 * 3. 람다 표현식으로 객체를 생성할 수 있는 인터페이스
 */

@FunctionalInterface
public interface MyInterface1 {

	void method1();
	
}
