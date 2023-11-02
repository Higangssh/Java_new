package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass03 {
	public static void main(String[] args) {
		HandPhone p1 =new HandPhone();
		Phone p2=p1; //여기는 객체가 생성되는 것이 아니고 p1에들어 있는 참조값이 p2에 복사되는 것이다.
		Object p3=p1;
		//자식 객체의 잠조값은 부모 type 변수나 필드에 자연스럽게 담긴다.
	}
}
