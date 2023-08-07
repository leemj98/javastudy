package ex01_anonymous_inner_type;

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
		car = new Car() { //인터페이스에 new를 하고 싶으면 메소드를 다 만들어두면 된다
			@Override
			public void addOil() {
				totalOil -= oil;
				earning += oil*payPerLiter;
				System.out.println(model+" "+oil+"L 주유 완료");
			}
		};
		//이런 표기법 너무 복잡해서 나온게 람다식이라함
		
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
