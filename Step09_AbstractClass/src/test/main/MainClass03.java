package test.main;

import test.mypac.Zoo;

public class MainClass03 {
	public static void main(String[] args) {
		Zoo z1=new Zoo();
		Zoo.Monkey m1 =z1.getMonkey();
		m1.say();
	}
}
