package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass04 {
	public static void main(String[] args) {
		Object p3=new HandPhone();
		// casting 연산자이용해서 대입연사자의 우측을 phone type 으로 인식 되도록 한다.
		Phone p2=(Phone)p3;
	}
}
