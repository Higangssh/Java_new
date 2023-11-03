package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

/*
 * Class 예약어 앞에 abstract 를 명시해서 클래스를 정의한다.
 * 형태만 정의되고 실제 구현은 되지 않는 메소드가 존재할 수 있다.
 * 형태만 정의된 메소드를 만들떄는 abstract 예약어를 붙어서 메소드를 정의한다
 * 생성자는 존재하지만 단독으로 객체 생성은 불가하다
 * 추상클래스는 Type 의 참조값이 필요하다면 추상클래스를 상복받은
 * 자식클래스를 정의해서 객체 생성한다
 * 추상클래스를 상속받은 자식클래스는 부모의 추상메소드를 모두 오보라이딩 해야한다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		
		//추상클래스는 단독으로 객체 생성불가
		//Weapon w1=new Weapon();
		Weapon w1 = new MyWeapon();
		w1.prepare();
		w1.attack();
	}
}
