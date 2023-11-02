package test.main;

import test.mypac.HandPhone;

public class MainClass01 {
	public static void main(String[] args) {
		/*
		 * Phone 클래스를 상속받은 HandPhone 클래스로 객체를 생성해서
		 * 그 참조값을 p1이라는 이름의 지역변수에 담기
		 * 
		 */
		HandPhone p1= new HandPhone();
		/*
		 * 
		 * phone 객체와 HandPhone 객체가 생성되어서 같은 사물함에 들어간다.
		 * 즉 하나의 참조값으로 두개의 기능 모두를 사용할수 있다.
		 */
		p1.call();
		p1.mobileCall();
		p1.takePicture();
	
	}
}
