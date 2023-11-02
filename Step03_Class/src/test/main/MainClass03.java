package test.main;

import test.mypac.Car;

public class MainClass03 {
	public static void main(String[] args) {
		new Car();// 담아둘 곳이없어 그냥 생성되고 버리는 객체가됨 그냥 참조값이기 때문
		new Car().drive(); //1번사용하고 버림
	  
		Car c1=new Car();
		//지역변수에 담으면 Car type 지역변수에 담아 넣고 필요할때마다 여러번쓸수있다
		c1.drive();
		
		
		
	}
}
