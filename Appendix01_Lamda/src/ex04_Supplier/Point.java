package ex04_Supplier;

import java.util.function.Supplier;

public class Point {

	public Point() {
		// TODO Auto-generated constructor stub
	}
	
	public void confirmPoint(Supplier<Integer> supplier) {
		System.out.println("획득 포인트: "+supplier.get());
	}
	
	public static void main(String[] args) {
		Point point = new Point();
		point.confirmPoint(()->(int)(Math.random()*10)); //0~9 사이값을 랜덤으로 반환하는 람다 표현식을 Supplier 파라미터로 전달
	}
}
