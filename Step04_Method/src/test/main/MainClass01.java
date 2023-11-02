package test.main;

import test.mypac.AirPlane;
import test.mypac.Test;

public class MainClass01 {
	public static void main(String[] args) {
		Test t = new Test();
		t.walk();
		int a=t.getNumber();
		String b=t.getGreeting();
		AirPlane c=t.getPlane();
		c.fly();
		int d=10;
		t.setNum(d);
		String e="손상희";
		t.setName(e);
		AirPlane f= new AirPlane();
		t.setPlane(f);
	}
}
