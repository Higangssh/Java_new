package test.auto;

public class SportsCar extends Car {

	public SportsCar(Engine engine) {
		
		//super () 부모생성자(Car 클래스의 생성자)를 의미한다.
		//부모 생성자에 필요한 값을 자식 생성자에서 받아서 전달해야 한다.
		//super()코드 실행전에 다른 코드가 있으면 안된다.
		super(engine); 
		
	}
	
	public void openDrive() {
	
		if(this.engine==null) {
			System.out.println("Engine 이 없어서 달릴수가 없어요!");
			return;
		}
		System.out.println("뚜껑을 열고 달려요!");
	}
	
}
