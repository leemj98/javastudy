package ex02_lambda;

/*
 * 람다 표현식
 * 1. Anonymous Inner Type 방식의 객체를 생성할 때 사용할 수 있는  표현식
 * 2. 추상 메소드가 하나인 인터페이스에서 람다 표현식을 사용할 수 있음 (이래서 메소드 이름 없어도 분간이 되는거 어차피 하나니까)
 * 		(함수형 인터페이스 : 추상 메소드가 하나인 인터페이스)
 * 3. 형식
 * 		(매개변수) -> {
 * 			본문; }
 * 
 */

/*
 * 람다 표현식 적용 예시
 * 1. 파라미터X, 반환X
 * 		() -> {
 * 			System.out.print("hello world");
 * 		};
 * 
 * 		() -> System.out.print("hello world"); // 메소드 본문이 1줄이면 중괄호 {} 생략 가능
 * 
 * 2. 파라미터O, 반환X (파라미터의 타입은 생략한다 (할수있다가 아니라 무조건)
 * 		(name) -> {
 * 			System.out.print("hello"+name);
 * 		};
 * 
 * 		(name) -> System.out.print("hello"+name); 
 * 
 * 3. 파라미터X, 반환O (반환 타입은 생략한다)
 *    () -> {
 *    	String name = "tom";
 *    	return name;
 *    };
 *    
 *    () -> "tom"; // return "tom" 이랑 똑같음. 메소드에 return만 있으면 return 생략
 *    
 * 4. 파라미터O, 반환O
 * 		// 이름을 전달하면 "님을 붙여서 출력하고 해당 값을 반환하는 함수
 * 	  (name) -> {
 * 			String retVal = name+"님"; 
 * 			System.out.println(retVal);
 * 			return retVal;
 * 		};
 * 
 * 		// 정수 값을 전달하면 해당 값보다 1이 큰 수를 반환하는 함수
 * 		(n) -> n+1;
 * 
 *    
 * 
 */

public class GasStation {

	private int totalOil;
	private int payPerLiter; //리터당요금
	private int earning; //번 돈
	
	public GasStation() {

	}
	
	public void sellOil(String model, int oil) {
		//Car인터페이스의 addOil이 동작해서 sellOil이 완성되도록
		// Car인터페이스 구현한 별도 클래스 만들고 해당 클래스 객체를 만들고, 해당 객체에 addOil() 호출해서 처리 
		
		// Car car 지역변수(객체) 선언 (sellOil 메소드 호출 시 생성되고, sellOil 메소드 종료 시 소멸)
		Car car;
		
		// car 지역변수(객체) 생성 (addOil 메소드가 들어있음)
		// 람다식으로 Car 인터페이스 타입의 객체 생성
	  car = () -> {
	  	totalOil -= oil;
	  	earning += oil*payPerLiter;
	  	System.out.println(model+" "+oil+"L 주유 완료");  	
	  };
		
		// Car car 지역변수(객체)의 addOil() 메소드 호출
		car.addOil();
	}
			
	public int getTotalOil() {
		return totalOil;
	}
	public void setTotalOil(int totalOil) {
		this.totalOil = totalOil;
	}
	public int getPayPerLiter() {
		return payPerLiter;
	}
	public void setPayPerLiter(int payPerLiter) {
		this.payPerLiter = payPerLiter;
	}
	public int getEarning() {
		return earning;
	}
	public void setEarning(int earning) {
		this.earning = earning;
	}
	
	
	
}

/*
 * 함수형 프로그래밍
 * function abc() {
 * } JS의 함수
 * abc = () -> {
 * }  
 */
