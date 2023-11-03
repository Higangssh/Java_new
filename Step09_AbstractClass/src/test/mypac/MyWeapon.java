package test.mypac;

public class MyWeapon extends Weapon {
	
	//부모 클래스의 추상메소드를 반드시 오버라이드 해야한다
	
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("지상 공격을 해요!");
	}
	

}
