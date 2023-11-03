package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass02 {

	public static void main(String[] args) {
		MainClass02.useString("abcd");
		useString("abcd1234");
		
	
		useWeapon(new MyWeapon());
		
		System.out.println("main 메소드가 종료됩니다");
	}	
		
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
	
	public static void useString(String msg) {
		
		System.out.println(msg+"길이:" + msg.length());
		
	}
}
