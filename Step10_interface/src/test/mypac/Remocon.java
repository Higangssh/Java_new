package test.mypac;

/*
 * 
 * 
 * [interface]
 * -생성자가 없다 (단독 객체 생성불가)
 * -구현된 메소드는 가질수 없다 only 추상메소드
 * -필드늠 static final 상수만 가질수 있다.
 * -data type 의 역할을 한다.
 * -interface type 의 참조값이 필요하면 구현(implements) 클래스를 만들어서 객체를 생성해야한다
 * 클래스는 상속인 단일 상속이지만 , 인터페이스는 다중구현 가능하다.

 * 
 */
public interface Remocon {
	public String COMPANY="LG";
	public void up();
	public void down();
	
}
