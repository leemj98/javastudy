package ex03_functional_interface;

import java.util.jar.Attributes.Name;

public class MainWrapper {

	public static void ex01() {  // 파라미터X, 반환X
		// Anonymous inner type 생성
		MyInterface1 interface1 = new MyInterface1() {
			@Override
			public void method1() {
				System.out.println("hello world");
			}
		};
		
		// method1() 호출
		interface1.method1();
	}
	
	public static void ex02() {//ex01 람다식으로 작성 
		// 람다 표현식으로 생성
		MyInterface1 interface1 = () -> System.out.println("hello world");
		
		// method1() 호출
		interface1.method1();
	}
	
	public static void ex03() {//파라미터O, 반환X
		MyInterface2 interface2 = new MyInterface2() {
			
			@Override
			public void method2(String name) {
				System.out.println(name+"님");
			}
		};
		
		interface2.method2("홍길동");
	}
	
	public static void ex04() {//ex03 람다식으로 작성
		MyInterface2 interface2 = (name) -> System.out.println(name+"님");
		
		interface2.method2("홍길동");
	}
	
	public static void ex05() {
		Myinterface3 interface3 = new Myinterface3() {
			
			@Override
			public String method3() {
				return "hello world";
			}
			
			
		};
		String str = interface3.method3();
		System.out.println(str);
	}
	public static void ex06() {
		Myinterface3 interface3 = () -> "hello world";
		
		String str = interface3.method3();
		System.out.println(str);
	}
	public static void ex07() {
		MyInterface4 interface4 = new MyInterface4() {
			
			@Override
			public String method4(String name) {
				return name+"님";
			}
		};
		
		String str = interface4.method4("홍길동"); 
		System.out.println(str);		
	}
	public static void ex08() {
		MyInterface4 interface4 = (name) -> name+"님";
		
		String str = interface4.method4("홍길동"); 
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		ex01(); // 파라미터X, 반환X
		ex02(); //ex01 람다식으로 작성 
		ex03(); //파라미터O, 반환X
		ex04(); //ex03 람다식으로 작성
		ex05(); //파라미터X, 반환O
		ex06(); //ex05 람다식으로 작성  
		ex07(); //파라미터O, 반환O
		ex08(); //ex07 람다식으로 작성
	}
}
