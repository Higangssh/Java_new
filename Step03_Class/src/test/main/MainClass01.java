package test.main;
//다른 패키지의 클래스를 사용할때는 import 를 해야한다.
import test.mypac.Car;

public class MainClass01 {
	public static void main(String[] args) {
		//test.mypac.car 클래스로 객체를 생성하고 생성된 객체이 참조값을 car1 이라는 지역변수에 담기
		Car car1= new Car();
		car1.drive();
		//필드에 저장된값 참조
		String a = car1.name;
		car1.name = "소나타";
		String b = car1.name;
	}
}
