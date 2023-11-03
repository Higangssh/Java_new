package test.main;

import test.mypac.Weapon;

public class MainClass06 {
	public static void main(String[] args) {
		
		Weapon w1 = new Weapon() {

			@Override
			public void attack() {
				System.out.println("오잉");
				
			}
			//class 다 , 이름이 없는 익명 클래스 extend Weapon 된 클래스 new Weapon()은 익명 클래스의 생성자를 call 하는 표현식
		};
		
		
		useWeapon(w1);
		useWeapon(new Weapon() {
			
			@Override
			public void attack() {
				System.out.println( "네네");
				
			}
		});
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
		w.attack();
	}
}
