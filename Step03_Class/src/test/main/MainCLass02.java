package test.main;

import test.mypac.Car;

public class MainCLass02 {
	public static void main(String[] args) {
		//Car 클래스로 객체를 생성해서 참조값을 car1 이라는 Car type 지역변수에 담기
		Car car1=new Car();
		//Car 클래스로 객체를 생성해서 참조값을 car2 라는 car type 지역변수에 담기
		Car car2=new Car();
		
		car1.name="소나타";
		car2.name="그랜저";
		
		car1.drive();
		car2.drive();
		boolean result = car1 == car2; //false 다른객체임 참조값이 다름
		Car car3=car2;
		car3.drive(); // 키값이 값아서 car2가 복사됨 그랜저가 달린다 car2 == car3불리언도 같다
		
	}
}
